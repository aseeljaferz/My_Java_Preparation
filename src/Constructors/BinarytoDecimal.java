package Constructors;
import java.util.*;

class BintoDecimal{
	int a, temp, sum=0, rem=0, i=0;
	public BintoDecimal(int binary) {
		this.a=binary;
	}
	public void convert(){
		while( a != 0 ) {
			temp = a%10;
			sum = sum +(temp*(int)Math.pow(2,i));
			i++;
			
			a /= 10;
			
		}
		System.out.print(sum);
	}
}

public class BinarytoDecimal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int binary = in.nextInt();
		BintoDecimal obj = new BintoDecimal(binary);
		obj.convert();

	}

}
