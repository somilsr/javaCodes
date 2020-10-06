Q1 :- How to create java applications without any user defined class?  
"The enum declaration defines a class (called an enum type)", so your code contains class definition too because enum is a class of enum type. 
It's a special type of class. 

Every enum constant is always implicitly public static final. Since it is static, we can access it by using enum Name. 
Since it is final, we can’t create child enums.

We can declare main() method inside enum. Hence we can invoke enum directly from the Command Prompt.


// A Java program to demonstrate that we can have 
// main() inside enum class. 
enum Color 
{ 
    RED, GREEN, BLUE; 
   
    // Driver method 
    public static void main(String[] args) 
    { 
        Color c1 = Color.RED; 
        System.out.println(c1); 
    } 
} 
--------------------------------------------
public enum FirstEnum
{ 
	x; //constant var
	public static void main(String args[])

		{ 
		int x=10;

		System. out. println("welcome"); 

		System. out. println("x "+x); 
		}
}