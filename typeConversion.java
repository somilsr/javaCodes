/*//Java program to illustrate incompatible data 
// type for explicit type conversion 
public class typeConversion   
{ 
public static void main(String[] argv) 
{ 
	char ch = 'c'; 
	int num = 88; 
	ch = num; 
} 
} 
*/
/*

class typeConversion 
{ 
	public static void main(String[] args) 
	{ 
		int i = 100; 
		
		// automatic type conversion 
		long l = i; 
		
		// automatic type conversion 
		float f = l; 
		System.out.println("Int value "+i); 
		System.out.println("Long value "+l); 
		System.out.println("Float value "+f); 
	} 
} 
*/

//Java program to illustrate explicit type conversion 
class Test 
{ 
	public static void main(String[] args) 
	{ 
		double d = 100.04; 
		
		//explicit type casting 
		long l = (long)d; 
		
		//explicit type casting 
		int i = (int)l; 
		System.out.println("Double value "+d); 
		
		//fractional part lost 
		System.out.println("Long value "+l); 
		
		//fractional part lost 
		System.out.println("Int value "+i); 
	} 
} 
