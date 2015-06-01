clean:
	rm *.class

test: TemplateTest.class
	java -cp .:../junit/junit.jar:../junit/hamcrest-core.jar org.junit.runner.JUnitCore TemplateTest

TemplateTest.class: TemplateTest.java MyApplication.class MyDocument.class
	javac -cp .:../junit/junit.jar TemplateTest.java

MyApplication.class: MyApplication.java Application.class
	javac MyApplication.java

Application.class: Application.java
	javac Application.java

MyDocument.class: MyDocument.java Document.class
	javac MyDocument.java

Document.class: Document.java
	javac Document.java
