package java8_sample.lambda;

import java.util.Arrays;

public class Lambda_example2 {
	
	public static void static_run(){
		
		Arrays.asList( "a", "b", "d" ,"g", "z").sort( ( e1, e2 ) -> {
			int result = e1.compareTo( e2 );
			System.out.println(result);
			return result;
			} );		
	}
}
