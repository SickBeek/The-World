public class Joestar {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.ChangeGender();
		st1.ChangeName("Jolyne");
		st1.ChangeID(2016150177);
		System.out.println("My name is "+st1.getName()+".");
		if(st1.getGender()=="F")
		System.out.println("I am a girl.");
		else if(st1.getGender()=="F")
			System.out.println("I am a boy.");
		
		System.out.println("My StudentID is "+st1.getID());
	}

}

class Student {
	private String name = "John";
	private String gender = "M";
	private int id = 0;

	public void ChangeName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void ChangeGender() {
		if (gender == "M")
			gender = "F";
		else
			gender = "M";
	}

	public String getGender() {
		return gender;
	}

	public void ChangeID(int newid) {
		id = newid;
	}

	public int getID() {
		return id;

	}
}
