package com.ikohoo.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import com.ikohoo.domain.Employee;
import com.ikohoo.factory.BasicFactory;
import com.ikohoo.service.EmplService;

/**
 * Servlet implementation class EmpEditServlet
 */
@WebServlet("/EmpEditServlet")
public class EmpEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EmplService service = BasicFactory.getFactory().getInstance(
				EmplService.class);
		try {
			// 乱码
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			
			// 封装校验数据
			DateConverter dateConverter = new DateConverter(null);
			dateConverter.setPatterns(new String[]{"yyyy-MM-dd","yyyy/MM/dd"});
			ConvertUtils.register(dateConverter, Date.class);	
			
			Employee emp = new Employee();
			BeanUtils.populate(emp, request.getParameterMap());
			
			// 调用service 查找员工
			emp = service.findEmplById(emp.getId());
			
			//将查找到的信息存入request域，请求转发到empdetail
			request.setAttribute("employee", emp);
			request.getRequestDispatcher("emplEdit.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
