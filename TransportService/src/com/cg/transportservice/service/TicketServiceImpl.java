package com.cg.transportservice.service;

import java.util.Map;

import com.cg.transportservice.bean.TicketBean;
import com.cg.transportservice.dao.ITicketDao;
import com.cg.transportservice.dao.TicketDaoImpl;
import com.cg.transportservice.exception.TicketException;

public class TicketServiceImpl implements ITicketService {

	private ITicketDao dao=new TicketDaoImpl();
	
	@Override
	public Map<String, String> getTransportDetails() throws TicketException {
		return dao.getTransportDetails();
	}


	@Override
	public void addTransportTicket(TicketBean bean) throws TicketException {
		dao.addTransportTicket(bean);
	}

	
}
