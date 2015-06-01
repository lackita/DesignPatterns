clean:
	rm *.class

test: MediatorTest.class
	java -cp .:../junit/junit.jar:../junit/hamcrest-core.jar org.junit.runner.JUnitCore MediatorTest

MediatorTest.class: MediatorTest.java Mediator.class ColleagueOne.class ColleagueTwo.class
	javac -cp .:../junit/junit.jar MediatorTest.java

Mediator.class: Mediator.java ColleagueOne.class ColleagueTwo.class
	javac Mediator.java

ColleagueOne.class: ColleagueOne.java
	javac ColleagueOne.java

ColleagueTwo.class: ColleagueTwo.java
	javac ColleagueTwo.java
