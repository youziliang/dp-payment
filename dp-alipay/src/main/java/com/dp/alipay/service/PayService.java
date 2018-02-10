package com.dp.alipay.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface PayService {

	Map<String, Object> payTest(HttpServletRequest request);
}
