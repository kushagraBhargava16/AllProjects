package test;

import java.util.Collection;
import java.util.Iterator;

public final class TestCollection {
	
	public TestCollection(Test test, int a) {
		this.test = test;
		this.a = a;
	}
	public TestCollection() {
	
	}

	Test test;

	public Test getTest() {
		return test;
	}

	public void show() {
		System.out.println("The value is " + a);
	}

	int a;

	public int getA() {
		return a;
	}

	@Override
	public String toString() {
		return "TestCollection [test=" + test + ", a=" + a + "]";
	}

}

class Test {
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + "]";
	}

}
