package com.cwl.serviceImp;

import java.util.List;

import com.cwl.dao.CartDao;
import com.cwl.daoImp.CartDaoImp;
import com.cwl.entity.Cart;
import com.cwl.service.CartServce;

public class CartServceImp implements CartServce {

	CartDao cdo=new CartDaoImp();
	@Override
	public List<Cart> getAllCart(String cname) {
		return cdo.getAllCart(cname);
	}

	@Override
	public Cart getCart(int cfid,String cname) {
		return cdo.getCart(cfid,cname);
	}

	@Override
	public boolean insertCart(int cfid,int ccount,String cname) {
		return cdo.insertCart(cfid,ccount,cname);
	}

	@Override
	public boolean deleteCart(int cfid) {
		return cdo.deleteCart(cfid);
	}

	@Override
	public boolean updateCart(int cfid, int ccount, String cname) {
		return cdo.updateCart(cfid, ccount, cname);
	}

	@Override
	public boolean deleteAllCart(String cname) {
		return cdo.deleteAllCart(cname);
	}

}
