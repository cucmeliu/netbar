package com.ikohoo.service;

import java.util.List;

import com.ikohoo.domain.Employee;

public interface EmplService {

	/**
	 * 添加员工/员工入职
	 * @param empl
	 */
	void addEmployee(Employee empl);

	/**
	 * 员工登录系统
	 * @param employee 封装了员工数据的employeebean
	 */
	void login(Employee employee);

	/**
	 * 列出所有员工
	 * @return
	 */
	List<Employee> getAllEmployee();

	/**
	 * 根据编号查找员工信息
	 * @param id
	 * @return 
	 */
	Employee findEmplById(String id);

}
