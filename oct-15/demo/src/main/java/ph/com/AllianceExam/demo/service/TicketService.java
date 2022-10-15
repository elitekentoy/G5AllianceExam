package ph.com.AllianceExam.demo.service;

import java.io.BufferedReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;


import ph.com.AllianceExam.demo.entity.Ticket;
import ph.com.AllianceExam.demo.repository.ITicketRepository;

@Service
public class TicketService implements ITicketService {

	
	private ITicketRepository repository;
	private Gson gson;
	
	@Autowired
	
	public TicketService(final ITicketRepository repository) {
		this.repository = repository;
		this.gson = new Gson();
	}

	public String retreiveByID(int id) {
		return gson.toJson(repository.retreiveTicketByID(id));
	}

	
	public int create(final BufferedReader body)
	{
		//from just a simple requestBody, we transform it to a class using fromJson
		final Ticket user = gson.fromJson(body, Ticket.class);
		
		return repository.create(user);
	}


	public String retreiveAllTickets() {
		return gson.toJson(repository.retreiveAllTickets());
	}
	
	
}
