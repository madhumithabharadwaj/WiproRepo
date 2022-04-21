package pkg_1;

public class sample_1 {

	int id;
	String name;
	char gender;
	int marks;
	
	public void initialize() {
		id=111;
		name="madhu";
		gender='F';
		marks=92;
	}
	public void display() {
		System.out.println("The student's id is "+id);
		System.out.println("The student's name is "+name);
		System.out.println("The student's gender is "+gender);
		System.out.println("The students marks is "+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample_1 s=new sample_1();
		s.initialize();
		s.display();

	}

}

