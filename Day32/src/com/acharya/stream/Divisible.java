package com.acharya.stream;

import java.util.Arrays;
import java.util.List;

public class Divisible {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,4,6,8,10,7);
		System.out.println(list.stream().filter(i->i%2==0).reduce(0,(c,e)->(c+e)));
		System.out.println(list.stream().filter(i->i%2==0).reduce(0,(c,e)->Integer.sum(c, e)));
		System.out.println(list.stream().filter(i->i%2==0).reduce(0,Integer::sum));
		System.out.println(list.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(c,e)->(c+e)));

	}

}
