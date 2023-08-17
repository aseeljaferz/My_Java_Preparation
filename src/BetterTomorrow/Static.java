package BetterTomorrow;
import java.util.*;


class Student1{
	String name, dept;
	float cgpa;
	static String company = "Google";
	
	static void change() {
		company = "ABC";
			
	}
	
	void setValues(String name, String dept, float cgpa) {
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	void display() {
		System.out.println(name+" "+ dept+" "+cgpa+" "+company);
	}
	
}


public class Static {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		Student1 obj1 = new Student1();
		obj1.setValues("Aseel", "IT", 8.41f);
		obj1.display();
		Student1 obj2 = new Student1();
		obj2.setValues("Jafer", "CSE", 9.0f);
		obj2.display();
		
		Student1.change();
		obj1.display();
		obj2.display();

	}

}
