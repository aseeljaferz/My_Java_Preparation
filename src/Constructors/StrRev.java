package Constructors;
import java.util.*;

class StrrevPrg{
	String str;
	public StrrevPrg(String s) {
		this.str=s;
	}
	public void testStrRev(){
		String rev = "";
		String sa[] = str.split(" ");
		for(int i=sa.length-1;i>=0;i--) {
			rev += sa[i]+" ";
		}
		System.out.println(rev.substring(0, rev.length()-1));
	}
}

public class StrRev {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		StrrevPrg obj = new StrrevPrg(s);
		obj.testStrRev();
		
	}

}
