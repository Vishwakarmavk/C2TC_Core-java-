package com.acharya.lambda;

interface Addition{
	public int add();
}

public class Ex6 {

	public static void main(String[] args) {
		Addition a =()->(10+3);{System.out.println(a.add());};

	}

}
