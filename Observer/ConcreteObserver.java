class ConcreteObserver implements Observer {
	public int subjectState;
	private Subject subject;

	public void setSubject(Subject s) {
		subject = s;
	}

	public void Update() {
		subjectState = subject.GetState();
	}
}
