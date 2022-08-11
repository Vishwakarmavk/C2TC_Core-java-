package com.acharya.multihtread;

class Eclipse extends Thread{
    public void run() {
    	System.out.println("Eclipse thread ID is: "+" "+Thread.currentThread().getId());
    }
}

class PPT extends Thread{
	public void run() {
		System.out.println("PPT Thread Id is:"+" "+Thread.currentThread().getId());
	}
}

public class Extending {

	public static void main(String[] args) {
		Eclipse ob = new Eclipse();
		Thread t = new Thread(ob);
		t.start();
		PPT ob1 = new PPT();
		Thread t1 = new Thread(ob1);
		t1.start();
	}

}
