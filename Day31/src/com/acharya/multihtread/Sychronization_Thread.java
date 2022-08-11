package com.acharya.multihtread;

class Counter{
	int count;
	public synchronized void incremant() {
		count++;
	}
}

public class Sychronization_Thread {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		Thread t =new Thread(new Runnable() {
			public void run() {
				c.incremant();
			}
		});
		t.start();
		t.join();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				c.incremant();
			}
		});
		t1.start();
		t1.join();
		System.out.println(c.count);
	}

}
