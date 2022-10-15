package ph.com.AllianceExam.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ph.com.AllianceExam.demo.entity.Ticket;

@Repository

public class TicketRepository implements ITicketRepository {

	@Autowired 
	
	private JdbcTemplate template;
	


public int updateByID(final Ticket ticket)
{

	final String sql = "UPDATE Ticket SET  assignee=?, status=?, subejct=?, description=?, tracker=? WHERE ticketID=?";
	final int result = template.update(sql, ticket.getAssignee(), ticket.getStatus(), ticket.getSubejct(), ticket.getDescription(), ticket.getTracker(), ticket.getTicketID());
	
	return result;
}

}

