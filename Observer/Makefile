clean:
	rm *.class

test: ObserverTest.class
	java -cp .:../junit/junit.jar:../junit/hamcrest-core.jar org.junit.runner.JUnitCore ObserverTest

ObserverTest.class: ObserverTest.java ConcreteSubject.class
	javac -cp .:../junit/junit.jar ObserverTest.java

ConcreteSubject.class: ConcreteSubject.java Subject.class
	javac ConcreteSubject.java

Subject.class: Subject.java
	javac Subject.java

ConcreteObserver.class: ConcreteObserver.java Observer.class
	javac ConcreteObserver.java

Observer.class: Observer.java
	javac Observer.java
