package com.dp.common.utils;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import com.dp.common.enums.CharSets;

public class SignUtil {

	/**
	 * @Description 微信支付MD5签名
	 * @param map
	 * @param key
	 * @param charset
	 * @return String
	 */
	public static String getWeiSign(Map<String, Object> map, String key, String charset) {
		Set<String> keySet = map.keySet();
		String[] str = new String[map.size()];
		StringBuilder sb = new StringBuilder();
		// 进行字典排序
		str = keySet.toArray(str);
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			String t = str[i] + "=" + map.get(str[i]) + "&";
			sb.append(t);
		}
		if (null != key) {
			sb.append("key=" + key);
		}
		return MD5Util.MD5Encode(sb.toString(), charset).toUpperCase();
	}

	/**
	 * @Description 微信支付SHA1签名
	 * @param map
	 * @return String
	 */
	// TODO 有待校验
	public static String signatureSHA1(Map<String, String> map) {
		Set<String> keySet = map.keySet();
		String[] str = new String[map.size()];
		StringBuilder sb = new StringBuilder();
		// 进行字典排序
		str = keySet.toArray(str);
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			String t = str[i] + "=" + map.get(str[i]) + "&";
			sb.append(t);
		}
		String tosend = sb.toString().substring(0, sb.length() - 1);
		MessageDigest md = null;
		byte[] bytes = null;
		try {
			md = MessageDigest.getInstance("SHA-1");
			bytes = md.digest(tosend.getBytes(CharSets.UTF8));
		} catch (Exception e) {
			e.printStackTrace();
		}
		String singe = new String(bytes);
		return singe.toLowerCase();
	}

}
