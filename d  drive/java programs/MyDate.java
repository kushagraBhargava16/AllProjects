package org.company;

class MyDate{
	private int day=1;
	private int month=1;
	private int year=2000;
	
		public MyDate(int day,int month,int year){
			this.day=day;
			this.month=month;
			this.year=year;
		}
		
		public MyDate(MyDate date){
			this.day=date.day;
			this.month=date.month;
			this.year=date.year;
		}
		public MyDate addDays(int moreDays){
			MyDate d1= new MyDate(this.day,this.month,this.year);
			int newDay=d1.day +moreDays;
			d1.day +=moreDays;
			
			while(newDay>28){
				switch(d1.month){
				
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						if(newDay>31){
							d1.day=newDay-31;
							if(d1.month==12){
								d1.month=1;
								d1.year=d1.year+1;
						
							}
						
							else{
								d1.month=d1.month+1;	
							}
							newDay=newDay-31;
						}
							break;
				
					case 2:
						if(newDay>28){
							d1.day=newDay-28;
							d1.month=3;
							newDay=newDay-28;
						}
							break;
				
					case 4:
					case 6:
					case 9:
					case 11:
							
						if(newDay>30){
						d1.day=newDay-30;
						d1.month = d1.month +1;
						newDay=newDay-30;
						}
						break;
				
					default:
						System.out.println("This is not a valid date");
						break;
				}
		
				
				
			}
			return d1;
		}
		public String toString(){
		 return (this.day+"-"+this.month+"-"+this.year);
		}
}