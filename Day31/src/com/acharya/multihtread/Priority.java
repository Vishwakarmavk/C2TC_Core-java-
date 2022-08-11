package com.acharya.multihtread;


	class Eclipse01 extends Thread{
	    public void run() {
	    	System.out.println("Eclipse thread ID is: "+" "+Thread.currentThread().getId());
	    	System.out.println("Eclipse Thread Priority is:"+Thread.currentThread().getPriority());
	    }
	}

	class PPT01 extends Thread{
		public void run() {
			System.out.println("PPT Thread Id is:"+" "+Thread.currentThread().getId());
			System.out.println("Eclipse Thread Priority is:"+Thread.currentThread().getPriority());
		}
	}

	public class Priority {

		public static void main(String[] args) {
			Eclipse01 ob = new Eclipse01();
			Thread t = new Thread(ob);
			t.start();
			ob.setPriority(6);
			PPT01 ob1 = new PPT01();
			Thread t1 = new Thread(ob1);
			ob1.setPriority(7);
			t1.start();
		}

	}



