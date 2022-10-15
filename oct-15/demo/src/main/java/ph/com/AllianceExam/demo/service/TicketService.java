package ph.com.AllianceExam.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ph.com.AllianceExam.demo.repository.ITicketRepository;

@Service
public class TicketService implements ITicketService {

	
	private ITicketRepository repository;
	
	
	@Autowired
	
	public TicketService(final ITicketRepository repository) {
		this.repository = repository;
		
	}
	
	
	
	   public int deleteByID(final int id)
	    {
	        return repository.deleteByID(id);
	    }



}
