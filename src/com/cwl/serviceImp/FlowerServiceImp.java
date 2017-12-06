package com.cwl.serviceImp;

import java.util.List;

import com.cwl.dao.FlowerDao;
import com.cwl.daoImp.FlowerDaoImp;
import com.cwl.entity.Flower;
import com.cwl.service.FlowerService;

public class FlowerServiceImp implements FlowerService {

	FlowerDao fdo=new FlowerDaoImp();
	@Override
	public List<Flower> selectAllFlower() {
		return fdo.selectAllFlower();
	}

	@Override
	public boolean insertFlower(Flower flower) {
		return fdo.insertFlower(flower);
	}

	@Override
	public boolean deleteFlower(int fid) {
		return fdo.deleteFlower(fid);
	}

	@Override
	public Flower selectFlower(int fid) {
		return fdo.selectFlower(fid);
	}

	@Override
	public boolean updateFlower(Flower flower) {
		return fdo.updateFlower(flower);
	}

}
