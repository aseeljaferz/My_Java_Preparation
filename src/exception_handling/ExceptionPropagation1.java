package exception_handling;
import java.util.*;
class DemoExcepProp{
	void a() {
		int a=50/0;
	}
	void b() {
		a();
	}
	void c() {
		try {
			b();
		}
		catch(Exception e) {
			System.out.println("Exception Handled...");
		}
	}
}
public class ExceptionPropagation1 {
	public static void main(String[] args) {
		DemoExcepProp obj = new DemoExcepProp();
		obj.c();
		System.out.println("Normal flow");
	}
}
