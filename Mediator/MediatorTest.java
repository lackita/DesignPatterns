import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MediatorTest {
	@Test
	public void testMediator() {
		ConcreteReceiver receiver = new ConcreteReceiver();
		ConcreteSender sender = new ConcreteSender();
		Mediator m = new ConcreteMediator();
		m.AddSender(sender);
		m.AddReceiver(receiver);
		sender.Send(1);
		assertEquals(receiver.received, 1);
	}
}
