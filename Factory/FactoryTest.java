import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FactoryTest {
	@Test
	public void testNewDocument() {
		MyApplication app = new MyApplication();
		app.newDocument();
	}
}
