package com.dp.weipay.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dp.common.enums.CharSets;
import com.dp.common.utils.HttpUtil;
import com.dp.common.utils.PropertyUtil;

public class BaseService {

	private static final List<Header> headers = new ArrayList<Header>();
	static {
		// 封装通用请求头
		headers.add(new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/xml"));
		headers.add(new BasicHeader(HttpHeaders.ACCEPT, "application/json"));
		headers.add(new BasicHeader(HttpHeaders.ACCEPT_CHARSET, CharSets.UTF8));
	}

	protected static final Logger log = LoggerFactory.getLogger(BaseService.class);

	protected Map<String, Object> unifyPayService(HttpServletRequest request) {

		String uKey = Thread.currentThread().getName();
		log.info("通过本地线程类获取的URL的KEY为: {}", uKey);
		String URL = PropertyUtil.getProperty(uKey, "");

		Map<String, Object> resultMap = null;
		try {
			resultMap = HttpUtil.weiPayReq(URL, request, headers);
			log.info("unifiedOrder Response: {}", resultMap);
		} catch (Exception e) {
			log.error("unifiedOrder Exception: {}", e.getMessage());
		}
		return resultMap;
	}

}
