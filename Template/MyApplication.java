public class MyApplication extends Application {
	public Document createDocument() {
		return new MyDocument();
	}

	public boolean canOpenDocument(String name) {
		return true;
	}

	public void aboutToOpenDocument(Document doc) {}
}
