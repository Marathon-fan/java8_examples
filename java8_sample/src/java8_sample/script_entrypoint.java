package java8_sample;

import java.util.*;
//slf4j

public class script_entrypoint {
	
	public static void main(String[] args) throws Exception{
		//Lambda_example1.static_run();
		int[] nums = {1,2,3,4};
		for  (int i = 0; i < nums.length; i++){
			System.out.println(nums[i]); //
		}
		functionalInterface_example1.static_run();
		System.out.println("hello, world");
		Complex.static_run();
	}	

}
