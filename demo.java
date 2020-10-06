class human
	{
						void eat()
					    {
						 System.out.println("eating ....");
						}

						void sleep()
						{
						System.out.println("Sleepnig..");
						}
						 void talk()
						{
						System.out.println(" Talking....\n\n");
						}
	}

class demo
  {
   public static void main(String [] rashmi)
     { 
      //eat ();
      //human.eat();
       
       human  ram =new human();
       ram.eat();
       ram.sleep();
       ram.talk();

       human siva =new human();
       siva.eat();
       siva.sleep();
       siva.talk();
       }
  }
