package com.yash.lock;

public class MyDeadlock {
 public static void main(String a[]){
    Thread Object1= new Thread(new LockDemo(),"Object1");
    Thread Object2= new Thread(new LockDemo(),"Object2");
    
    Object1.start();
    
    Object2.start();
    }
}

