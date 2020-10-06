import java.util.Scanner;

public class str2
{
public static void main(String argsp[])
{
    Scanner in =new Scanner(System.in);
    int i,n,l1,l2;
    String s1,s2;
    StringBuffer s3=new StringBuffer();
    System.out.println("Enter first String , Second String");
    s1=in.next();
    s2=in.next();
    
    l1=s1.length();
    l2=s2.length();
    //n=(l1:l2?l1<l2);
	n=(l1<l2?l1:l2);
    for(i=0;i<=n;i++)
    {
        s3.append(s1.charAt(i));
        s3.append(s2.charAt(i));
    }
    if(l1>n){
        s3.append(s1.substring(i));
    }else if (l2>n)
        s3.append(s2.substring(i));
    System.out.println("result"+s3);
    
}
}