abstract class one
{
abstract void m1();
}
class two extends one
{
	public void m1()
	{
	System.out.println("child class");
	}
}
public class abstractmethod1  
{
	public static void main(String[] args)
	{
		one t= new two();
		t.m1();
	}
}