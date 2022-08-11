package com.acharya.multihtread;

class Eclipse03 extends Thread{
    public void run() {
    	for(int i=0;i<=7;i++) {
    	System.out.println("Eclipse thread ID is: "+" "+Thread.currentThread().getId());
          try {
        	  sleep(1000);
          }
          catch(Exception e){
        	  System.out.println(e); 
          }
    	}	
   }
 }

class PPT03 extends Thread{
	public void run() {
		System.out.println("PPT Thread Id is:"+" "+Thread.currentThread().getId());
	}
}

public class Sleep_inThread {

	public static void main(String[] args) {
		Eclipse03 ob = new Eclipse03();
		Thread t = new Thread(ob);
		t.start();
	}

}
