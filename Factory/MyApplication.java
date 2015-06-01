public class MyApplication extends Application {
	public Document createDocument() {
		return new MyDocument();
	}

	public boolean allOpened() {
		for (Document d : docs) {
			if (!((MyDocument) d).opened) return false;
		}
		return true;
	}
}
