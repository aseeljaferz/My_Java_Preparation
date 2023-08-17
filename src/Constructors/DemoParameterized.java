package Constructors;
import java.util.*;
class Test{
	int a,b,d;//class variable
	public Test(int a,int b)//instance variable
	{
		this.a=a;
		this.b=b;
	}
	
	public void add()
	{
		d=a+b;
		System.out.println("sum of two nos="+d);	
	}
}
public class DemoParameterized {

	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a:");
		a=in.nextInt();
		System.out.println("Enter b");
		b=in.nextInt();
		Test h = new Test(a,b);//object
		h.add();
	}

}

//atm 

//In Java, a constructor is a block of codes similar to the method. 
//Every time an object is created using the new() keyword, at least one constructor is called.
//It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.
//It is a special type of method which is used to initialize the object.

//rules for creating java constructor,
//1) Constructor name must be the same as its class name
//2) A Constructor must have no explicit return type
//3) A Java constructor cannot be abstract, static, final, and synchronized




