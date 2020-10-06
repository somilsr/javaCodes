public class student1  //bean class approch
{
  //proprtties
  private int slno;
  private String name,course,time,faculty;
  
//setter method     
	     public void setSlno(int s)
	     {
	     s1.slno=s;
	      }
		
	     public void setName( String n)
	     {
	       s1.name=n;
	     }
	   
	     public void setCourse( String c)
	     {
	      s1.course=c;
	     }
	     public void setTime( String t)
	     {
	      s1.time=t;
	     }
	     public void setFaculty( String f)
	     {
	       s2.faculty=f;
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