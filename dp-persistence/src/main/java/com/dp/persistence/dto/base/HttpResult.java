package com.dp.persistence.dto.base;

public class HttpResult<T> {
	/*
	 * 是否成功标识 1: 成功 0: 失败
	 */
	private int status;
	/*
	 * 消息code
	 */
	private String code;
	/*
	 * 消息内容
	 */
	private String msg;
	/*
	 * 数据
	 */
	private T result;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String errorCode) {
		this.code = errorCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public HttpResult() {
	}

	public HttpResult(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

}
