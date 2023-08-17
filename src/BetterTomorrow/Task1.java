package BetterTomorrow;
import java.util.*;

class Employee1{
	int id;
	String name;
	float salary;
	
	Employee1(int id, String name, float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	static String company = "Google";
	
	static void change() {
		company = "ABC";
			
	}
	Employee1(){}
	
	void setValues(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println( id +" "+ name +" "+ salary +" "+ company );
	}
	
}

public class Task1 {

	public static void main(String[] args) {
		
		//reference variable
		Employee1 obj1 = new Employee1();
		obj1.id=01;
		obj1.name="Aseel";
		obj1.salary=120000.0f;
		System.out.println(obj1.id+" "+obj1.name+" "+obj1.salary);
		
		//constructor
		Employee1 obj2 = new Employee1(2,"Bals", 25000.0f);
		System.out.println(obj2.id+" "+obj2.name+" "+obj2.salary);
		
		
		//static
		Employee1 obj3 = new Employee1(); 
		obj3.setValues(3,"Bharath", 50000.0f);
		obj3.display();
		Employee1.change();
		obj3.display();
		
	}

}
