package java8_sample.lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda_example1 {
	
	public static void static_run(){
		List<String> sList = Arrays.asList("String1", "String2", "String3");
		sList.forEach(curS -> System.out.println(curS + " hello"));
		sList.forEach(System.out::println);		
	}
}


