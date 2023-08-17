package Constructors;
import java.util.*;
class TestAdd{
	int a,b,d,c;
	public TestAdd()
	{
		System.out.println("constructor is called");	
		this.c=0;
	}
	
	public void add()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a:");
		a=in.nextInt();
		System.out.println("Enter b");
		b=in.nextInt();
		d=a+b;
		System.out.println("c="+c);
		System.out.println("sum of two nos="+d);	
	}
}
public class DemoConstructor {

	public static void main(String[] args) {
		
		TestAdd h = new TestAdd();
		h.add();

		

	}

}

//In Java, a constructor is a block of codes similar to the method. 
//It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

//It is a special type of method which is used to initialize the object.

//Every time an object is created using the new() keyword, at least one constructor is called.

//It calls a default constructor if there is no constructor available in the class. 
//In such case, Java compiler provides a default constructor by default.

//rules for creating java constructor,
//1) Constructor name must be the same as its class name
//2) A Constructor must have no explicit return type
//3) A Java constructor cannot be abstract, static, final, and synchronized



