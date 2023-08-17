package interface_method;
interface Printable{
	void print();
}
class PrintPrg implements Printable{
	public void print() {
		System.out.println("Hello");
	}
}
public class PrintHello {
	public static void main(String[] args) {
		Printable obj = new PrintPrg();
		obj.print();
	}
}
