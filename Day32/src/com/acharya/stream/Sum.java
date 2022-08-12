package com.acharya.stream;

import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        int result = 0;
        for(int i:list) {
        	result = result+i*2;
        }
        System.out.println(result);
	}
}


     

