package com.dp.alipay.service.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dp.alipay.service.PayService;

@Service
public class PayServiceImpl implements PayService {

	private static final Logger log = LoggerFactory.getLogger(PayServiceImpl.class);

	@Override
	public Map<String, Object> payTest(HttpServletRequest request) {
		log.info("支付寶測試");
		return null;
	}

}
