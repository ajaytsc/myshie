package com.javatechie.spring.mysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.mysql.api.dao.TicketDao;
import com.javatechie.spring.mysql.api.model.Ticket;



@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao dao;

	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		dao.save(tickets);
		return "ticket booked : " + tickets.size();
	}
	@DeleteMapping("/deleteTickets")
	public String deleteTicket(@RequestBody List<Ticket> tickets)
	{
		dao.delete(2);
		return "ticket delete:"+tickets.size();
	}
	
	@GetMapping("/getTickets")
	public List<Ticket> getTickets() {
		return (List<Ticket>) dao.findAll();
	}
	@RequestMapping(value = "/etc", method = RequestMethod.GET)
	public Ticket firstPage() {

		Ticket tic = new Ticket();
	    tic.setId(1);
	    tic.setCatagory("movie");
        tic.setAmount(452);
		return tic;
	}
}
