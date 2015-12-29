package com.yash.lock;

public class LockDemo implements Runnable{
 String str1="lock1";
 String str2="lock2";
 
	public void run() {

		
		if(Thread.currentThread().getName().equalsIgnoreCase("Object1")){
			
			synchronized (str1) {
				System.out.println("Object1 acquired "+str1);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Object1 Waiting for "+str2);
				
				synchronized (str2) {
					System.out.println("Object1 acquired "+str2+" and "+str1);
					
				}
			}
		}
		
		else if(Thread.currentThread().getName().equalsIgnoreCase("Object2")){
			synchronized (str2) {
				System.out.println("Object2 acquired "+str2);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}System.out.println("Object2 Waiting for "+str1);
				synchronized (str1) {
					System.out.println("Object2 acquired "+str1+"and"+str2);
					
				}
			}
		}
	}

	 
   
    }