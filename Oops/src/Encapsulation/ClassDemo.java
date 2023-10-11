package Encapsulation;

public class ClassDemo {

	public static void main(String[] args) {
		
		
		ClassDemoApp c1= new ClassDemoApp(0, null, 0, null);
		

		System.out.println("RollNumber = "+c1.getRollnum());
		System.out.println("Name = "+c1.getname());
		System.out.println("Marks = "+c1.getmarks());
		System.out.println("Gender = "+c1.getGender());
		System.out.println("-------< >-------");

		c1.setRollnum(1234);
		c1.setname("Vishnu");
		c1.setmarks(90);
		c1.setGender("Male");
		
		
		System.out.println("RollNumber = "+c1.getRollnum());
		System.out.println("Name = "+c1.getname());
		System.out.println("Marks = "+c1.getmarks());
		System.out.println("Gender = "+c1.getGender());
	}

}
