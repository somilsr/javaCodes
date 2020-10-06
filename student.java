public class student
	{
	 private int slno;
	 private String name ,course ,time, faculty;

	public void set( int s,String n,String c, String t,String f)
		{ 
			if(s>=0)
			  slno=s;
			  name= n;
			  course =c;
			  time=t;
			  faculty =f; 
			  7
			  }

  void show ()
	   {
	   System.out.println(slno);
	   System.out.println(name);   
	   System.out.println(course);
	   System.out.println(time);
	   System.out.println(faculty);
	   }
	}