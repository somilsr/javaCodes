class MyThread extends Thread
{
	//overriding method of runnable interface
	public void run()
	{
		System.out.println("thread is running....");
	}
}
class ThreadDemo

{
	public static void main(String[] args) 
	{
	 MyThread t=new MyThread();
		t.start();
		//t.run();
	}
}

	
