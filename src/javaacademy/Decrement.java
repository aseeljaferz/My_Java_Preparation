package javaacademy;
import java.util.*;
public class Decrement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("-------Post Decrement-------");
		int i=1;
		int a=i;
		i--;
		System.out.println("a : "+a);
		System.out.println("i : "+i);
		System.out.println();
		System.out.println("-------Pre Decrement--------");
		int j=1;
		--j;
		int b=j;
		System.out.println("b : "+b);
		System.out.println("j : "+j);

	}

}
