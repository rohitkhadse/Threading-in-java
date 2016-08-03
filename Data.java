
public class Data {
	static int num_cherries = 0;
	static int num_apples = 0;
	static Object cheery= new Object ();
	static Object apple = new Object ();
	
	static void Add_Cherry() {
		synchronized (cheery) {
			num_cherries++;
			System.out.println ("A new Cherry is ready");
		}
	}
	static void Eat_All_Cherry() {
		synchronized (cheery) {
			num_cherries = 0;
			System.out.println ("Eating all Cherries");
			
		}
	}	
		static void Add_Appple() {
			synchronized (apple) {
				num_apples++;
				System.out.println ("A new apple is ready");
			}
		}
		static void Eat_All_Appple() {
			synchronized (apple) {
				num_apples = 0;
				System.out.println ("Eating all apples");
				
			}
			
	}
		
}
