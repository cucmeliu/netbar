package com.ikohoo.dao;

import com.ikohoo.domain.MembStore;

public interface MembStoreDao {

	/**
	 * 通过会员号，到总店数据库中查找会员所在店
	 * @param id
	 * @return
	 */
	MembStore getMembStoreByMembId(String id);

}
