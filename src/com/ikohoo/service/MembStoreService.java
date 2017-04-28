package com.ikohoo.service;

import com.ikohoo.domain.MembStore;

public interface MembStoreService {

	/**
	 * 通过会员ID查找他在哪个店
	 * @param parameter
	 * @return
	 */
	MembStore getMembStoreByMembId(String parameter);

}
