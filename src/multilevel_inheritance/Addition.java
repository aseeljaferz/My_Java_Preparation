package multilevel_inheritance;
import java.util.Scanner;

class MultilevelAdd{
	protected int a,b,c,x,y;
	public MultilevelAdd(int a, int b) {
		this.a=a;
		this.b=b;
	}
}
class AddSub1 extends MultilevelAdd{
	public AddSub1(int a, int b,int x) {
		super(a,b);
		this.x=x;
	}
	public void addValue1() {
		int d=a+b+x;
		System.out.println(d);
	}
	
}
class AddSub2 extends AddSub1{
	public AddSub2(int a,int b,int x,int y){
		super(a,b,x);
		this.y=y;
	}
	public void addValue() {
		c=a+b+x+y;
		System.out.println(c);
	}
}
public class Addition {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		AddSub2 obj = new AddSub2(a,b,67,89);
		obj.addValue1();
		obj.addValue();

	}

}
