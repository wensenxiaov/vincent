package com.cwl.serviceImp;


import java.util.List;

import com.cwl.dao.ClientDao;
import com.cwl.daoImp.ClientDaoImp;
import com.cwl.entity.Client;
import com.cwl.service.ClientServce;

public class ClientServiceImp implements ClientServce {

	ClientDao cdo= new ClientDaoImp();
	
	@Override
	public boolean insertClient(Client client) {
		return cdo.insertClient(client);
	}

	@Override
	public boolean selectClient(Client client) {
		return cdo.selectClient(client);
	}

	@Override
	public Client seletctClient1(String cname) {
		return cdo.seletctClient1(cname);
	}

	@Override
	public Client selectByMail(String cmail) {
		return cdo.selectByMail(cmail);
	}

	@Override
	public List<Client> selectAllClient() {
		return cdo.selectAllClient();
	}

	@Override
	public Client selectByTelphone(String ctel) {
		return cdo.selectByTelphone(ctel);
	}

	@Override
	public boolean deleteClient(int cid) {
		return cdo.deleteClient(cid);
	}

}
