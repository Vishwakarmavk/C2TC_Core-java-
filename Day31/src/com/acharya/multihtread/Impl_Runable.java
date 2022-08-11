package com.acharya.multihtread;

class Eclipse1 implements Runnable{

public void run() {

System.out.println("Eclipse thread ID is" + +Thread.currentThread().getId());

}
}
class PPT1 implements Runnable{
	public void run() {
		System.out.println("PPTthread ID is:" +" " + Thread.currentThread().getId());
}

}

 public class Impl_Runable {

 public static void main(String[] args) {

    Eclipse1 ob = new Eclipse1();

    Thread t = new Thread(ob);

    t.start();

    PPT1 ob1= new PPT1();

    Thread t1 = new Thread(ob1);

    t1.start();
}

}