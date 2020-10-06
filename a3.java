class a3
{
 public static class method1
 {
	 int sum (int ...n)
	 {
		 int s=0;
		 for (int t:n)
		 { 
			 s+=t;
		 }
		 return s;
	 };
 }
 public static void main(String [] agrs)
	 {
		method1 ob = new method1();

	 System.out.println(ob.sum(10,20));
	 System.out.println(ob.sum(1,2,3,4,5,6));
	// System.out.println(ob.sum( 10.44,26.5,122.1 ));
	 	 System.out.println(ob.sum());
      }
}