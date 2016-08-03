
import java.util.Random;
class Baker implements Runnable {
   private Thread t;
   private String threadName;
   
   Baker( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   public void run() {
      System.out.println("Running " +  threadName );
      int randomInt=(int)(Math.random()*2);
    
      if(randomInt==0){
    	  int i = 0;
    	  while (i<4) {
      		if(Data.num_cherries<2){
      		  Data.Add_Cherry();
      		i++;
      		}
      	  }
      	
    	  int j=0;
      	  while (j<4){
      		  if(Data.num_apples<2){
      			  Data.Add_Appple ();
      			  j++;
      		  }
      	  }
      }	
      
      if(randomInt==1){
    	  int i = 0;
    	  while (i<4) {
      		if(Data.num_cherries<2){
      		  Data.Add_Cherry();
      		i++;
      		}
      	  }
      	int j=0;
      	  while (j<4){
      		  if(Data.num_apples<2){
      			  Data.Add_Appple ();
      			  j++;
      		  }
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
