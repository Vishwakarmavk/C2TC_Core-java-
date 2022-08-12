package com.acharya.stream;

import java.util.Arrays;
import java.util.List;

public class Lazyproof {
	public static boolean isDivisible(int i) {
		System.out.println("In Divisible"+i);
		return i%5==0;
	}
	public static int mapDouble(int i) {
		System.out.println("In mapDouble"+i);
		return i*2;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,5,6,2,8,9);
		System.out.println(list.stream().filter(Lazyproof::isDivisible)
				.map(Lazyproof::mapDouble).findFirst().orElse(0));
		

	}

}
