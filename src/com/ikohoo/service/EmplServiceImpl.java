package com.ikohoo.service;

import java.util.List;

import com.ikohoo.dao.EmplDao;
import com.ikohoo.domain.Employee;
import com.ikohoo.factory.BasicFactory;

public class EmplServiceImpl implements EmplService {

	EmplDao dao = BasicFactory.getFactory().getInstance(EmplDao.class);
	@Override
	public void addEmployee(Employee empl) {
		// 1. 检查用户id是否存在
		if (dao.findEmplById(empl.getId())!=null)
		{
			throw new RuntimeException("工号已经存在！");
			
		}
		// 2. 调用dao的方法，添加员工
		dao.addEmpl(empl);
		// 3.
	}
	
	@Override
	public void login(Employee employee) {
		//if (dao.login(employee)) {
			
		//}
	}
	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}
	
	@Override
	public Employee findEmplById(String id) {
		return dao.findEmplById(id);
	}

}
