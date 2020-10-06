	//example on throwing&catching own Exception
	import java.util.Scanner;
	public class ExcepDemo6
	{
		void validate(int age)throws AgeException
		{
			if(age<18)
				throw new AgeException();
		}
		public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			System.out.println("enter age");
			int age=in.nextInt();
		
			try
				{
				new ExcepDemo6().validate(age);
				System.out.println("welcome to vote");
				System.out.println("continue us voting operations");
			}
		
			catch(AgeException ae)
			{
				System.out.println(ae);
				//throw ae;
			}
		}
	}
	
			
	class AgeException extends java.io.IOException
	{
	String msg;
	
	AgeException()
	{
		//super("Invalid Age,Age must be Above 18 years");
		//OR  
			msg=("Invalid Age,Age must be above 18 years");
	}
	//override
		public String toString()//or getError()
		{
			return msg;
		}
	}		