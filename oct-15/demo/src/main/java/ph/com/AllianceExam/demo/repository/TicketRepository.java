package ph.com.AllianceExam.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ph.com.AllianceExam.demo.entity.Ticket;

@Repository

public class TicketRepository implements ITicketRepository {

	@Autowired 
	
	private JdbcTemplate template;
	
	public int create(final Ticket ticket) {
		final String sql = "INSERT INTO ticket (ticketID, assignee, status, subject, description, tracker) VALUES (?, ?, ?, ?, ?, ?)";
		final int result = template.update(sql, ticket.getTicketID(), ticket.getAssignee(), ticket.getStatus(), ticket.getSubejct(), ticket.getDescription(), ticket.getTracker());
		
		return result;
	}
	
}
