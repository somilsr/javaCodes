class aaa1 
{
// private int a=10;
int b=20;
protected int  c=30;
public int d=40;
}

class boss extends aaa1
{
public void show()
 {
   //System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   System.out.println(d);
 }
}

public class m
{
public static void main(String [] args)
 {
   boss b= new boss();
   b.show();

   /*
   System.out.println(b.a);
   System.out.println(b.b);
   System.out.println(b.c);
   System.out.println(b.d);
   */
   }
   }