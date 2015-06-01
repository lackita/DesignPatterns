public class MyDocument extends Document {
	public boolean opened;

	public MyDocument() {
		opened = false;
	}

	public void open() {
		opened = true;
	}
}
