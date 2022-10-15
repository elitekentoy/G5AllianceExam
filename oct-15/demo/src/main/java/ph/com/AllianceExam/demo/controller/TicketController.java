package ph.com.AllianceExam.demo.controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
	

}
