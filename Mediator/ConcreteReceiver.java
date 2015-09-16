public class ConcreteReceiver extends Colleague {
	public int received;
	public void Notify(int x) {
		received = x;
	}
}
