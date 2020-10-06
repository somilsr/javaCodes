//selectApp

import java.sql.*;
import java.util.*;
import java.io.*;

public class SelectTest3
{
	public static void main(String args[]) throws Exception
	{
		try{
				Scanner sc= new Scanner(System.in);
				String  a=null,b=null;
				boolean flag=false;
			if(sc!=null)
			{
	
		//System.out.println("input range between you wnat to search the data\n large value");
		//a=sc.next().toUpperCase();
		//System.out.println("give minimum value");
		//b=sc.next().toUpperCase();
			}//if

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","admin");
		//jdbc statement object
		//if (con!=null)
		Statement st=con.createStatement();
		//execute the queryr
		// SELECT * FROM EMP WHERE SAL>=2000 OR SAL<=800;
		//SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN('MANAGER','CLERK')
//ResultSet rs=st.executeQuery("SELECT EMPNO ,ENAME,JOB,MGR,SAL FROM EMP WHERE SAL>="+a+"OR SAL<="+b+"ORDER BY SAL");
		//if(st!=null)
		//SELECT empno,deptno,salRANK() OVER (PARTITION BY deptno ORDER BY sal) AS rank FROM emp;
		ResultSet rs=st.executeQuery("SELECT EMPNO,ENAME,DEPTNO,SAL, RANK() OVER (PARTITION BY DEPTNO ORDER BY SAL) AS RANK FROM EMP");
		//print db table records 
		if(rs!=null){
		while (rs.next()!=false)
		{
			flag=true;
			//
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+""+rs.getFloat(5));
		}//while
		if (flag==false) 
			System.out.println("no records found");
		}//if
	}//try
	catch(Exception e){
		e.printStackTrace();
	}

	}
}