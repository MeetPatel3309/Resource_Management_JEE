package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.HrBean;
import com.dao.HrDAO;

@WebServlet("/ListHr")
public class ListHr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
		ArrayList<HrBean> list = new HrDAO().getAllHr();
		
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("ListHr.jsp").forward(req, resp);
	}

	
}
