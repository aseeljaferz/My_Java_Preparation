package functions_without_argument_without_returnval;
import java.util.*;

class NatNos{
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	
	public void printNaturalNos() {
		for(int i=1;i<n+1;i++) {
			System.out.print(i+" ");
		}
	}
	
}

public class NaturalNos {

	public static void main(String[] args) {

		NatNos obj = new NatNos();
		obj.printNaturalNos();

	}

}
