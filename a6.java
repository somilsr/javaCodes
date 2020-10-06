public class a6
{
    void increment(int[] n)
  {
	for(int i=0;i<n.length;i++)
	n[i]+=10;
   }
public static void main(String[] args)
{
	int[] n={11,22,33};
	a6 ob=new  a6();
	for (int t:n)
		{
	System.out.print(t+" ");
	   }
System.out.println("\n");
ob.increment(n);
for(int t:n)
	{
    System.out.print(t+" ");
    }
 }
}