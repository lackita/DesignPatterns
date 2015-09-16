import java.util.*;

public class ConcreteMediator implements Mediator {
	private Set<Colleague> senders;
	private Set<Colleague> receivers;
	public ConcreteMediator() {
		senders = new HashSet<Colleague>();
		receivers = new HashSet<Colleague>();
	}

	public void AddSender(Colleague c) {
		senders.add(c);
		c.SetMediator(this);
	}

	public void AddReceiver(Colleague c) {
		receivers.add(c);
	}

	public void Send(int x) {
		for (Colleague r : receivers) {
			r.Notify(x);
		}
	}
}
