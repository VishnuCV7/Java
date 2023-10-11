package welcome;

public class CoachApp {

	public static void main(String[] args) {
		{
			Coach h1 = new Coach();
			h1.giveData(1234,"Vishnu","Java","VIS");
			System.out.println("ID =" + h1.id +", Nmae =" + h1.name +", Skills =" + h1.skills +", Coachig center name = " + h1.coachingcenter );
			h1.train();
			h1.work();
		}

	}

}
