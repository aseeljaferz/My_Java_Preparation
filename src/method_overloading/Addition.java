package method_overloading;
import java.util.*;
class Add{
	public void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum of two nos : "+c);
	}
	public void add(int a,int b,int c)
	{
		int d;
		d=a+b+c;
		System.out.println("sum of three nos : "+d);
	}
}
public class Addition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a  and b and c");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		
		Add obj = new Add();
		obj.add(a, b);
		obj.add(a, b, c);	
	}
}
