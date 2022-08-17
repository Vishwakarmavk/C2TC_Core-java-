package com.acharya.lambda;

import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
	    ArrayList<String> ob = new ArrayList<>();
        ob.add("Ravi");
        ob.add("Rama");
        ob.add("Vimala");
        ob.forEach(temp->System.out.println(temp));
	}

}
