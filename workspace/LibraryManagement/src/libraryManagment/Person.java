package libraryManagment;

public class Person {
	int personId;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String toString() {
		return "\nPerson :[ID=" + personId + ", Name=" + name + "]";
	}

}
