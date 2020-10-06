public class student4  //bean class approch
{
  //proprtties
  private int slno;
  private String name,course,time,faculty;
  
//setter method     
	     public void setSlno(int s)
	     {
	     slno=s;
	      }
		
	     public void setName( String n)
	     {
	       name=n;
	     }
	   
	     public void setCourse( String c)
	     {
	      course=c;
	     }
	     public void setTime( String t)
	     {
	     time=t;
	     }
	     public void setFaculty( String f)
	     {
	      faculty=f;
	     }

//getter method
			public  int getSlno()
			{
			  return slno;
			}

			public  String getName()
			{
			  return name;
			}
			public  String getTime()
			{
			  return time;
			}
			public  String getCourse()
			{
			  return course;
			}
			public  String getFaculty()
			{
			  return faculty;
			}
}