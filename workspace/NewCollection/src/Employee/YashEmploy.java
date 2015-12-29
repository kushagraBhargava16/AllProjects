package Employee;
import java.util.Collections;


public class YashEmploy  implements Comparable  {
    Integer id;
    String name;
    Integer age;
    Double salary;
    
    public YashEmploy(Integer id, String name, Integer age, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
@Override
	public String toString() {
		
		return "Id:"+id+", Name: "+name+", Salary :"+salary+", Age: "+age;
	}

public int compareTo(Object o) {
	YashEmploy emp= (YashEmploy) o;
	return this.getName().compareToIgnoreCase(emp.getName());
}

}
