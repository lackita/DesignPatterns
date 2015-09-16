public interface Mediator {
	public void AddSender(Colleague c);
	public void AddReceiver(Colleague c);
	public void Send(int x);
}
