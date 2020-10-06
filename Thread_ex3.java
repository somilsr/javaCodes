public class Thread_ex3 
{
	public static void main(String[] args) 
	{
	Thread t=new Thread(){
         public void run(){
               System.out.println("run() thread method: ");
            }
      };
	//Thread t=new ThreadDemo$1();
t.start();
//4th approach(by using lambda expr)
Runnable r=()->System.out.println("i m thread");
new Thread(r).start();
}
}


/*public class Thread_ex3 
	{
	public static void main(String[] args) {
      new Thread() 
		  {
			public void run(){
			System.out.println("run() method: " );}
      }.start();
         System.out.println("main() method: ");
   }
} */