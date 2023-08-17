package BetterTomorrow;
import java.util.*;


class Student{
	String name, dept;
	float cgpa;
	
}


public class ClassObjects {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		Student obj = new Student();
		obj.name="Aseel";
		obj.dept="IT";       //using reference variable
		obj.cgpa=8.41f;
		
		System.out.println(obj.name+" "+ obj.dept+" "+ obj.cgpa);

	}

}
