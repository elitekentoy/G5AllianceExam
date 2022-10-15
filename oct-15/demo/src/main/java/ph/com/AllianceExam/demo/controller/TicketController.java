package ph.com.AllianceExam.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ph.com.AllianceExam.demo.service.ITicketService;

@RestController
public class TicketController {
	
	private ITicketService service;
	
	@Autowired
	
	public TicketController(final ITicketService service) {
		
		this.service = service;
	}
	@DeleteMapping("/user/delete/{id}")
	public int delete(@PathVariable final int id) throws IOException
	{		
		
		return service.deleteByID(id);
	}

}
