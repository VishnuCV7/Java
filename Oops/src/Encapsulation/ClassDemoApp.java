package Encapsulation;

public class ClassDemoApp {
	
	private int rollnum;
	private String name;
	private int marks;
	private String Gender;
	
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum=rollnum;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public int getmarks() {
		return marks;
	}
	public void setmarks(int marks) {
		this.marks=marks;
	}
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender=Gender;
	}
	
	
	public ClassDemoApp(int rollnum, String name, int marks, String gender) {
		this.rollnum = rollnum;
		this.name = name;
		this.marks = marks;
		this.Gender = gender;
	}

}
