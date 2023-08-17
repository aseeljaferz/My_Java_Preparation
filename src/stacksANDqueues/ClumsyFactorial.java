package stacksANDqueues;
import java.util.*;
public class ClumsyFactorial 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(n);
		n--;
		int flag=0;
		while(n>0) 
		{
			if(flag==0) 
			{
				int t=stack.peek();
				t=t*n;
				stack.push(t);
				n--;
				flag++;
			}
			else if(flag==1) 
			{
				int t=stack.peek();
				t=t/n;
				stack.push(t);
				n--;
				flag++;
			}
			else if(flag==2) 
			{
				stack.push(n);
				n--;
				flag++;
			}
			else if(flag==3) 
			{
				stack.push(n);
				n--;
				flag=0;
			}
		}
	}

}
