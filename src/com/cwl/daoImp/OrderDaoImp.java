package com.cwl.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cwl.dao.OrderDao;
import com.cwl.entity.Order;
import com.cwl.utils.DBManager;

public class OrderDaoImp implements OrderDao {

	private Connection conn;
	private PreparedStatement ptst;
	private ResultSet rs;
	
	@Override
	public boolean insertOrder(Order order) {
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql="insert into ordermes(oname,otel,oaddr,ocode,oid,omood,oprice,odate,orname) values(?,?,?,?,?,?,?,?,?)";
		
		try {
			ptst=conn.prepareStatement(sql);

			ptst.setString(1, order.getOname());
			ptst.setString(2, order.getOtel());
			ptst.setString(3, order.getOaddr());
			ptst.setString(4, order.getOcode());
			ptst.setInt(5, order.getOid());
			ptst.setString(6, order.getOmood());
			ptst.setDouble(7, order.getOprice());
			ptst.setString(8, order.getOdate());
			ptst.setString(9, order.getOrname());
			
			flag=(ptst.executeUpdate()>0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}


	@Override
	public boolean updateOrder(String cname, String cmood) {
		
		return false;
	}


	@Override
	public List<Order> selectAllOrder(String date) {
		List<Order> list=null;
		
		conn=DBManager.getConnection();
		
		String sql=" select * from ordermes where odate=? order by odate desc"; 
		
		try {
			ptst=conn.prepareStatement(sql);
		
			ptst.setString(1, date);
			
			list=new ArrayList<>();
			
			Order order=null;
			
			rs=ptst.executeQuery();
			
			while(rs.next()) {
				order=new Order();
				order.setOname(rs.getString("oname"));
				order.setOtel(rs.getString("otel"));
				order.setOaddr(rs.getString("oaddr"));
				order.setOcode(rs.getString("ocode"));
				order.setOid(rs.getInt("oid"));
				order.setOmood(rs.getString("omood"));
				order.setOprice(rs.getDouble("oprice"));
				order.setOdate(rs.getString("odate"));
				order.setOrname(rs.getString("orname"));
				
				list.add(order);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public List<Order> selectOrder() {
		List<Order> list=null;
		
		conn=DBManager.getConnection();
		
		String sql=" select * from ordermes order by odate desc"; 
		
		try {
			ptst=conn.prepareStatement(sql);
		
			list=new ArrayList<>();
			
			Order order=null;
			
			rs=ptst.executeQuery();
			
			while(rs.next()) {
				order=new Order();
				order.setOdid(rs.getInt("odid"));
				order.setOname(rs.getString("oname"));
				order.setOtel(rs.getString("otel"));
				order.setOaddr(rs.getString("oaddr"));
				order.setOcode(rs.getString("ocode"));
				order.setOid(rs.getInt("oid"));
				order.setOmood(rs.getString("omood"));
				order.setOprice(rs.getDouble("oprice"));
				order.setOdate(rs.getString("odate"));
				order.setOrname(rs.getString("orname"));
				list.add(order);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public Order selectOrder(int odid) {
		Order order=null;
		
		conn=DBManager.getConnection();
		
		String sql="select * from ordermes where odid=? order by odate desc";
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setInt(1, odid);
			
			rs=ptst.executeQuery();
			
			while(rs.next()){
			
			order=new Order();
			
			order.setOname(rs.getString("oname"));
			order.setOtel(rs.getString("otel"));
			order.setOaddr(rs.getString("oaddr"));
			order.setOcode(rs.getString("ocode"));
			order.setOid(rs.getInt("oid"));
			order.setOmood(rs.getString("omood"));
			order.setOprice(rs.getDouble("oprice"));
			order.setOdate(rs.getString("odate"));
			order.setOrname(rs.getString("orname"));
			order.setOdid(rs.getInt("odid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return order;
	}


	@Override
	public boolean updateOrder(String omood, int odid) {
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql=" update ordermes set omood=? where odid=?";
		
		try {
			ptst=conn.prepareStatement(sql);

			ptst.setString(1, omood);
			ptst.setInt(2, odid);
			
			flag=(ptst.executeUpdate()>0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return flag;
	}


	@Override
	public List<Order> selectByName(String oname) {
		
		List<Order> list=null;
		
		conn=DBManager.getConnection();
		
		String sql=" select * from ordermes where oname=? order by odate desc"; 
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setString(1, oname);
		
			list=new ArrayList<>();
			
			Order order=null;
			
			rs=ptst.executeQuery();
			
			while(rs.next()) {
				order=new Order();
				order.setOdid(rs.getInt("odid"));
				order.setOname(rs.getString("oname"));
				order.setOtel(rs.getString("otel"));
				order.setOaddr(rs.getString("oaddr"));
				order.setOcode(rs.getString("ocode"));
				order.setOid(rs.getInt("oid"));
				order.setOmood(rs.getString("omood"));
				order.setOprice(rs.getDouble("oprice"));
				order.setOdate(rs.getString("odate"));
				order.setOrname(rs.getString("orname"));
				list.add(order);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}


	
}
