package method_overloading;
import java.util.*;

class Info{
	public void userInfo(String name, int age) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	public void userInfo(String address) {
		System.out.println("Address : "+address);
	}
}

public class PersonalInfo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = in.next();
		System.out.println("Enter address : ");
		String address = in.next();	
		System.out.println("Enter age : ");
		int age = in.nextInt();
		
		System.out.println("---------display----------");
		Info obj = new Info();
		obj.userInfo(name, age);
		obj.userInfo(address);

	}

}
