package com.dp.persistence.dto.weipay;

public class UnifiedOrder {

	// 应用ID
	private String appid;

	// 商户号
	private String mch_id;

	// 设备号
	private String device_info;

	// 随机字符串
	private String nonce_str;

	// 签名
	private String sign;

	// 签名类型
	private String sign_type;

	// 商品描述
	private String body;

	// 商品详情
	private String detail;

	// 附加数据
	private String attach;

	// 商户订单号
	private String out_trade_no;

	// 货币类型
	private String fee_type;

	// 总金额
	private Integer total_fee;

	// 终端IP
	private String spbill_create_ip;

	// 交易起始时间
	private String time_start;

	// 交易结束时间
	private String time_expire;

	// 订单优惠标记
	private String goods_tag;

	// 通知地址
	private String notify_url;

	// 交易类型
	private String trade_type;

	// 指定支付方式
	private String limit_pay;

	// 场景信息
	private String scene_info;

	public UnifiedOrder() {
		super();
	}

	public UnifiedOrder(String appid, String mch_id, String device_info, String nonce_str, String sign,
			String sign_type, String body, String detail, String attach, String out_trade_no, String fee_type,
			Integer total_fee, String spbill_create_ip, String time_start, String time_expire, String goods_tag,
			String notify_url, String trade_type, String limit_pay, String scene_info) {
		super();
		this.appid = appid;
		this.mch_id = mch_id;
		this.device_info = device_info;
		this.nonce_str = nonce_str;
		this.sign = sign;
		this.sign_type = sign_type;
		this.body = body;
		this.detail = detail;
		this.attach = attach;
		this.out_trade_no = out_trade_no;
		this.fee_type = fee_type;
		this.total_fee = total_fee;
		this.spbill_create_ip = spbill_create_ip;
		this.time_start = time_start;
		this.time_expire = time_expire;
		this.goods_tag = goods_tag;
		this.notify_url = notify_url;
		this.trade_type = trade_type;
		this.limit_pay = limit_pay;
		this.scene_info = scene_info;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getMch_id() {
		return mch_id;
	}

	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	public String getDevice_info() {
		return device_info;
	}

	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSign_type() {
		return sign_type;
	}

	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getFee_type() {
		return fee_type;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public Integer getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(Integer total_fee) {
		this.total_fee = total_fee;
	}

	public String getSpbill_create_ip() {
		return spbill_create_ip;
	}

	public void setSpbill_create_ip(String spbill_create_ip) {
		this.spbill_create_ip = spbill_create_ip;
	}

	public String getTime_start() {
		return time_start;
	}

	public void setTime_start(String time_start) {
		this.time_start = time_start;
	}

	public String getTime_expire() {
		return time_expire;
	}

	public void setTime_expire(String time_expire) {
		this.time_expire = time_expire;
	}

	public String getGoods_tag() {
		return goods_tag;
	}

	public void setGoods_tag(String goods_tag) {
		this.goods_tag = goods_tag;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public String getLimit_pay() {
		return limit_pay;
	}

	public void setLimit_pay(String limit_pay) {
		this.limit_pay = limit_pay;
	}

	public String getScene_info() {
		return scene_info;
	}

	public void setScene_info(String scene_info) {
		this.scene_info = scene_info;
	}
	
	@Override
	public String toString() {
		return "UnifiedOrder [appid=" + appid + ", mch_id=" + mch_id + ", device_info=" + device_info + ", nonce_str="
				+ nonce_str + ", sign=" + sign + ", sign_type=" + sign_type + ", body=" + body + ", detail=" + detail
				+ ", attach=" + attach + ", out_trade_no=" + out_trade_no + ", fee_type=" + fee_type + ", total_fee="
				+ total_fee + ", spbill_create_ip=" + spbill_create_ip + ", time_start=" + time_start + ", time_expire="
				+ time_expire + ", goods_tag=" + goods_tag + ", notify_url=" + notify_url + ", trade_type=" + trade_type
				+ ", limit_pay=" + limit_pay + ", scene_info=" + scene_info + "]";
	}

}
