package com.dp.weipay.api;

import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dp.persistence.dto.base.HttpResult;
import com.dp.weipay.service.PayService;

public class BaseController {

	@Autowired
	private PayService payService;

	protected static final Logger log = LoggerFactory.getLogger(BaseController.class);

	@SuppressWarnings("unchecked")
	protected HttpResult<Object> unifyPayController(HttpServletRequest request, HttpServletResponse response) {

		HttpResult<Object> httpResult = new HttpResult<Object>();
		try {
			String servletPath = request.getServletPath();
			int lastIndexOf = servletPath.lastIndexOf("/");
			String methodName = servletPath.substring(lastIndexOf + 1);
			log.info("应执行的方法: {}", methodName);

			Method declaredMethod = payService.getClass().getDeclaredMethod(methodName, HttpServletRequest.class);

			Thread.currentThread().setName(methodName);
			declaredMethod.setAccessible(true);
			Object resultMap = (Map<String, Object>) declaredMethod.invoke(payService, request);
			log.info("方法执行结果: {}", resultMap);

			if (null != resultMap) {
				httpResult.setStatus(HttpServletResponse.SC_OK);
				httpResult.setResult(resultMap);
			} else {
				httpResult.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			}
		} catch (Exception e) {
			log.error("unifyPayController Exception: {}", e.getMessage());
		}
		return httpResult;
	}

}
