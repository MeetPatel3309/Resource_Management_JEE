package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.HrBean;
import com.util.DbConn;

public class HrDAO {

	public void addHR(HrBean bean) {

		Connection con = null;
		
		try 
		{
			
			con = DbConn.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO HrData(name,email,password,mobileNo) VALUES (?, ?, ?, ?)");
			
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getEmail());
			ps.setString(3, bean.getPassword());
			ps.setString(4, bean.getMobileNo());
			
			int rowsAffected = ps.executeUpdate();
			
			
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				con.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
	}


}
