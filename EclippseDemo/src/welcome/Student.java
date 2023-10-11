package welcome;

public class Student {


	public static void main(String[] args) {
		ClassDemo s1 = new ClassDemo();
		System.out.println("Before initializing");
		System.out.println("ID = " + s1.id + ", Name = " + s1.Name + ", Gender = " + s1.Gender + ", CGPA = " + s1.CGPA);
		s1.id = 120;
		s1.Name = "Vishnu";
		s1.Gender = 'M';
		s1.CGPA = 6.9;
		System.out.println("After initializing");
		System.out.println("ID = " + s1.id + ", Name = " + s1.Name + ", Gender = " + s1.Gender + ", CGPA = " + s1.CGPA);
		System.out.println("Behaviour");
		s1.student();
		s1.markAttendence();
		

	}

}
