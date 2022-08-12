package com.acharya.javafeatures;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Feature1 {

	public static void main(String[] args) {
		List<Integer> List = Arrays.asList(1,2,3,4,5,6);
		//for loop
		/*for(int i=0;i<6;i++)
		{
			System.out.println(i);
		}
		//Iterator
		Iterator itr = List.iterator();
		{
			System.out.println(itr);
		}
		//Enhanced for loop
		for(Integer i: List)
		{
			System.out.println(i);
		}*/
		List.forEach(v -> System.out.println(v));
		

	}

}
