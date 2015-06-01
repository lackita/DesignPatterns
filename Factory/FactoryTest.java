import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FactoryTest {
	@Test
	public void testOpened() {
		MyApplication app = new MyApplication();
		app.newDocument();
		app.openDocument(0);
		assertTrue(app.allOpened());
	}
}
