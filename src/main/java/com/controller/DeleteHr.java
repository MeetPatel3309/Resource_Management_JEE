package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HrDAO;
import com.util.DbConn;

@WebServlet("/DeleteHr")

public class DeleteHr extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	

		Integer hrid = Integer.valueOf(req.getParameter("hrid"));
		
		HrDAO dao = new HrDAO();
		dao.deletehr(hrid);
		
		
		resp.sendRedirect("ListHr");
		
	}

}
