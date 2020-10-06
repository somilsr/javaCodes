//selectApp

import java.sql.*;
import java.util.*;
import java.io.*;

public class SelectTest3
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("input range between you wnat to search the data\n large value");
		a=sc.nextInt();
		System.out.println("give minimum value");
		b=sc.nextInt();
	
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
	//oracle.jdbc.driver.OracleDriver dm= new oracle.jdbc.driver.OracleDriver();
	//register driver manager 
	//DriverManager.registerDriver(dm);


		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","admin");
		//jdbc statement object
		Statement st=conn.createStatement();
		//execute the queryr
		//SELECT * FROM EMP WHERE SAL>=2000 OR SAL<=800;
		//ResultSet rs=st.executeQuery("SELECT * FROM EMP");
		// SELECT * FROM EMP WHERE SAL>=2000 OR SAL<=800;
		//SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN('MANAGER','CLERK');
//ResultSet rs=st.executeQuery("SELECT EMPNO ,ENAME,JOB,MGR,SAL FROM EMP WHERE SAL>="+a+"OR SAL<="+b+"ORDER BY SAL");
ResultSet rs=st.executeQuery("SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN('"+a+"','"+b+"',) ORDER by JOB;");
		//print db table records 
		while (rs.next()!=false)
		{
			//
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+""+rs.getFloat(5));
		}
			rs.close();
			st.close();
			conn.close();

	}
}