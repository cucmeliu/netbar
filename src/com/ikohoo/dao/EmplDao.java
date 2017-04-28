package com.ikohoo.dao;

import java.util.List;

import com.ikohoo.domain.Employee;

public interface EmplDao {

	void addEmpl(Employee empl);

	/**
	 * 根据工号查找员工信息
	 * @param id 工号
	 * @return 查找到的员工信息
	 */
	Employee findEmplById(String id);

	/**
	 * 查询所有员工信息组成的集合
	 * @return 封装了所有员工信息的集合，如果没有任何信息，返回空
	 */
	List<Employee> getAllEmployee();

}
