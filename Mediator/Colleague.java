public abstract class Colleague {
	private Mediator mediator;
	public void SetMediator(Mediator m) {
		mediator = m;
	}

	public void SendToMediator(int x) {
		mediator.Send(x);
	}

	public void Notify(int x) {}
}
