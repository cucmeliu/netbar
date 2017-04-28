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
 * Servlet implementation class EmployeeAddServlet
 */
@WebServlet("/EmplAddServlet")
public class EmplAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmplAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmplService service = BasicFactory.getFactory().getInstance(EmplService.class);
		
		//Map<String, String> paramMap = new HashMap<String, String>();
		
		response.getWriter().write("添加成功，3秒后返回");
//		
//		try {
//			
//			// 封装校验数据
//			Employee empl = new Employee();
//			BeanUtils.populate(empl, request.getParameterMap());
//			
//			// 调用service 注册用户
//			service.addEmpl(empl);
//			
//			//返回页面
//			response.getWriter().write("添加成功，3秒后返回");
//			response.setHeader("Refresh", "3;url=/index.jsp");;
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new RuntimeException(e);
//		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
