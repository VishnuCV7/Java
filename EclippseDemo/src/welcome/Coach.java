package welcome;

public class Coach {
int id;
String name;
String skills;
String coachingcenter;

void train()
{
	System.out.println("Train Hard.");
}
void work()
{
	System.out.println("Work Hard.");
}
void giveData(int a,String b,String c,String d)
{
	id = a;
	name = b;
    skills = c;
    coachingcenter = d;
}
}
