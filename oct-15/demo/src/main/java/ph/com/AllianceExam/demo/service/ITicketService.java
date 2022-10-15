package ph.com.AllianceExam.demo.service;

import java.io.BufferedReader;

public interface ITicketService {
	public int create(final BufferedReader body);
	public String retreiveByID(final int id);
	public String retreiveAllTickets();

}
