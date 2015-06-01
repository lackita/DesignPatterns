import java.util.ArrayList;

public abstract class Application {
	protected ArrayList<Document> docs;

	public Application() {
		docs = new ArrayList<Document>();
	}

	public abstract Document createDocument();

	public void newDocument() {
		Document doc = createDocument();
		docs.add(doc);
		doc.open();
	}

	public void openDocument(int i) {
		docs.get(i).open();
	}
}
