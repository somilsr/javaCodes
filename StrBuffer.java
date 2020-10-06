// example on StringBuffur methods (buffer oprations)
import static java.lang.System.out;

public class StrBuffer
{
public static void main(String args[])
{
StringBuffer sb1= new StringBuffer("constructor Buffer");
StringBuffer sb2= new StringBuffer(35);
StringBuffer sb3= new StringBuffer();
out.println("sb1 constructor :-"+sb1);

/* length() :- public int length()*/
out.println("sb1 length :-"+sb1.length());

//capacity :- public int capacity() 
out.println("sb1 capacity :-"+sb1.capacity());
out.println("sb2 capacity :-"+sb2.capacity());
out.println("sb3 capacity :-"+sb3.capacity());

//CharAt() :- public charAt(int index)
out.println("sb1 charAt method :-"+sb1.charAt(7));
//			String manupulations:-

//setCharAt() :- public StringBuffer setCharAt(int index , char ch)
sb1.setCharAt(11,'$');
out.println("sb1 setCharAt method index ,char :-"+sb1);

//append public StringBuffer append (int x);
//  public StringBuffer append (String st);
//  public StringBuffer append (char ch[],int start index,int end-index);
// sb3="java-Software";//CTE
sb3.append("java-Software");
sb3.append(1996);
sb3.append("");
sb3.append(1.13);
out.println("sb3 append in java Software :-"+sb3);

//insert () :- public StringBuffer insert(int index ,char c);
sb3.insert(1,'c');
sb3.insert(3,'a');
out.println("sb3 insert method in java Software :-"+sb3);

//delete() :- public StringBuffer delete(int start-index,end-index);
sb3.delete(2,15);
out.println("sb3 delete method in java Software :-"+sb3);
//reverse(); :- public StringBuffer reverse()
sb3.reverse();
out.println("sb3 reverse method in java Software :-"+sb3);
//setLength() :- public void setLength(int n);
sb3.setLength(6);
out.println("sb3 setLength() method in java Software :-"+sb3);
//sb3.setLength(0); //CTE
sb3.setLength(sb3.length());


}
}