package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	public ArrayList<HrBean> getAllHr() {
		
		ArrayList<HrBean> list = new ArrayList<>();
		Connection con = null;
		
		try 
		{
			con = DbConn.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from HrData");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				HrBean bean = new HrBean();
				
				bean.setHrid(rs.getInt("hrid"));
				bean.setName(rs.getString("name"));
				bean.setEmail(rs.getString("email"));
				bean.setPassword(rs.getString("password"));
				bean.setMobileNo(rs.getString("mobileNo"));
				
				list.add(bean);
			}
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
		return list;
	}

	public HrBean hrAuthentication(String email, String password) {
		
		
		
		
		HrBean bean = null;
		Connection con = null;
	
		try {
			
			con = DbConn.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT  * FROM HrData WHERE email=? AND password=?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				bean = new HrBean();
				
				bean.setName(rs.getString("name"));
				bean.setEmail(rs.getString("email"));
				bean.setPassword(rs.getString("password"));
				bean.setMobileNo(rs.getString("mobileNo"));
				
			}
			
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
		
		
		return bean;
	}

	public void deletehr(Integer hrid) 
	{
		Connection con = null;
		
		try 
		{
			con = DbConn.getConnection();
			PreparedStatement ps = con.prepareStatement("Delete from HrData WHERE hrid = ?");
		
			ps.setInt(1, hrid);
			
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
