import java.util.*;
class DataSizeof{
public static void main(String args[])
{
long[] a=new long[3];
   System.out.println(args.length);
  System.out.println(a.getClass().getName());
  System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
  System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
  System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
  System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
  System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
}
}
