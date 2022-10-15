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
	
	@PostMapping("/ticketID")
	public int save(final HttpServletRequest request) throws IOException
	{
		// the reader is where the body is found we then pass this to the service so it'll be processed there
		final BufferedReader body = request.getReader();
		
		//No exception handling is provided in this demo. Please DIY :)
		return service.create(body);
	}
	

}
