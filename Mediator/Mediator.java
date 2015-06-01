public class Mediator {
	private ColleagueTwo receiver;

	public Mediator(ColleagueOne s, ColleagueTwo r) {
		s.setMediator(this);
		receiver = r;
	}

	public void publish(String p) {
		receiver.send(p);
	}
}
