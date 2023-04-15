package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.LanBean;
import com.bean.TechBean;
import com.dao.MasterDAO;

@WebServlet("/ManageTechnology")

public class ManageTechnology extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		ArrayList<TechBean> list = new MasterDAO().getAllTechnology();
		
		req.setAttribute("techList", list);
		
		req.getRequestDispatcher("Technology.jsp").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		String name = req.getParameter("name");
		
		boolean isError = false;
		
		if(name==null || name.trim().length()==0)
		{
			isError = true;
			
			ArrayList<TechBean> list = new MasterDAO().getAllTechnology();
			req.setAttribute("techList", list);	
			
			req.setAttribute("nameError", "<span style='color:red'>Please Enter Technology..!</span>");
			
			
			req.getRequestDispatcher("Technology.jsp").forward(req, resp);
		}
		else
		{
			TechBean bean = new TechBean();
			bean.setName(name);
			
			MasterDAO dao = new MasterDAO();
			dao.addTechnology(bean);
		
			ArrayList<TechBean> list = new MasterDAO().getAllTechnology();
			req.setAttribute("techList", list);	
			
			req.getRequestDispatcher("Technology.jsp").forward(req, resp);
			
		}
	}

}
