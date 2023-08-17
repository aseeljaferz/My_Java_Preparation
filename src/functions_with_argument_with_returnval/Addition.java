package functions_with_argument_with_returnval;
import java.util.*;

class AdditionPrg{
	int a,b,c;
	public int testAdd(int x, int y) {
		a = x;
		b = y;
		c = a+b;
		return c;
	}
}

public class Addition {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		AdditionPrg obj = new AdditionPrg();
		int sum = obj.testAdd(a,b);
		System.out.println(sum);

	}

}
