package com.dp.alipay.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dp.persistence.dto.base.HttpResult;

/**
 * @Attention 要保持方法的Mapping、方法名、调用的Service方法名三者一致
 * @author YOUZILIANG
 *
 */
@Controller
@RequestMapping("api/aliPay") // produces = "application/x-www-form-urlencoded; charset=UTF-8" 此参为可接收的报文格式
public class PayController extends BaseController {
	
	/**
	 * @Description: 支付宝接口测试
	 */
	@PostMapping(value = "payTest")
	@ResponseBody
	public HttpResult<Object> payTest(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}

}
