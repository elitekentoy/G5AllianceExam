package ph.com.AllianceExam.demo.entity;

public class Ticket {
    private int ticketID;
	private String assignee;
	private String status;
	private String subejct;
	private String description;
	private String tracker;
	
	
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubejct() {
		return subejct;
	}
	public void setSubejct(String subejct) {
		this.subejct = subejct;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTracker() {
		return tracker;
	}
	public void setTracker(String tracker) {
		this.tracker = tracker;
	}
	
	
	
}
