package org.company;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


class TestDate{
	public static void main(String[] args){
		MyDate d1=new MyDate(18,9,1967);
		MyDate d2=new MyDate(22,2,2005);
		MyDate d3=new MyDate(d1);
		MyDate d4=d1;
		MyDate d5=d2;
		
		System.out.println("Date 1: "+d1);
		System.out.println("Date 2: "+d2);
		System.out.println("Date 3: "+d3);
		System.out.println("Date 4: "+d4);
		System.out.println("Date 5: "+d5);
		System.out.println();
		
		System.out.println( d5+" + 365 days= "+d5.addDays(365));
		System.out.println();
		System.out.println(d4+" + 10 days= "+d4.addDays(10));
		System.out.println();
		System.out.println("Date 4: "+d4);
		System.out.println("Date 5: "+d5);
		System.out.println();System.out.println();
		//current
		 Date date = new Date();
		 
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		
	   //MyDate current_date=(MyDate) dateFormat.format(date);
	   
	   //System.out.println( d5+" + 365 days= "+current_date.addDays(365));
	
	}
}