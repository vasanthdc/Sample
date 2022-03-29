package org.test;

public class Test extends Sample {
	
	public void deposit() {
		System.out.println("Deposit is 12%");
	}
	public static void main(String[] args) {
		Test t= new Test();
		t.deposit();
		t.savings();
	}

}
