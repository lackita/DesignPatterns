clean:
	rm *.class

test: FactoryTest.class
	java -cp .:../junit/junit.jar:../junit/hamcrest-core.jar org.junit.runner.JUnitCore FactoryTest

FactoryTest.class: FactoryTest.java MyApplication.class MyDocument.class
	javac -cp .:../junit/junit.jar FactoryTest.java

MyApplication.class: MyApplication.java Application.class
	javac MyApplication.java

Application.class: Application.java
	javac Application.java

MyDocument.class: MyDocument.java Document.class
	javac MyDocument.java

Document.class: Document.java
	javac Document.java
