package com.acharya.stream;

import java.util.Arrays;
import java.util.List;

public class Findfirst {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,5,6,8,10);
		System.out.println(list.stream().filter(i->i%2==0).map(i->i*2).findFirst());
		System.out.println(list.stream().filter(i->i%2==0).map(i->i*2).findFirst().orElse(0));

	}

}
