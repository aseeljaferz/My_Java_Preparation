package BetterTomorrow;
import java.util.*;


class Student2{
	String name, dept;
	float cgpa;
	
	Student2(String name, String dept, float cgpa){    //using constructor   or parameterized constructor
		this.name = name;
		this.dept = dept;
		this.cgpa=cgpa;
	}
	
}


public class ClassObjUsing_Constructor  {

	public static void main(String[] args) {
		
		Student2 obj1 = new Student2("Aseel", "IT", 8.41f);
		
		System.out.println(obj1.name+" "+ obj1.dept+" "+ obj1.cgpa);

	}

}
