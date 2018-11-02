package com.cg.transportservice.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.transportservice.bean.TicketBean;

public class DataBase {
	private static Map<String, String> transportDetails = new HashMap<>();
	private static Map<Integer, TicketBean> transportTicketDetails = new HashMap<>();

	public static Map<String, String> getTransportDetails() {
		transportDetails.put("f-1", "flight");
		transportDetails.put("t-2", "train");
		transportDetails.put("t-1", "taxi");
		return transportDetails;
	}

	public static void addTransportTicket(TicketBean bean) {
		transportTicketDetails.put(bean.getId(), bean);
	}

}
