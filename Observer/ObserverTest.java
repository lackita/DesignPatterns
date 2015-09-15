import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ObserverTest {
	@Test
	public void testObserver() {
		ConcreteSubject s = new ConcreteSubject(1);
		ConcreteObserver o = new ConcreteObserver();
		s.Attach(o);
		s.Notify();
		assertEquals(o.subjectState, 1);
		s.Detach(o);
		s.SetState(2);
		s.Notify();
		assertEquals(o.subjectState, 1);
	}
}
