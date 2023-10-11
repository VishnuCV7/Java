package welcome;

public class TrainerApp {

	public static void main(String[] args) {
		{
			Trainer s1 = new Trainer();
			s1.ID = 1234;
			s1.Name = "Darshan N T";
			s1.skills = "Java";
			System.out.println("ID = " + s1.ID + ", Name = " + s1.Name + ", skills = " + s1.skills);
			s1.train();
			s1.solveproblem();
		}
		{
			Trainer s2 = new Trainer();
			s2.ID = 5678;
			s2.Name = "Siddesh";
			s2.skills = "HTML";
			System.out.println("ID = " + s2.ID + ", Name = " + s2.Name + ", skills = " + s2.skills);
			s2.train();
			s2.solveproblem();
		}

	}

}
