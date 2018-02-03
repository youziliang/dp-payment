package com.dp.weipay.utils;

import java.io.InputStream;

public class MyWXPayConfig extends WXPayConfig {

	@Override
	String getAppID() {
		// TODO Auto-generated method stub
		return "wx934db3c18fd280f7";
	}

	@Override
	String getMchID() {
		// TODO Auto-generated method stub
		return "1490338372";
	}

	@Override
	String getKey() {
		// TODO Auto-generated method stub
		return "5eec42335a42ed8c82bcdc3c74b97ed6";
	}

	@Override
	InputStream getCertStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IWXPayDomain getWXPayDomain() {
		// TODO Auto-generated method stub
		MyIWXPayDomain myIWXPayDomain = new MyIWXPayDomain();
		return myIWXPayDomain;
	}

}
