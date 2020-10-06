class MyThread implements Runnable
{
	//override
	public void run()
		{
		System.out.println("threading is running...");
		}
}
class ThreadDemo1
{
public static void main(String[] args) 
	{
		MyThread ob=new MyThread();
		Thread t=new Thread(ob);
		t.start();
		//or
		//new Thread(new MyThread()).start();
		
	}
}
