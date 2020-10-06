//like database entry

import java.util.*;
class EmpWithDate extends emp1
{
 public static void main(String [] args)
	{
	 Scanner in= new Scanner(System.in);
	 Date d=new Date();
	 emp1 emp =new emp1();
	 do
	 {
		 System.out.println("Enter  Employee Id as integer Formate ");
	 emp.setId(in.nextInt());
	 System.out.println("Enter  Employee Name ");
	 emp.setName(in.next());
	 System.out.println("Enter  Employee Salary ");
	 emp.setSalary(in.nextDouble());
/*////////////////////////////////////////////////////////////
emp.setDepartment("Devlopement");

emp.SetJob("Developer");

////////////////////////////////////////////////*/
	System.out.println("Enter  Employee joining day");
	 d.setdate(in.nextInt());
	 System.out.println("Enter  Employee joining Month");
	 d.setMonth(in.next());
	 System.out.println("Enter  Employee joining Year");
	 d.setYear(in.nextInt());
	 System.out.println("Enter  Employee joining Post");
	 emp.setJob(in.next());
	 System.out.println("Enter  Employee joining Department");
	 emp.setDepartment(in.next());



System.out.println("Result of Entered Values :-\n");
System.out.println("Employe id "+"\t"+"Employe Name"+"\t"+"Employe Salary"+"\t"+"Employe Joining Date"+"\t"+"Job"+"\t"+"Department" );
System.out.println("----------"+"\t"+"-----------"+"\t"+"-------------"+"\t"+"----------"+"\t"+"----------"+"\t"+"----------");
System.out.println(emp.getId()+"\t\t"+emp.getName()+"\t\t"+emp.getSalary()+"\t\t"+d.getDdate()+"\t"+emp.getJob()+"\t"+emp.getDepartment());
	 }
	 while (true);
	
	
	}
}
