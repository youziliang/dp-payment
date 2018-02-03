package com.dp.weipay.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface PayService {

	Map<String, Object> getSandBoxKey(HttpServletRequest request);

	Map<String, Object> unifiedOrder(HttpServletRequest request);

	Map<String, Object> recvPayNotification(HttpServletRequest request);

	Map<String, Object> queryOrder(HttpServletRequest request);

	Map<String, Object> closeOrder(HttpServletRequest request);

	Map<String, Object> refund(HttpServletRequest request);

	Map<String, Object> queryRefund(HttpServletRequest request);

	Map<String, Object> downloadBill(HttpServletRequest request);

	Map<String, Object> report(HttpServletRequest request);

	Map<String, Object> getCommentData(HttpServletRequest request);

}
