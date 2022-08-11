package com.acharya.multihtread;

class Eclipse2 implements Runnable{

public void run() {
	for(int i=0;i<5;i++) {   
    System.out.println("Eclipse thread ID is" + +Thread.currentThread().getId());

    }
  }
}
class PPT2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("PPTthread ID is:" +" " + Thread.currentThread().getId());
    }

  }
}

 public class Ex2 {

 public static void main(String[] args) {

    Eclipse2 ob = new Eclipse2();

    Thread t = new Thread(ob);

    t.start();

    PPT0 ob1= new PPT0();

    Thread t1 = new Thread(ob1);

    t1.start();
}

}
