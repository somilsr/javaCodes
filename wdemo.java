public class wdemo
{

	public static void main(String [] args)
	{
		String s1="true";
		String s2="123";
		String s3="10.55";
		String s4="3500000000";
		String s5="SHiva";
		
		//s2++;CTE
		//int b= s2  //CTE
		//parsing data

		boolean a=Boolean.parseBoolean(s1);
		int b= Integer.parseInt(s2);
		Integer ob=Integer.valueOf(s2);
		double c=Double.parseDouble(s3);
		long d=Long.parseLong(s4);

		//System.out.println(a);
		System.out.println("s2   :-"+(b+10));
		System.out.println("s3   :-"+(c+10));
		System.out.println("s4   :-"+(d+10));
		System.out.println("s2   :-"+ob);

		//un parsing
		String st=Integer.toString(b);
		//String s=Integer.toString(i);  
		System.out.println("s2   :-"+st);
	}
}