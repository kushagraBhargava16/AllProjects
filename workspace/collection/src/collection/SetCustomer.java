package collection;


public class SetCustomer implements Comparable {
	
			int id;
			String name;
			int age;
			
			
			
			public SetCustomer(int id, String name, int age) {
				// TODO Auto-generated constructor stub
				super();
				this.id = id;
				this.name = name;
				this.age = age;
			}

			


			public int getId() {
				return id;
			}


			public void setId(int id) {
				this.id = id;
			}


			public String getName() {
				return name;
			}


			public void setName(String name) {
				this.name = name;
			}


			public int getAge() {
				return age;
			}


			public void setAge(int age) {
				this.age = age;
			}
			
			
			
			
			public String toString(){
				
				return ("Id:" +this.id+ "  Name:"+ this.name+ " Age is"+ this.age);
						
			}
			
			public int compareTo(Object arg0) {
				SetCustomer customer=(SetCustomer)arg0;
				 
				return (this.name.compareTo(customer.name));
			}
			
}

