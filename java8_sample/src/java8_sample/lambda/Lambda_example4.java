package java8_sample.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Lambda_example4 {
	
	public static void static_run() throws Exception{
		
		
			ExecutorService executorService = Executors.newFixedThreadPool(10);				
			
			IntStream.range(0,  10)
				.forEach( i -> 
					executorService.submit( () -> 
						System.out.println("Running task " + i)));		

			System.out.println("Tasks started...");
			executorService.shutdown();		
		}
		
}

