package static_package;
import java.util.*;
class StaticMethodEg{
	public void notStaticMethod() {
		System.out.println("It is not a static method");
	}
	public static void staticMethod1() {
		System.out.println("It is a static method");
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		StaticMethodEg obj1 = new StaticMethodEg();
		obj1.notStaticMethod();
		StaticMethodEg.staticMethod1();
		double a=Math.pow(2, 4);
		System.out.println("It is a static method"+a);
		
	}
}
