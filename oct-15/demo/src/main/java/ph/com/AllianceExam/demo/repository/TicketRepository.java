package ph.com.AllianceExam.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class TicketRepository implements ITicketRepository {

	@Autowired 
	
	private JdbcTemplate template;
	
	
	
	public int deleteByID(final int id)
	{
		final String sql = "DELETE FROM allianceschema WHERE userid=?";
		final int result = template.update(sql, id);
 
		return result;
	}
	
}
