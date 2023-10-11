package welcome;

public class TrainerApp2 {

	public static void main(String[] args) {
		{
			Trainer2 s1 = new Trainer2();
			s1.ID = 1234;
			s1.Name = "Vishnu";
			s1.skills = "CSS";
			System.out.println("ID =" + s1.ID + ", Name =" + s1.Name +", skills =" + s1.skills);
			s1.train();
			s1.study();
		}
		{
			Trainer2 s2 = new Trainer2();
			s2.ID = 1234;
			s2.Name = "Sujan T R";
			s2.skills = "Java Script";
			System.out.println("ID =" + s2.ID + ", Name =" + s2.Name +", skills =" + s2.skills);
			s2.train();
			s2.study();
		}

	}

}
