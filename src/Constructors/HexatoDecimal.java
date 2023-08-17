package Constructors;
import java.util.Scanner;

class HexatoDeci{
	int temp;
	String a;
	int hex;
	int sum=0;
	int j=0;
	char ch;
	public HexatoDeci(String hexa) {
		this.a=hexa;
	}
	public void convert(){
		int l=a.length()-1;
		for(int i=0; i<a.length();i++) {
			ch = a.charAt(l);
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

public class HexatoDecimal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String hexa = in.next();
		HexatoDeci obj = new HexatoDeci(hexa);
		obj.convert();

	}

}
