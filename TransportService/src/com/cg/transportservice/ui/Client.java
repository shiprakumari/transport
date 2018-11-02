package com.cg.transportservice.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.transportservice.bean.TicketBean;
import com.cg.transportservice.exception.TicketException;
import com.cg.transportservice.service.ITicketService;
import com.cg.transportservice.service.TicketServiceImpl;

public class Client {
	public static void main(String[] args) {
		try{
		Scanner scanner = new Scanner(System.in);
		TicketBean bean = new TicketBean();
		ITicketService ticketService = new TicketServiceImpl();
		Map<String, String> transportDetails = ticketService
				.getTransportDetails();
		System.out.println(" mode of transport :");
		// set id
		int id = (int) ((Math.random()) * 10000);
		bean.setId(id);
		// set TransportCategoryId
		int count = 1;
		for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
			System.out.println(count + ". " + entrySet.getValue());
			count++;
		}
		System.out.println(" enter transport option :");
		int option = scanner.nextInt();
		int count1 = 1;
		for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
			if (count1 == option) {
				bean.setTransportCategoryId(entrySet.getKey());
				break;
			}
			count1++;
		}
		// set reason
		System.out.println(" enter reason");
		scanner.nextLine();
		String reason = scanner.nextLine();
		// or String reason = scanner.next();
		
		bean.setReason(reason);
		// set when
		System.out.println(" enter when");
		System.out.println(" 1. this week \n 2. nect week \n 3. next month");
		int whenChoice = scanner.nextInt();
		if (whenChoice == 1) {
			bean.setWhen("this week");
		}else if (whenChoice == 2) {
			bean.setWhen("next week");
		}else if (whenChoice == 3) {
			bean.setWhen("next month");
		}
		ticketService.addTransportTicket(bean);
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a");
		System.out.println(" bopoked with id "+bean.getId()+" on "+dateTime.format(format));
		}catch(TicketException ticketException){
			System.out.println("Error in fetching details and adding data");
		}catch (Exception e) {
			System.out.println(" internal error. try later.");
		}
	}
}
