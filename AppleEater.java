
public class AppleEater implements Runnable{
	private Thread t;
	   private String threadName;
	   
	   AppleEater( String name){
	       threadName = name;
	       System.out.println("Creating " +  threadName );
	   }
	   public void run() {
	      System.out.println("Running " +  threadName );
	      
	      int num_eaten1 = 0;
	      while (num_eaten1 < 4) {
	    	  if (Data.num_apples == 2) {
	    		  Data.Eat_All_Appple();
	    		  num_eaten1 += 2;
	    	  }	  
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   public void start ()
	   {
	      System.out.println("Starting " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}
