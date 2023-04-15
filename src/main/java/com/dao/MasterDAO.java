package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.bean.DbBean;
import com.bean.LanBean;
import com.bean.TechBean;
import com.util.DbConn;

public class MasterDAO {

	public ArrayList<LanBean> getAllLangauge() {

		ArrayList<LanBean> list = new ArrayList<>();

		LanBean bean = null;

		Connection con = null;
		try 
		{
			con = DbConn.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM Langauge");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				bean = new LanBean();
				
				bean.setLanId(rs.getInt("lanId"));
				bean.setName(rs.getString("name"));	
			
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
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}

		return list;

	}

	public void deleteLangauge(Integer lanId) {
		
		Connection con = null;
		
		try 
		{
			con = DbConn.getConnection();
			
			PreparedStatement ps = con.prepareStatement("Delete from Langauge WHERE lanId = ?");
			ps.setInt(1, lanId);
			
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

	public void addLangauge(LanBean bean) {

		Connection con = null;
		try 
		{
			con = DbConn.getConnection();
			
			PreparedStatement ps = con.prepareStatement("Insert into Langauge(name) VALUES (?)");
			ps.setString(1, bean.getName());
			
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

	public ArrayList<TechBean> getAllTechnology() {

		ArrayList<TechBean> list = new ArrayList<>();
		
		TechBean bean = null;
		
		Connection con = null;
		
		try 
		{
			con = DbConn.getConnection();
			PreparedStatement ps = con.prepareStatement("Select * from Technology");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				bean = new TechBean();
				
				bean.setTechId(rs.getInt("techId"));
				bean.setName(rs.getString("name"));
				
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

	public void deleteTechnology(Integer techId) {
		
		Connection con = null;
		
		try 
		{
			con = DbConn.getConnection();
			PreparedStatement ps = con.prepareStatement("Delete from Technology WHERE techId = ?");
			ps.setInt(1, techId);
			
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

	public void addTechnology(TechBean bean) {

		Connection con = null;
		
		try {
			con= DbConn.getConnection();

			PreparedStatement ps = con.prepareStatement("Insert into Technology(name) VALUES (?)");
			ps.setString(1, bean.getName());
			
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

	public ArrayList<DbBean> getAllDatabase() {

		ArrayList<DbBean> list = new ArrayList<>();
		
		Connection con = null;
		
		try 
		{
			con = DbConn.getConnection();

			PreparedStatement ps = con.prepareStatement("Select * from DatabaseData");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				DbBean bean = new DbBean();
				bean.setDbId(rs.getInt("dbId"));
				bean.setName(rs.getString("name"));
				
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

	public void deleteDatabase(Integer dbId) {
		
		Connection con = null;
		
		try 
		{
			con = DbConn.getConnection();
			
			PreparedStatement ps = con.prepareStatement("Delete from DatabaseData WHERE dbId = ?");
			ps.setInt(1, dbId);
			
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

	public void addDatabase(DbBean bean) {
		
		Connection con = null;

		try 
		{
			con = DbConn.getConnection();

			PreparedStatement ps = con.prepareStatement("Insert into DatabaseData(name) VALUES(?)");
			ps.setString(1, bean.getName());
			
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
