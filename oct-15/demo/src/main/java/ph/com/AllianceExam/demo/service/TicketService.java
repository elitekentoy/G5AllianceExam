package ph.com.AllianceExam.demo.service;

import java.io.BufferedReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import junit.framework.Test;
import ph.com.AllianceExam.demo.entity.Ticket;
import ph.com.AllianceExam.demo.repository.ITicketRepository;


@Service
public class TicketService implements ITicketService {
	
	private ITicketRepository repository;
	private Gson gson;
	
	@Autowired
	
	public TicketService(final ITicketRepository repository) {
		this.repository = repository;
	}


public int updateByID(final BufferedReader body)
{
	final Ticket ticket = gson.fromJson(body, Ticket.class);
	return repository.updateByID(ticket);
}



}

