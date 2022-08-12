package com.acharya.javafeatures;
  interface Actor{
	 void act();
	 void speak();
	 default void comedy(){
		 System.out.println("I can make Comedy");
	 }
	}
  class  Hero implements Actor{
	 public void act() {
		 System.out.println("I can act");
	 }

	public void speak() {
		System.out.println("I can speak");
	}
	public void comdey() {
		System.out.println("I can make people laugh");
		
	}
 }
    public class Feature2{
    public static void main(String[] args) {
    	Hero h = new Hero();
    	h.act();
    	h.comdey();
    	h.comedy();
    }
    
  }
 
