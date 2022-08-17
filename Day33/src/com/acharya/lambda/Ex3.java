package com.acharya.lambda;

  interface Sayable2 {
   public void say();
}
   public class Ex3{
   public static void main(String[] args) {
          Sayable2 s=() -> { 
          System.out.println("I have nothing to say");
          System.out.println("I have nothing to say");
          System.out.println("I have nothing to say"); 
           } ;
          s.say();
  }
}