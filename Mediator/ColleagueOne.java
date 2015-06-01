public class ColleagueOne {
	private Mediator mediator;

	public void setMediator(Mediator m) {
		mediator = m;
	}

	public void publishEvent(String p) {
		mediator.publish(p);
	}
}
