package functions_without_argument_without_returnval;
import java.util.*;

class FactorialPrg{
	int n;
	int i=1;
	int sum=0;
	public void factorialPrg() {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		while(i <= n) {
			int start = 1;
			int fact = 1;
			while(start <= i) {
				fact = fact*start;
				start++;
			}
			sum += fact;
			i++;
		}
		
		System.out.println("sum of factorial of "+n+" = "+sum);
	}
}

public class Factorial {

	public static void main(String[] args) {

		FactorialPrg obj = new FactorialPrg();
		obj.factorialPrg();
		

	}

}
