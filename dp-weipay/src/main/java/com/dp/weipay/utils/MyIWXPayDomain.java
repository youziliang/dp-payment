package com.dp.weipay.utils;

public class MyIWXPayDomain implements IWXPayDomain {

	@Override
	public void report(String domain, long elapsedTimeMillis, Exception ex) {
		// TODO Auto-generated method stub

	}

	@Override
	public DomainInfo getDomain(WXPayConfig config) {
		// TODO Auto-generated method stub
		DomainInfo domainInfo = new DomainInfo(WXPayConstants.DOMAIN_API,true);
		return domainInfo;
	}

}
