package com.acharya.javafeatures;
import java.util.stream.*;

import java.util.Arrays;
import java.util.List;

public class Feature3 {
	public static void main (String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,6,5,7,2);
		list.forEach(System.out::println);
	}

}
