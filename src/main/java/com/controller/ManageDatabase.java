package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.DbBean;
import com.bean.LanBean;
import com.dao.MasterDAO;

@WebServlet("/ManageDatabase")

public class ManageDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
				
		ArrayList<DbBean> list = new MasterDAO().getAllDatabase();
		req.setAttribute("dbList", list);
		
		req.getRequestDispatcher("Database.jsp").forward(req, resp);
	}	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		
		boolean isError = false;
		
		if(name==null || name.trim().length()==0)
		{
			isError = true;
			
			ArrayList<DbBean> list = new MasterDAO().getAllDatabase();
			req.setAttribute("dbList", list);
			
			req.setAttribute("nameError", "<span style='color:red'>Please Enter Database..!</span>");
			
			req.getRequestDispatcher("Database.jsp").forward(req, resp);
		}
		else
		{
			DbBean bean = new DbBean();
			bean.setName(name);
			
			MasterDAO dao = new MasterDAO();
			dao.addDatabase(bean);
		
			ArrayList<DbBean> list = new MasterDAO().getAllDatabase();
			req.setAttribute("dbList", list);
			
			req.getRequestDispatcher("Database.jsp").forward(req, resp);
			
		}
	}
}
