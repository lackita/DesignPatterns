public class ColleagueTwo {
	private String last_event;
	public void send(String p) {
		last_event = p;
	}

	public String lastReceivedEvent() {
		return last_event;
	}
}
