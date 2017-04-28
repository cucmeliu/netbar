package com.ikohoo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ikohoo.domain.Member;
import com.ikohoo.domain.Product;
import com.ikohoo.factory.BasicFactory;
import com.ikohoo.service.MembService;
import com.ikohoo.service.ProdService;

/**
 * Servlet implementation class MembListServlet
 */
@WebServlet("/MembListServlet")
public class MembListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MembListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MembService service = BasicFactory.getFactory().getInstance(MembService.class);
		// 1. 调用service查询所有商品
		List<Member> list = service.findAllMemb();
		
		// 2. 将所有商品信息存入request域后带到页面展示
		request.setAttribute("list", list);
		request.getRequestDispatcher("/membList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
