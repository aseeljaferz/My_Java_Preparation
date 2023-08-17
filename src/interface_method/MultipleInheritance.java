package interface_method;
interface Hello{
	void print1();
}
interface World{
	void print2();
}
class PrintVal implements Hello,World{
	public void print1() {
		System.out.println("Hello");
	}
	public void print2() {
		System.out.println("World");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		PrintVal obj = new PrintVal();
		obj.print1();
		obj.print2();
	}
}
