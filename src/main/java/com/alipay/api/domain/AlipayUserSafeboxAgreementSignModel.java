package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钢铁匣签约
 *
 * @author auto create
 * @since 1.0, 2018-12-21 15:10:37
 */
public class AlipayUserSafeboxAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 7498414544466995252L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}