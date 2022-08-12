package com.acharya.javafeatures;

import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class Doubleit{
	public static void doubleIt(int i) {
		System.out.println(i*2);
		
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		//Internal iteration
		list.forEach(i -> doubleIt(i));
		//method referencing
		list.forEach(Doubleit::doubleIt);

	}

}
