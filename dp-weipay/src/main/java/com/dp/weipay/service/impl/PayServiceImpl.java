package com.dp.weipay.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.message.BasicHeader;
import org.springframework.stereotype.Service;

import com.dp.common.enums.CharSets;
import com.dp.weipay.service.BaseService;
import com.dp.weipay.service.PayService;

@Service
public class PayServiceImpl extends BaseService implements PayService {

	private static final List<Header> headers = new ArrayList<Header>();
	static {
		// 封装通用请求头
		headers.add(new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/xml"));
		headers.add(new BasicHeader(HttpHeaders.ACCEPT, "application/json"));
		headers.add(new BasicHeader(HttpHeaders.ACCEPT_CHARSET, CharSets.UTF8));
	}

	@Override
	public Map<String, Object> getSandBoxKey(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

	@Override
	public Map<String, Object> unifiedOrder(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

	@Override
	public Map<String, Object> recvPayNotification(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

	@Override
	public Map<String, Object> queryOrder(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

	@Override
	public Map<String, Object> closeOrder(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

	@Override
	public Map<String, Object> refund(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

	@Override
	public Map<String, Object> queryRefund(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

	@Override
	public Map<String, Object> downloadBill(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

	@Override
	public Map<String, Object> report(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

	@Override
	public Map<String, Object> getCommentData(HttpServletRequest request) {
		return super.unifyPayService(request);
	}

}
