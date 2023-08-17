package interface_method;
interface Drawable{
	void draw();
}
class Square implements Drawable{
	public void draw() {
		System.out.println("Square is drawn...");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Circle is drawn...");
	}
}
public class DrawablePrg {
	public static void main(String[] args) {
		Drawable d;
		d=new Square();
		d.draw();
		d=new Circle();
		d.draw();
	}
}
