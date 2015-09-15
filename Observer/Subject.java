import java.util.*;

public abstract class Subject {
	private Set<Observer> observers;
	public Subject() {
		observers = new HashSet<Observer>();
	}

	public void Notify() {
		for (Observer observer : observers) {
			observer.Update();
		}
	}

	public void Attach(Observer o) {
		observers.add(o);
		o.setSubject(this);
	}

	public void Detach(Observer o) {
		observers.remove(o);
	}

	abstract public int GetState();
	abstract public void SetState(int s);
}
