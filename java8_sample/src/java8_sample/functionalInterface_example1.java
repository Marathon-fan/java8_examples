package java8_sample;




public class functionalInterface_example1 {	
	
	public static void static_run() {
		
		  carryOutWork(new SimpleFuncInterface() {
		  @Override
		  public void doWork() {
		      System.out.println("Do work in SimpleFun impl...");
		     }
		  });
		  
		  carryOutWork(() -> System.out.println("Do work in lambda exp impl..."));
		  }
	
		  public static void carryOutWork(SimpleFuncInterface sfi){
		    sfi.doWork();
		  }

}
