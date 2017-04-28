package com.ikohoo.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ikohoo.domain.MembStore;
import com.ikohoo.factory.BasicFactory;
import com.ikohoo.service.EmplService;
import com.ikohoo.service.MembStoreService;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * Servlet implementation class FindMemFromHQServlet
 */
@WebServlet("/MembStoreServlet")
public class MembStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MembStoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MembStoreService service = BasicFactory.getFactory().getInstance(
				MembStoreService.class);
		
		// 1. 封装校验数据
		// 2. 调用service查找信息
		MembStore membStore = service.getMembStoreByMembId(request.getParameter("id"));
		
		// 3. 将查找到的信息存入request域，请求转发到jsp页面
		request.setAttribute("membStore", membStore);
		request.getRequestDispatcher("membRoam.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
