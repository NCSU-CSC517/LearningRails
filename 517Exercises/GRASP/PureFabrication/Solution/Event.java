import java.util.Date;

public class Event {
	Date eventTime;
	String serverId;
	String eventDescription;

	public Event(Date date, String server, String description) {
		// this.__________(7)__________ = date;
		this.eventTime = date;
		// this.__________(8)__________ = server;
		this.serverId = server;
		// this.__________(9)__________ = description;
		this.eventDescription = description;
	}
}
