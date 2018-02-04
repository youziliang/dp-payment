package com.dp.weipay.api;

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
@RequestMapping("api/weiPay") // produces = "application/x-www-form-urlencoded; charset=UTF-8" 此参为可接收的报文格式
public class PayController extends BaseController {

	/**
	 * @Description: 获取沙箱环境SignKey
	 */
	@PostMapping(value = "getSandBoxKey")
	@ResponseBody
	public HttpResult<Object> getSandBoxKey(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}

	/**
	 * @Description: 统一下单
	 */
	@PostMapping(value = "unifiedOrder")
	@ResponseBody
	public HttpResult<Object> unifiedOrder(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}

	/**
	 * @Description: 支付结果通知
	 */
	@PostMapping(value = "recvPayNotification")
	@ResponseBody
	public HttpResult<Object> recvPayNotification(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}
	
	/**
	 * @Description: 查询订单
	 */
	@PostMapping(value = "queryOrder")
	@ResponseBody
	public HttpResult<Object> queryOrder(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}
	
	/**
	 * @Description: 关闭订单
	 */
	@PostMapping(value = "closeOrder")
	@ResponseBody
	public HttpResult<Object> closeOrder(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}
	
	/**
	 * @Description: 申请退款
	 */
	@PostMapping(value = "refund")
	@ResponseBody
	public HttpResult<Object> refund(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}
	
	/**
	 * @Description: 查询退款
	 */
	@PostMapping(value = "queryRefund")
	@ResponseBody
	public HttpResult<Object> queryRefund(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}
	
	/**
	 * @Description: 下载对账单
	 */
	@PostMapping(value = "downloadBill")
	@ResponseBody
	public HttpResult<Object> downloadBill(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}
	
	/**
	 * @Description: 交易保障
	 */
	@PostMapping(value = "report")
	@ResponseBody
	public HttpResult<Object> report(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}
	
	/**
	 * @Description: 拉取订单评价数据
	 */
	@PostMapping(value = "getCommentData")
	@ResponseBody
	public HttpResult<Object> getCommentData(HttpServletRequest request, HttpServletResponse response) {
		return super.unifyPayController(request, response);
	}

}
