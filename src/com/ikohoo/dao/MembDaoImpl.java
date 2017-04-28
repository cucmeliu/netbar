package com.ikohoo.dao;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ikohoo.domain.Employee;
import com.ikohoo.domain.Member;
import com.ikohoo.util.DaoUtils;

public class MembDaoImpl implements MembDao {

	@Override
	public List<Member> getAllMember() {
		String sql = " SELECT * FROM member ";

		try {
			QueryRunner runner = new QueryRunner(DaoUtils.getSource());
			return runner.query(sql, new BeanListHandler<Member>(
					Member.class));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
