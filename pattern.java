/* 
import java.util.*;

class pattern
{ 
	public static void main(String [] args)
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter no for loop");
		int s=in.nextInt();

		if(s>1)
			{
		for (int i=0; i<s;i++ )
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        } 
			}
	}
}
*/


import java.util.*;

class pattern
{
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter no for looop");
		int s= in.nextInt();

		for (int i=0;i<=s;i++)
		{
			for(int j=0; j<i;j++)
				{ 
				System.out.print(" "); 
				}

				System.out.println();
		}
	}
}
/*
import java.util.Scanner;
public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");
        
        for (int i= rows-1; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                 System.out.print("*" + " ");
            }
            System.out.println();
        }

        //Close the resources
        sc.close();

    }
}






import java.util.Scanner;
public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");
        
        for (int i= 0; i<= rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println("");
        }

        //Close the resources
        sc.close();

    }
}



import java.util.Scanner;
public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");
        
         for (int i= rows; i>= 1; i--)
        {
            for (int j=rows; j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println("");
        }

        //Close the resources
        sc.close();

    }
}





  for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=rows-1; j>i; j--)
            {
                 System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                 System.out.print("*" + " ");
            }
            System.out.println();
        }




		 for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }






		        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=rows-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=-1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-2-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }



   for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int i= rows-1; i>= 0; i--)
        {
            for (int j=0; j < i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }






		 for (int i= 0; i<= rows-1 ; i++)
        {

            for (int j=0; j < i ;j++) 
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i= rows-1; i>= 0; i--)
        {
            for (int j=0; j<i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }




for (int i=1; i<= rows ; i++)
        {
            for (int j=1; j<= i ;j++){
                if(j==1 || j==i || i==rows) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }






        for (int i=1; i<= rows ; i++)
        {
            for (int j = rows; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }   
            if( i==1) {
                System.out.println("");
            }
            else {
                System.out.println("*");
            }
        }
        for (int i=rows-1; i>= 1 ; i--)
        {
            for (int j = rows; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }
            if( i==1)
                System.out.println("");
            else
                System.out.println("*");
        }




