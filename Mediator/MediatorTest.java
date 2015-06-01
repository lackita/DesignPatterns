import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MediatorTest {
	@Test
	public void testMediator() {
		ColleagueOne c1 = new ColleagueOne();
		ColleagueTwo c2 = new ColleagueTwo();
		Mediator m = new Mediator(c1, c2);
		c1.publishEvent("foo");
		assertEquals("foo", c2.lastReceivedEvent());
	}
}
