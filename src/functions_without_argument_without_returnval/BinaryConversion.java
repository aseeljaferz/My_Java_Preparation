package functions_without_argument_without_returnval;
import java.util.*;

class Binary{
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int val = n;
	int bin = 0;
	String concat = "";
	
	public void binaryConversion(){
		while(n!=0) {
			bin = n%2;
			concat = bin + concat;
			n = n/2;
		}
		Integer.parseInt(concat);
		System.out.println("Decimal = "+ val);
		System.out.println("Binary = "+ concat);
	}
}

public class BinaryConversion {

	public static void main(String[] args) {

		Binary obj = new Binary();
		obj.binaryConversion();
		
	}

}
