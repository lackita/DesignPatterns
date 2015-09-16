clean:
	rm *.class

test: MediatorTest.class
	java -cp .:../junit/junit.jar:../junit/hamcrest-core.jar org.junit.runner.JUnitCore MediatorTest

MediatorTest.class: MediatorTest.java ConcreteMediator.class ConcreteSender.class ConcreteReceiver.class
	javac -cp .:../junit/junit.jar MediatorTest.java

ConcreteMediator.class: ConcreteMediator.java Mediator.class
	javac ConcreteMediator.java

Mediator.class: Mediator.java Colleague.class
	javac Mediator.java

Colleague.class: Colleague.java
	javac Colleague.java

ConcreteSender.class: ConcreteSender.java Colleague.class
	javac ConcreteSender.java

ConcreteReceiver.class: ConcreteReceiver.java Colleague.class
	javac ConcreteReceiver.java
