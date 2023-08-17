package Constructors;
import java.util.Scanner;

class PatternPrg{
	int nos,a,b;
	public PatternPrg(int n, int i, int j) {
		this.nos = n;
		this.a = i;
		this.b = j;
	}
	public void patternPrg(){
		while(a<=nos) {
			b=1;
			while(b<=nos) {
				if(a+b<=5) {
					System.out.print(" ");
				}
				else {
					System.out.print(a);
				}
				b++;			
			}
			System.out.println();
			a++;
		}
	}
}

public class Pattern {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int i=1,j=1;
		PatternPrg obj = new PatternPrg(n, i, j);
		obj.patternPrg();

	}

}
