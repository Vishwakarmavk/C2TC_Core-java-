package com.acharya.multihtread;

class Eclipse02 extends Thread{
    public void run() {
    	System.out.println("Eclipse thread ID is: "+" "+Thread.currentThread().getId());
    	System.out.println("Eclipse Thread Priority is:"+Thread.currentThread().getPriority());
    }
}

class PPT02 extends Thread{
	public void run() {
		System.out.println("PPT Thread Id is:"+" "+Thread.currentThread().getId());
		System.out.println("Eclipse Thread Priority is:"+Thread.currentThread().getPriority());
	}
}

public class Constants_Threads {

	public static void main(String[] args) {
		Eclipse02 ob = new Eclipse02();
		ob.start();
		ob.setPriority(Thread.MIN_PRIORITY);
		PPT02 ob1 = new PPT02();
		ob1.start();
		ob1.setPriority(Thread.MAX_PRIORITY);
	}

}




