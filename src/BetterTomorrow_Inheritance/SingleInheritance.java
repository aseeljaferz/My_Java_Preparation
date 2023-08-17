package BetterTomorrow_Inheritance;
import java.util.*;
public class SingleInheritance {
	
	class Department{
		String deptName, hodName;
		String collegeName = "KEC";
		
		Department(String deptName, String hodName){
			this.deptName = deptName;
			this.hodName = hodName;
		}
		void symposium() {
			System.out.println("We KEC organizing the symposium");
		}
	}
	
	public class Student extends Department{
		
		String name, rollno, college_name;
		Student(String deptName, String hodName, String name, String rollno){
			super(deptName, hodName);
			this.name = name;
			this.rollno = rollno;
		}
		void dispaly() {
			System.out.println(super.collegeName+" "+ deptName+" "+hodName+" "+name+" "+rollno+" ");
		}
		
	}

	public static void main(String[] args) {
		
		

	}

}
