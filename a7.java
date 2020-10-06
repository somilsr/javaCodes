import java.util.*;
class student 
{
  int sno;
  String name,course,time ,faculty;
  
						  void get()
							{
							  Scanner in= new Scanner(System.in);

								  System.out.println("please enter roll no");
								  sno=in.nextInt();

								  System.out.println("please enter  name");
								  name=in.next();

								  System.out.println("please enter time" );
								   time=in.next();

								  System.out.println("please enter  course name ");
									course=in.next();

								  System.out.println("please enter faculty name");	 
								   faculty=in.next();
							}


		void show()
		  {
		  System.out.println(sno);
		  System.out.println(name);
		  System.out.println(time);
		  System.out.println(course);
		  System.out.println(faculty);
		  }

}



class a7
{
public static void main(String [] agrs)
   {
   student  s1= new student();
   s1.get();
   s1.show();

   student s2=new student ();
   s2.get();
   s2.show();
   }
}

