package exception_handling;
import java.io.IOException;
import java.util.*;
class Testthrows1{  
	void a()throws IOException{  
	    throw new IOException("device error");//checked exception  
	}  
	void b()throws IOException{  
		a();  
	}  
	void c(){  
	   try{  
		   b();  
	   }
	   catch(Exception e){
		   System.out.println("exception handled");
	   }
	}
}  
public class Throws1 {
	public static void main(String[] args) {
		Testthrows1 obj=new Testthrows1();  
		obj.c();  
		System.out.println("normal flow...");  
	}
}
