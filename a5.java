/*documentation
package 
import 
class /enum/coding
*/

//example on  call by value
//create package : name for user define
// import java.util.*; or java. math.*;

//call by method
public class a5
{
	void m2(int n)
	{
	 n+=10;
	System.out.println("Method call "+n);
	}


public static void main(String [] agrs)
{
	int n=25;
	a5 ob=new a5();
	System.out.println("value of N "+n);
	ob.m2(n);
	System.out.println(" value of  n"+n);
}


}