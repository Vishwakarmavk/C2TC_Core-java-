package com.acharya.lambda;


interface Drawable{
	public void draw(int radius);
}

public class Ex4 {

	public static void main(String[] args) {
		Drawable d = (int radius)->{System.out.println("Draw a circle of radius of "+radius);};
        d.draw(6);
	}

}
