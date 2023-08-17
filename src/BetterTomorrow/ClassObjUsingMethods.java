package BetterTomorrow;
import java.util.*;


class Stud{
	String name, dept;
	float cgpa;
	
	void setValues(String name, String dept, float cgpa) {
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	void display() {
		System.out.println(name+" "+ dept+" "+cgpa);
	}
	
}


public class ClassObjUsingMethods {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		Stud obj = new Stud();
		obj.setValues("Aseel", "IT", 8.41f);
		obj.display();

	}

}
