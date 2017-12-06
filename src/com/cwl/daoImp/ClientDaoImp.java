package com.cwl.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cwl.dao.ClientDao;
import com.cwl.entity.Client;
import com.cwl.utils.DBManager;

public class ClientDaoImp implements ClientDao {
	
	private Connection conn=null;
	private PreparedStatement ptst=null;
	private ResultSet rs=null;
	

	@Override
	public boolean insertClient(Client client) {
		boolean flag = false;
		
		conn=DBManager.getConnection();
		
		String sql="insert into client (cname,cpass,ctel,cmail)values(?,?,?,?)";
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setString(1, client.getCname());
			ptst.setString(2, client.getCpass());
			ptst.setString(3, client.getCtel());
			ptst.setString(4, client.getCmail());
			
			flag=(ptst.executeUpdate()>0);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
			
		}
				
		return flag;
	}


	@Override
	public boolean selectClient(Client client) {
		
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql="select * from client where ctel=? and cpass=? ";
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setString(1, client.getCtel());
			ptst.setString(2,client.getCpass());
			
			rs=ptst.executeQuery();
			
			
			
			if(rs.next()) {
				flag=true;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return flag;
	}


	@Override
	public Client seletctClient1(String cname) {
		Client client =null;
		
		conn=DBManager.getConnection();
		
		String sql="select cname from client where cname=?";		
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setString(1, cname);
			
			rs=ptst.executeQuery();
			
			if(rs.next()) {
				client =new Client();
				
				client.setCname(cname);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return client;
	}


	@Override
	public Client selectByMail(String cmail) {
		
		Client client =null;
		
		conn=DBManager.getConnection();
		
		String sql="select cname from client where cmail=?";		
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setString(1, cmail);
			
			rs=ptst.executeQuery();
			
			if(rs.next()) {
				client =new Client();
				
				client.setCmail(cmail);;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return client;
	}


	@Override
	public List<Client> selectAllClient() {
		
		List<Client> list=null;
		
		conn=DBManager.getConnection();
		
		String sql="select * from client";
		
		Client client = null;
		try {
			ptst=conn.prepareStatement(sql);
			
			list=new ArrayList<>();
			
			rs=ptst.executeQuery();
			
			while(rs.next()) {
				client=new Client();
				
				client.setCid(rs.getString("cid"));
				client.setCname(rs.getString("cname"));
				client.setCtel(rs.getString("ctel"));
				client.setCmail(rs.getString("cmail"));
				client.setCaddr(rs.getString("caddr"));
				client.setCorder(rs.getString("corder"));
				
				list.add(client);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}


	@Override
	public Client selectByTelphone(String ctel) {

		Client client =null;
		
		conn=DBManager.getConnection();
		
		String sql="select cname from client where ctel=?";		
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setString(1, ctel);
			
			rs=ptst.executeQuery();
			
			if(rs.next()) {
				client =new Client();
				
				client.setCmail(ctel);;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return client;
	}


	@Override
	public boolean deleteClient(int cid) {
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql="delete from client where cid=?" ;
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setInt(1, cid);
			
			flag=(ptst.executeUpdate()>0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return flag;
	}

}
