package com.acharya.stream;

import java.util.Arrays;
import java.util.List;

public class StreamSum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
	    System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)->(c+e)));
	    System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)-> Integer.sum(c, e)));
	    System.out.println(list.stream().map(i->i*2).reduce(0,Integer::sum));

	}

}
