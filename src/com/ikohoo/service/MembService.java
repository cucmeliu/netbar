package com.ikohoo.service;

import java.util.List;

import com.ikohoo.domain.Member;

public interface MembService {

	/**
	 * 查询所有会员
	 * @return
	 */
	public List<Member> findAllMemb();

}
