import java.util.*;
public class sb
{
	public static void main(String[ ]  args)
	{
										//user1/use1
										Scanner in =new Scanner(System.in);

											student4 s1=new student4();
											{
												s1.setName("somil");
											
												s1.setSlno(11);
												s1.setCourse("c");
												s1.setFaculty("DR");
												s1.setTime("9-11");

												System.out.println("student detail:");
												System.out.println(s1.getSlno()+"\t"+s1.getName()+"/t"+s1.getCourse()+"/t"+s1.getTime()+"/t"+s1.getFaculty()+"/n");
											}

//user2/use2
											student4 s2= new student4();
											{
												s2.setSlno(22);
												s2.setName ("ram");
												s2.setCourse("angular");
												
												System.out.println( "\n slno:-" +s2.getSlno());
												System.out.println( "\n Name"+s2.getName());
												System.out.println( "\n Course:-" +s2.getCourse());
												System.out.println( "\n ------:-" +s2.getTime());
												System.out.println( "\n ------:-" +s2.getFaculty());
											}
  }
}