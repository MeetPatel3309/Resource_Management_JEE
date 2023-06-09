package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MasterDAO;

@WebServlet("/DeleteLangauge")

public class DeleteLangauge extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer lanId = Integer.valueOf(req.getParameter("lanId"));
		
		MasterDAO dao = new MasterDAO();
		
		dao.deleteLangauge(lanId);
		
		resp.sendRedirect("ManageLangauge");
	}
	
	
}
