package abstract_method;
abstract class SimpleBike{
	abstract void bike();
}
class Running extends SimpleBike{
	void bike() {
		System.out.println("Running safely...");
	}
}
public class SimpleAbstract {
	public static void main(String[] args) {
		SimpleBike obj = new Running();
		obj.bike();
	}
}
