package com.acharya.multihtread;

class Eclipse0 extends Thread{
    public void run() {
    	for(int i=0;i<5;i++) {
    	System.out.println("Eclipse thread ID is: "+" "+Thread.currentThread().getId());
    }
}
}

class PPT0 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("PPT Thread Id is:"+" "+Thread.currentThread().getId());
	}
}
}

public class Ex1 {

	public static void main(String[] args) {
		Eclipse0 ob = new Eclipse0();
		Thread t = new Thread(ob);
		t.start();
		PPT0 ob1 = new PPT0();
		Thread t1 = new Thread(ob1);
		t1.start();
	}

}

