package java8_sample.lambda;

import static java.lang.System.out;


public class Lambda_example3 {
	
	Runnable r1 = () -> out.println(this);
	Runnable r2 = () -> out.println(toString());
	
	public String toString() {return "Hello, world!";}
	
	public static void static_run(){
		
		new Lambda_example3().r1.run();
		new Lambda_example3().r2.run();
		
		for (int i = 0; i < 10; i++){
			System.out.println((int)Math.pow(i + 1, 2));
		}
	}

}
