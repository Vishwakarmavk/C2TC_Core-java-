package com.acharya.lambda;

interface Drawable1{
	public void draw(int width,int length);
}

public class Ex5 {

	public static void main(String[] args) {
	  Drawable1 d1 =(int width,int length)->
	             {System.out.println("Draw cube of width and length of :"+width+" "+length);
				};
      d1.draw(8, 7);
	}

}
