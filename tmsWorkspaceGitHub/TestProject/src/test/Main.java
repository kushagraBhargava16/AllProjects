package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.management.remote.SubjectDelegationPermission;

public class Main {

	public static void main(String[] args) {
MyThread myThread=new MyThread();
Thread thread=new Thread(myThread);
thread.setDaemon(true);
thread.start();
		

	}

}
