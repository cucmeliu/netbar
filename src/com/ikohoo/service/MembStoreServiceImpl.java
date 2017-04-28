package com.ikohoo.service;

import com.ikohoo.dao.MembStoreDao;
import com.ikohoo.dao.ProdDao;
import com.ikohoo.domain.MembStore;
import com.ikohoo.factory.BasicFactory;

public class MembStoreServiceImpl implements MembStoreService {

	MembStoreDao dao = BasicFactory.getFactory().getInstance(MembStoreDao.class);
	@Override
	public MembStore getMembStoreByMembId(String id) {
		return dao.getMembStoreByMembId(id);
	}

}
