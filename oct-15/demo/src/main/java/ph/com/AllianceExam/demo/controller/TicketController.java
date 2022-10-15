package ph.com.AllianceExam.demo.controller;


import java.io.IOException;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.io.BufferedReader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import ph.com.AllianceExam.demo.service.ITicketService;

@RestController
public class TicketController {
	
	private ITicketService service;
	
	@Autowired
	
	public TicketController(final ITicketService service) {
	}
	
	@PostMapping("/ticket/{id}")
	public int save(final HttpServletRequest request) throws IOException
	{
		final BufferedReader body = request.getReader();
		return service.create(body);
	}
	

	@RequestMapping("ticket/{id}")
	public String retreiveTicketsByID(@PathVariable final int id) {
		return service.retreiveByID(id);
	}

	@DeleteMapping("/user/delete/{id}")
	public int delete(@PathVariable final int id) throws IOException
	{		
		return service.deleteByID(id);
	}


	@RequestMapping("ticket/all")
	public String retrieveAllTickets() {
		return service.retreiveAllTickets();
	}


}
