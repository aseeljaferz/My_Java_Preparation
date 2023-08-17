package static_package;
import java.util.*;
class ClassicText{
	static int j=0;
	int i=0;
	public void classicText() {
		i++;
		j++;
		System.out.println("j="+j+" "+"i="+i);
	}
}

public class StaticVariable {
	public static void main(String[] args) {
		ClassicText obj1 = new ClassicText();
		obj1.classicText();
		ClassicText obj2 = new ClassicText();
		obj2.classicText();
		ClassicText obj3 = new ClassicText();
		obj3.classicText();
	}
}
