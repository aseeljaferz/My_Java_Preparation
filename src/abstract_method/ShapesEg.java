package abstract_method;
abstract class Shape{
	abstract void draw();
}
class Square extends Shape{
	void draw() {
		System.out.println("drawing Square");
	}
}
class Hexagon extends Shape{
	void draw() {
		System.out.println("drawing Hexagon");
	}
}
public class ShapesEg {
	public static void main(String[] args) {
		Shape obj1 = new Hexagon();
		obj1.draw();
		Shape obj2 = new Square();
		obj2.draw();
	}
}
