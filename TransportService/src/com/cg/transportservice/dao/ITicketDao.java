
package com.cg.transportservice.dao;

import java.util.Map;

import com.cg.transportservice.bean.TicketBean;
import com.cg.transportservice.exception.TicketException;

public interface ITicketDao {

	Map<String, String> getTransportDetails() throws TicketException;

	void addTransportTicket(TicketBean bean) throws TicketException;

}
