package javaacademy;
import java.util.*;
public class BinarytoOctal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int binary = in.nextInt();
		int temp=0;
		int sum=0;
		int i=0;
		String concat = "";
		while( binary!=0 ) {
			temp = binary%10;
			sum += temp*(Math.pow(2,i));
			i++;
			binary /= 10;
		}
		
		int octal =0;
		
		while( sum!=0 ) {
			octal = sum%8;
			concat = octal + concat;
			sum = sum/8;
		}
		
		System.out.print(concat);
		
	}

}
