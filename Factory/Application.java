import java.util.ArrayList;

public abstract class Application {
	private ArrayList<Document> docs;

	public Application() {
		docs = new ArrayList<Document>();
	}

	public abstract Document createDocument();

	public void newDocument() {
		Document doc = createDocument();
		docs.add(doc);
		doc.open();
	}
}
