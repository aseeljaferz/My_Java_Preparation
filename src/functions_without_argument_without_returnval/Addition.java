package functions_without_argument_without_returnval;
import java.util.*;

class TestAddition{
	
	int a, b, c;//data members
	
	public void add() {   //user-defined or member function       //void -- non-return type
 		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b=in.nextInt();
		c = a+b;
		System.out.println("add : "+c);
	}
	public void sub()
	{
		int d=a-b;
		System.out.println("sub : "+d);
	}
}

public class Addition {

	public static void main(String[] args) {

		TestAddition obj = new TestAddition();
		obj.add();
		obj.sub();

	}

}
