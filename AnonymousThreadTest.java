public class AnonymousThreadTest 
	{
	public static void main(String[] args) {
      new Thread() 
		  {
			public void run(){
			System.out.println("run() method: " );}
      }.start();
         System.out.println("main() method: ");
   }
}