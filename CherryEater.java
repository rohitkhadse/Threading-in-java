
class CherryEater implements Runnable {
   private Thread t;
   private String threadName;
   
   CherryEater( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   public void run() {
      System.out.println("Running " +  threadName );
      
      int num_eaten = 0;
      while (num_eaten < 4) {
    	  if (Data.num_cherries==2) {
    		  Data.Eat_All_Cherry();
    		  num_eaten += 2;
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
