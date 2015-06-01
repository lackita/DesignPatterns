import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TemplateTest {
	@Test
	public void testOpenDocument() {
		MyApplication app = new MyApplication();
		app.openDocument("foo");
	}
}
