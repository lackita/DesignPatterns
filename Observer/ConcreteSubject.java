class ConcreteSubject extends Subject {
	private int state;
	public ConcreteSubject(int state) {
		super();
		this.state = state;
	}

	public int GetState() {
		return state;
	}

	public void SetState(int s) {
		state = s;
	}
}
