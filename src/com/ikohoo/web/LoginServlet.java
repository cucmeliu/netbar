package com.ikohoo.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.ikohoo.domain.Employee;
import com.ikohoo.factory.BasicFactory;
import com.ikohoo.service.EmplService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		EmplService service = BasicFactory.getFactory().getInstance(
				EmplService.class);

		try {
			// 1. 校验验证码
			// String valistr1 = request.getParameter("valistr");
			// 2. 封装数据校验数据
			Employee employee = new Employee();
			BeanUtils.populate(employee, request.getParameterMap());
			// 3. 调用service
			service.login(employee);
			// 4. 返回主页
			response.getWriter().write("登录成功，3秒后跳转到首页！");
			response.setHeader("Refresh", "3;url=/index.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
