package com.ikohoo.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import com.ikohoo.domain.Employee;
import com.ikohoo.domain.Product;
import com.ikohoo.factory.BasicFactory;
import com.ikohoo.service.ProdService;

/**
 * Servlet implementation class AddProdServlet
 */
@WebServlet("/ProdAddServlet")
public class ProdAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProdService service = BasicFactory.getFactory().getInstance(ProdService.class);
		//Map<String, String> paramMap = new HashMap<String, String>();
		
		try {
			// 乱码
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			
			// 日期转码
			DateConverter dateConverter = new DateConverter(null);
			dateConverter.setPatterns(new String[]{"yyyy-MM-dd","yyyy/MM/dd"});
			ConvertUtils.register(dateConverter, Date.class);	
			
			// 封装校验数据
			Product prod = new Product();
			BeanUtils.populate(prod, request.getParameterMap());
			
			// 调用service 添加
			service.addProd(prod);

			// 返回页面
			response.getWriter().write("success，return in 3 seconds");
			response.setHeader("Refresh", "3;url=prodAdd.jsp");
			
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
