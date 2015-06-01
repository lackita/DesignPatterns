import java.util.ArrayList;

public abstract class Application {
	private ArrayList<Document> docs;

	public Application() {
		docs = new ArrayList<Document>();
	}

	public void openDocument(String name) {
		if (!canOpenDocument(name)) {
			// cannot handle this document
			return;
		}

		Document doc = createDocument();
		if (doc != null) {
			docs.add(doc);
			aboutToOpenDocument(doc);
			doc.open();
			doc.read();
		}
	}

	public abstract Document createDocument();
	public abstract boolean canOpenDocument(String name);
	public abstract void aboutToOpenDocument(Document doc);
}
