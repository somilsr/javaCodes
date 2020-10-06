import java.util.Scanner;

public class Str1
{
public static void main(String args[]){
Scanner in= new Scanner(System.in);
System.out.println("Enter String:");
String st=in.nextLine();
    for (int i=1;i<=st.length();i++)
        System.out.println(st.substring(0,i));
    for(int i=st.length()-1;i>=1;i--)
        System.out.println(st.substring(0,i));
}
}