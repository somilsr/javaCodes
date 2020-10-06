class A
{  
void msg()
	{System.out.println("Hello");}  
}  

class B extends A
{  
void msg(){System.out.println("Welcome");}  
}  

class C //extends A
{   
 public static void main(String[] args)
	 {  
	 A a= new A();
	 a.msg();
   //C obj=new C();  
   //obj.msg();//Now which msg() method would be invoked?  
	}  
}  