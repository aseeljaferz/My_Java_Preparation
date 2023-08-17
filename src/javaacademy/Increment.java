package javaacademy;
import java.util.*;
public class Increment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("-------Post Increment-------");
		int i=0;
		int a=i;
		i++;
		System.out.println("a : "+a);
		System.out.println("i : "+i);
		System.out.println();
		System.out.println("-------Pre Increment--------");
		int j=0;
		++j;
		int b=j;
		System.out.println("b : "+b);
		System.out.println("j : "+j);

	}

}
