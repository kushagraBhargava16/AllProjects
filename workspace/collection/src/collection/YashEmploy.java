//Assigment 3 + compareable
package collection;

public class YashEmploy implements Comparable{
	
		int id;
		String name;
		int age;
		double salary;
		

		public YashEmploy(int id, String name, int age, double salary) {
			// TODO Auto-generated constructor stub
			this.id = id;
			this.name = name;
			this.age = age;
			this.salary = salary;
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
		
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}


		
		
		public String toString() {
			return "YashEmploy [id=" + id + " name=" + name + " age=" + age
					+ " salary=" + salary + "]";
		}
		
		public int compareTo(Object arg0) {
			YashEmploy employ=(YashEmploy)arg0;
			return (this.name.compareTo(employ.name));
		}
	}


