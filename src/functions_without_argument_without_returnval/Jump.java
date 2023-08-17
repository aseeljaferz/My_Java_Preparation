package functions_without_argument_without_returnval;
import java.util.*;

class JumpPrg{
	
	int n;
	public void jump() {
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
		System.out.print(jump);
	}
	
}

public class Jump {

	public static void main(String[] args) {
		
		JumpPrg obj = new JumpPrg();
		obj.jump();

	}

}
