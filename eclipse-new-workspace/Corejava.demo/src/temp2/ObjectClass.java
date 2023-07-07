package temp2;

class Student{
	String name;
	int rollno;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
}
public class ObjectClass {

	public static void main(String[] args)
	{
		Student student=new Student("madhu", 1111471);
		System.out.println(student);
		System.out.println(student.toString());
		System.out.println(student.getClass().getDeclaredFields());	
	}
}
