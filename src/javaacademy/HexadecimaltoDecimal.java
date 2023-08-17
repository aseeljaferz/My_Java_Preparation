package javaacademy;
import java.util.*;
public class HexadecimaltoDecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String hexa = in.next();
		int temp;
		int l=hexa.length()-1;
		int hex;
		int sum=0;
		int j=0;
		char ch;
		for(int i=0; i<hexa.length();i++) {
			
			ch = hexa.charAt(l);
			l--;
			if(ch=='a')
			{
				hex=10;
			}
			else if(ch=='b')
			{
				hex=11;
			}
			else if(ch=='c')
			{
				hex=12;
			}
			else if(ch=='d')
			{
				hex=13;
			}
			else if(ch=='e')
			{
				hex=14;
			}
			else if(ch=='f')
			{
				hex=15;
			}
			else
			{
				hex=Character.getNumericValue(ch);
			}
			
			sum+=hex*Math.pow(16, j);
			j++;
		}
		System.out.print(sum);
		
	}

}
//CharacNumericvalue()

