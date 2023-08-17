package Constructors;
import java.util.*;

class TestJump{
	
	public TestJump() {
		System.out.println("This is jump program");	
	}
	
	public void jump() {
		int n,val;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int jump=0;
		int current=0;
		int farthest=0;
		for(int i=0;i<a.length-1;i++) {
			farthest = Math.max(farthest, i+a[i]);
			if(i==current) {
				current = farthest;
				jump++;
			}
		}
		System.out.println(jump);
	}
	
	
	
	
}

public class Jump {

	public static void main(String[] args) {
		
		TestJump obj = new TestJump();
		obj.jump();
		

	}

}

//1 4 3 2 6 7 
