package com.cg.transportservice.dao;

import java.util.Map;

import com.cg.transportservice.bean.TicketBean;
import com.cg.transportservice.exception.TicketException;
import com.cg.transportservice.util.DataBase;

public class TicketDaoImpl implements ITicketDao {

	@Override
	public Map<String, String> getTransportDetails() throws TicketException {
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransportTicket(TicketBean bean)  throws TicketException {
		DataBase.addTransportTicket(bean);
	}

}
