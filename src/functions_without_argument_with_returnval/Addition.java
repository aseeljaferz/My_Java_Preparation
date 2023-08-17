package functions_without_argument_with_returnval;
import java.util.*;

class AdditionPrg{
	int a,b,c;
	public int testAdd() {
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=a+b;
		return c;
	}
}

public class Addition {

	public static void main(String[] args) {
		
		AdditionPrg obj = new AdditionPrg();
		int z=obj.testAdd();
		System.out.println(z);

	}

}
