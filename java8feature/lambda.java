package java8feature;
import java.util.*;

interface Sayable{  
	void run();
   // public String say();  
}  
public class lambda {  

	
	public static void main(String[] args) {  
    
	Sayable s=()->{
		System.out.println("Hii bro");
		};
		s.run();
  
}

  
}  