package com.cwl.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cwl.dao.CartDao;
import com.cwl.entity.Cart;
import com.cwl.utils.DBManager;

public class CartDaoImp implements CartDao {
	private Connection conn=null;
	private PreparedStatement ptst=null;
	private ResultSet rs=null;
	
	
	@Override
	public List<Cart> getAllCart(String cname) {
		List<Cart> list=null;
		
		conn=DBManager.getConnection();
		
		String sql="select * from cart where cname=?";
		
		try {
			ptst=conn.prepareStatement(sql);

			ptst.setString(1, cname);
			
			list=new ArrayList<>();
			
			Cart cart=null;
			
			rs=ptst.executeQuery();
			
			while(rs.next()) {
				cart=new Cart();
				
				cart.setCfid(rs.getInt("cfid"));
				cart.setCcount(rs.getInt("ccount"));
				cart.setCname(rs.getString("cname"));
				
				list.add(cart);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return list;
	}

	@Override
	public Cart getCart(int cfid,String cname) {
		
		conn=DBManager.getConnection();
		
		String sql="select * from cart where cfid=? and cname=?";
			Cart cart=null;
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setInt(1, cfid);
			ptst.setString(2, cname);
			
			rs=ptst.executeQuery();
			
			while(rs.next()) {
				cart=new Cart();
				
				cart.setCfid(rs.getInt("cfid"));
				cart.setCcount(rs.getInt("ccount"));
				cart.setCname(rs.getString("cname"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cart;
	}

	@Override
	public boolean insertCart(int cfid,int ccount,String cname) {
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql="insert into cart(cfid,ccount,cname)values(?,?,?)";
		
		try {
			ptst=conn.prepareStatement(sql);

			ptst.setInt(1, cfid);
			ptst.setInt(2, ccount);
			ptst.setString(3, cname);
			
			flag=(ptst.executeUpdate()>0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public boolean deleteCart(int cfid) {
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql="delete from cart where cfid=?";
		
		try {
			ptst=conn.prepareStatement(sql);

			ptst.setInt(1, cfid);
			
			flag=(ptst.executeUpdate()>0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return flag;
	}

	@Override
	public boolean updateCart(int cfid, int ccount, String cname) {
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql=" update cart set ccount=? where cfid=?  and cname=?";
		
		try {
			ptst=conn.prepareStatement(sql);

			ptst.setInt(1, ccount);
			ptst.setInt(2, cfid);
			ptst.setString(3, cname);
			
			flag=(ptst.executeUpdate()>0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return flag;
	}

	@Override
	public boolean deleteAllCart(String cname) {
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql="delete from cart where cname=?";
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setString(1, cname);

			flag=(ptst.executeUpdate()>0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return flag;
	}

}
