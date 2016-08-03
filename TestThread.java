
public class TestThread {
   public static void main(String args[]) {
	   
      Baker baker = new Baker( "The Baker");
      baker.start();
      
      CherryEater Eater = new CherryEater( "The Hungry Cheery Customer");
      Eater.start();
      
      AppleEater Eater2 = new AppleEater( "The Hungry apple Customer");
      Eater2.start();
      
   }   
}
