package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MasterDAO;

@WebServlet("/DeleteDatabase")

public class DeleteDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer dbId = Integer.valueOf(req.getParameter("dbId"));
		
		MasterDAO dao = new MasterDAO();
		
		dao.deleteDatabase(dbId);
		
		resp.sendRedirect("ManageDatabase");
	}

}
