package com.acharya.stream;

import java.util.Arrays;
import java.util.List;

public class Distinct {
    
	//Method reference
	public static void main(String[] args) {
	  List<Integer> list = Arrays.asList(1,2,3,4,2,4,7,5,6,7);
	  list.stream().distinct().forEach(System.out::println);

	}

}
