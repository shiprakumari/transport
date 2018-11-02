package com.cg.transportservice.service;

import java.util.Map;

import com.cg.transportservice.bean.TicketBean;
import com.cg.transportservice.exception.TicketException;

public interface ITicketService {

	Map<String, String> getTransportDetails() throws TicketException;

	void addTransportTicket(TicketBean bean) throws TicketException;

}
