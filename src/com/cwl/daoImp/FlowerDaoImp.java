package com.cwl.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cwl.dao.FlowerDao;
import com.cwl.entity.Flower;
import com.cwl.entity.Type;
import com.cwl.utils.DBManager;

public class FlowerDaoImp implements FlowerDao {

	private Connection conn=null;
	private PreparedStatement ptst=null;
	private ResultSet rs=null;
	
	@Override
	public List<Flower> selectAllFlower() {
		
		List<Flower> list=null;
		
		conn=DBManager.getConnection();
		
		String sql=" select * from flower f,type t where t.tid=f.ftid";
		
		try {
			ptst=conn.prepareStatement(sql);

			rs=ptst.executeQuery();
			
			list=new ArrayList<>();
			
			Flower flower=null;
			
			while(rs.next()) {
				flower=new Flower();
				
				flower.setFid(rs.getInt("fid"));
				flower.setFname(rs.getString("fname"));
				flower.setFprice(rs.getString("fprice"));
				flower.setFtid(rs.getInt("ftid"));
				flower.setFgroup(rs.getString("fgroup"));
				flower.setFcolor(rs.getString("fcolor"));
				flower.setFstyle(rs.getString("fstyle"));
				Type ftype=new Type();
				ftype.setTname(rs.getString("tname"));
				flower.setFtype(ftype);
				flower.setFnum(rs.getInt("fnum"));
				flower.setFnote(rs.getString("fnote"));
				flower.setFbrand(rs.getString("fbrand"));
				flower.setFimgs(rs.getString("fimgs"));
				flower.setFimg1(rs.getString("fimg1"));
				flower.setFimg2(rs.getString("fimg2"));
				flower.setFimg3(rs.getString("fimg3"));
				flower.setFimg4(rs.getString("fimg4"));
				flower.setFimg5(rs.getString("fimg5"));
				
				list.add(flower);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return list;
	}

	@Override
	public boolean insertFlower(Flower flower) {
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql="INSERT INTO `flowershop`.`flower` (`fid`, `fname`, `fprice`, `ftid`, `fgroup`, `fcolor`, `fstyle`, `fnote`, `fnum`, `fbrand`, `ftype`, `fimgs`, `fimg1`, `fimg2`, `fimg3`, `fimg4`, `fimg5`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setInt(1,flower.getFid());
			ptst.setString(2, flower.getFname());
			ptst.setString(3, flower.getFprice());
			ptst.setInt(4, flower.getFtid());
			ptst.setString(5, flower.getFgroup());
			ptst.setString(6, flower.getFcolor());
			ptst.setString(7, flower.getFstyle());
			ptst.setString(8, flower.getFnote());
			ptst.setInt(9, flower.getFnum());
			ptst.setString(10, flower.getFbrand());
			ptst.setString(11, flower.getFtype().getTname());
			ptst.setString(12, flower.getFimgs());
			ptst.setString(13, flower.getFimg1());
			ptst.setString(14, flower.getFimg2());
			ptst.setString(15, flower.getFimg3());
			ptst.setString(16, flower.getFimg4());
			ptst.setString(17, flower.getFimg5());
			
			flag=(ptst.executeUpdate()>0);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return flag;
	}

	@Override
	public boolean deleteFlower(int fid) {
		
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql="delete from flower where fid=?";
		
		try {
			ptst=conn.prepareStatement(sql);

			ptst.setInt(1, fid);
			
			flag=(ptst.executeUpdate()>0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		
		return flag;
	}

	@Override
	public Flower selectFlower(int fid) {

		Flower flower=new Flower();
		
		conn=DBManager.getConnection();
		
		String sql=" select * from flower where fid=?";
		
		try {
			ptst=conn.prepareStatement(sql);

			ptst.setInt(1, fid);
			
			
			rs=ptst.executeQuery();
			
			
			while(rs.next()) {
				
				flower.setFid(rs.getInt("fid"));
				flower.setFname(rs.getString("fname"));
				flower.setFprice(rs.getString("fprice"));
				flower.setFtid(rs.getInt("ftid"));
				flower.setFgroup(rs.getString("fgroup"));
				flower.setFcolor(rs.getString("fcolor"));
				flower.setFstyle(rs.getString("fstyle"));
				flower.setFnum(rs.getInt("fnum"));
				flower.setFnote(rs.getString("fnote"));
				flower.setFbrand(rs.getString("fbrand"));
				flower.setFimgs(rs.getString("fimgs"));
				flower.setFimg1(rs.getString("fimg1"));
				flower.setFimg2(rs.getString("fimg2"));
				flower.setFimg3(rs.getString("fimg3"));
				flower.setFimg4(rs.getString("fimg4"));
				flower.setFimg5(rs.getString("fimg5"));
				
				Type ftype=new Type();
				ftype.setTname(rs.getString("ftype"));
				flower.setFtype(ftype);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.CloseAll(conn, ptst, rs);
		}
		return flower;
		
	}

	@Override
	public boolean updateFlower(Flower flower) {
		boolean flag=false;
		
		conn=DBManager.getConnection();
		
		String sql=" update flower set fname=?,fprice=?,fgroup=?,fnum=?,fnote=?,ftid=? where fid=?";
		
		try {
			ptst=conn.prepareStatement(sql);
			
			ptst.setString(1,flower.getFname());
			ptst.setString(2, flower.getFprice());
			ptst.setString(3, flower.getFgroup());
			ptst.setInt(4, flower.getFnum());
			ptst.setString(5, flower.getFnote());
			ptst.setInt(6, flower.getFtid());
			ptst.setInt(7, flower.getFid());
			
			flag=(ptst.executeUpdate()>0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}

}
