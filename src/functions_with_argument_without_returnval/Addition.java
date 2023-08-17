package functions_with_argument_without_returnval;
import java.util.*;

class TestAdd{
	int a,b,c;
	public void Add(int x,int y)
	{
		a=x;
		b=y;
		c=x+y;
		System.out.println("c = "+c);
	}
//	public void Sub(int x, int y) {
//		c=a-b;
//		System.out.println("c = "+c);
//	}
}

public class Addition {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		TestAdd obj = new TestAdd();
		obj.Add(a, b);
//		obj.Sub(a, b);

	}

}
