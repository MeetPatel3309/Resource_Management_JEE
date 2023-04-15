package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.LanBean;
import com.dao.MasterDAO;

@WebServlet("/ManageLangauge")

public class ManageLangauge extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
				
		ArrayList<LanBean> list = new MasterDAO().getAllLangauge();
		
//		System.out.println("list ManageLangauge :: after"+list);
		
		req.setAttribute("lanList", list);
		
		req.getRequestDispatcher("Langauge.jsp").forward(req, resp);
	}	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		
		boolean isError = false;
		
		if(name==null || name.trim().length()==0)
		{
			isError = true;
			
			ArrayList<LanBean> list = new MasterDAO().getAllLangauge();
			req.setAttribute("lanList", list);	
			
			req.setAttribute("nameError", "<span style='color:red'>Please Enter Langauge..!</span>");
			
			req.getRequestDispatcher("Langauge.jsp").forward(req, resp);
		}
		else
		{
			LanBean bean = new LanBean();
			bean.setName(name);
			
			MasterDAO dao = new MasterDAO();
			dao.addLangauge(bean);
		
			ArrayList<LanBean> list = new MasterDAO().getAllLangauge();
			req.setAttribute("lanList", list);	
			
			req.getRequestDispatcher("Langauge.jsp").forward(req, resp);
			
		}
	}
}
