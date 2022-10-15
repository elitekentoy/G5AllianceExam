package ph.com.AllianceExam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.AllianceExam.demo.service.ITicketService;

@RestController
public class TicketController {
	
	private ITicketService service;
	
	@Autowired
	
	public TicketController(final ITicketService service) {
		
		this.service = service;
	}
	
	@RequestMapping("ticket/{id}")
	public String retreiveTicketsByID(@PathVariable final int id) {
		return service.retreiveByID(id);
	}
	
	@RequestMapping("ticket/all")
	public String retrieveAllTickets() {
		return service.retreiveAllTickets();
	}

}
