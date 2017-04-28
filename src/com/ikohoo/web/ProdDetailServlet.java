package com.ikohoo.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.ikohoo.domain.Employee;
import com.ikohoo.domain.Product;
import com.ikohoo.factory.BasicFactory;
import com.ikohoo.service.ProdService;

/**
 * Servlet implementation class ProdInfoSevrlet
 */
@WebServlet("/ProdDetailServlet")
public class ProdDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProdDetailServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ProdService service = BasicFactory.getFactory().getInstance(
				ProdService.class);

		try {
			// 调用service中的方法查询
			Product prod = new Product();
			// BeanUtils.populate(prod, request.getParameterMap());

			prod = service.findProdById(request.getParameter("id"));
			// 将查到的商品存入request域后带到页面显示
			if (null == prod) {
				throw new RuntimeException("找不到该商品");
			} else {
				request.setAttribute("prod", prod);
				request.getRequestDispatcher("prodDetail.jsp").forward(
						request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
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
