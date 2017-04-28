package com.ikohoo.dao;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ikohoo.domain.Employee;
import com.ikohoo.util.DaoUtils;

public class EmplDaoImpl implements EmplDao {

	@Override
	public void addEmpl(Employee empl) {
		String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			QueryRunner runner = new QueryRunner(DaoUtils.getSource());
			runner.update(sql, empl.getId(), empl.getName(),
					empl.getPassword(), empl.getNickname(),
					empl.getCellphone(), empl.getEmail(), empl.getIdcard(),
					empl.getGender(), empl.getBirthday(), empl.getRole(),
					empl.getState(), null);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public Employee findEmplById(String id) {
		String sql = " SELECT * FROM employee WHERE id=? ";

		try {
			QueryRunner runner = new QueryRunner(DaoUtils.getSource());
			return runner.query(sql, new BeanHandler<Employee>(Employee.class),
					id);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	@Override
	public List<Employee> getAllEmployee() {
		String sql = " SELECT * FROM employee ";

		try {
			QueryRunner runner = new QueryRunner(DaoUtils.getSource());
			return runner.query(sql, new BeanListHandler<Employee>(
					Employee.class));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
