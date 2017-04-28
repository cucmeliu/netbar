package com.ikohoo.service;

import java.util.List;

import com.ikohoo.dao.EmplDao;
import com.ikohoo.dao.MembDao;
import com.ikohoo.domain.Member;
import com.ikohoo.factory.BasicFactory;

public class MembServiceImpl implements MembService {

	private MembDao dao = BasicFactory.getFactory().getInstance(MembDao.class);

	@Override
	public List<Member> findAllMemb() {
		return dao.getAllMember();
	}

}
