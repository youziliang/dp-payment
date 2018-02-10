package com.dp.alipay.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayOpenPublicTemplateMessageIndustryModifyRequest;
import com.alipay.api.response.AlipayOpenPublicTemplateMessageIndustryModifyResponse;
import com.dp.alipay.service.PayService;
import com.dp.common.enums.CharSets;
import com.dp.common.utils.PropertyUtil;

@Service
public class PayServiceImpl implements PayService {

	private static final Logger log = LoggerFactory.getLogger(PayServiceImpl.class);

	@Override
	public Map<String, Object> payTest(HttpServletRequest request) {
		
		Map<String, Object> map = new HashMap<String, Object>();

		// 实例化客户端
		AlipayClient alipayClient = new DefaultAlipayClient(PropertyUtil.getProperty("ALI_GATEWAY", ""),
				PropertyUtil.getProperty("APP_ID", ""), PropertyUtil.getProperty("APP_PRIVATE_KEY", ""), "json",
				CharSets.UTF8, PropertyUtil.getProperty("ALIPAY_PUBLIC_KEY", ""), "RSA2");
		// 实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.open.public.template.message.industry.modify
		// AlipayOpenPublicTemplateMessageIndustryModifyRequest req = new AlipayOpenPublicTemplateMessageIndustryModifyRequest();
		AlipayOpenPublicTemplateMessageIndustryModifyRequest req = new AlipayOpenPublicTemplateMessageIndustryModifyRequest();
		// SDK已经封装掉了公共参数，这里只需要传入业务参数
		// 此次只是参数展示，未进行字符串转义，实际情况下请转义
		req.setBizContent("{" 
				+ "\"primary_industry_name\":\"IT科技/IT软件与服务\","
				+ "\"primary_industry_code\":\"10001/20102\"," 
				+ "\"secondary_industry_code\":\"10001/20102\","
				+ "\"secondary_industry_name\":\"IT科技/IT软件与服务\"" 
				+ "}");
		try {
			AlipayOpenPublicTemplateMessageIndustryModifyResponse resp = alipayClient.execute(req);
			// 调用成功，则处理业务逻辑
			if (resp.isSuccess()) {
				log.info("阿里调用成功: {}", resp);
				map.put("result", "OK");
			}
		} catch (AlipayApiException e) {
			log.error("阿里调用异常: {}", e.getMessage());
		}
		return map;
	}

}
