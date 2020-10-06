import java.util.Scanner;

public class cal
{
  public static void main(String [] args)
  {
   Scanner in = new Scanner(System.in);

   int x=0,y=0,opt;

   do
   {
     System.out.println("MENU");
     System.out.println("-----------");
     System.out.println("1: ADDITION");
     System.out.println("2: SUBTRACTION");
     System.out.println("3:DIVISION");
     System.out.println("4: PRODUCT");
     System.out.println("5: MODULAR DIVSION");
     System.out.println("6: EXIT");
     
     System.out.println("Enter your choice");
     opt= in.nextInt();

     if (opt>=1 && opt<=5)//checking input no 
	{
	System.out.println("Enter First no & Second no");
	x=in.nextInt();
	y=in.nextInt();
	}

switch (opt)
  {
		case 1:
					System.out.println("Addition:"+maths.add(x,y));
					break;
		case 2:
					System.out.println("SUBTRACTION:"+maths.sub(x,y));
					break;
		case 3:
					System.out.println("division:"+maths.div(x,y));
					break;
		case 4:
					System.out.println("Product:"+maths.prod(x,y));
					break;
		case 5:
					System.out.println("Modular:"+maths.mod(x,y));
					break;
		case 6:
					System.exit(1);

		default:		System.out.println("wrong entered please choose again.......\n");


     }

}
while(true);//endless loop
}
}
