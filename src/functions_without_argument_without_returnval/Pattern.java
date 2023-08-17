package functions_without_argument_without_returnval;
import java.util.*;

class PatternPrg{
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	public void pattern(){
		for(int i=0; i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

public class Pattern {

	public static void main(String[] args) {
		
		PatternPrg obj = new PatternPrg();
		obj.pattern();

	}

}
