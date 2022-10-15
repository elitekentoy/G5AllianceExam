package ph.com.AllianceExam.demo.controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ph.com.AllianceExam.demo.service.ITicketService;

@RestController
public class TicketController {
	
	private ITicketService service;
	
	@Autowired
	
	public TicketController(final ITicketService service) {
		
		this.service = service;
	}

	@PostMapping("/ticket/{id}")
	public int udpateByID(final HttpServletRequest request) throws IOException
	{
		final BufferedReader body = request.getReader();
		return service.updateByID(body);
	}
	
	
	public int updateByID(final HttpServletRequest request) throws IOException
	{
		final BufferedReader body = request.getReader();
		return service.updateByID(body);
	}

}

