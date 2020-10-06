public class s1
	{
	 private int slno;
	 private String name ,course , faculty;

	public void set( int s,String n,String c,String f)
		{ 
			if(s>=0)
			  slno=s;
			  name= n;
			  course =c;
			  faculty =f; 
			  }

  void show ()
	   {
	   System.out.println(slno);
	   System.out.println(name);   
	   System.out.println(course);
	   //System.out.println(time);
	   System.out.println(faculty);
	   }
	}