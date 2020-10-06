//SeelectTEst.java with coding Standards
package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*app to get emp details based on designation
 * version 1.0
 * auther somil
 * date : 2020/1/3
 */
public class SelectTest2 {

	public static void main(String[] args) 
{
		Scanner sc=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs= null;
		String desg1 = null,desg2=null,desg3=null;
		boolean flag=false;
		try {
			//read inputs
			sc=new Scanner(System.in);
			if(sc!=null) {
				System.out.println("Enter designation 1");
				desg1=sc.next().toUpperCase();//gives clerk
				System.out.println("Enter designation 2");
				desg2=sc.next().toUpperCase();
				//System.out.println("Enter designation 3");
				//desg3=sc.next().toUpperCase();
			}
			//frame condition('clerk','manager','salesman')
			String cond="('"+desg1+"','"+desg2+"','"+desg3+"')";
			//gives ("clerk","salesman","manager");
			//register jdbc driver s/w
			//Class.forName("jdbc.oracle.driver.OracleDriver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//establishment the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","admin");
			//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","admin");
			//create statement object 
			if(con!=null)
				con.createStatement();
			//frame the sql query
			//SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN('MANAGER','CLERK');
			String query ="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN"+cond+"order by job";
			//System.out.println(query);
			//send & execute sql queries in database software
			if(st!=null)
				//"SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN('"+a+"','"+b+"')"
rs=st.executeQuery("SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN('"+desg1+"','"+desg2+"')");
				//rs=st.executeQuery(SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN('MANAGER','CLERK'));
				//rs=st.executeQuery("SELECT EMPNO ,ENAME,JOB,MGR,SAL FROM EMP WHERE job in('"+desg1+"','"+desg2+"','"+desg3+"'ORDER BY job");
				//process the ResultSet
			if(rs!=null) {
				while(rs.next()) {
					flag=true;
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5));
					
				}//while
			if(flag==false)
				System.out.println("no records found");
			}//if
		}//try
	catch(SQLException se) {//known error
		se.printStackTrace();
	}
	catch(ClassNotFoundException cnf) {//known error
		cnf.printStackTrace();
	}
		catch(Exception e) {//unknown Exception
			e.printStackTrace();
		}
		finally {
			//close objects
			try {
				if(rs!=null)
					rs.close();}
			catch(SQLException se) 
			{
				se.printStackTrace();
				}
			try {
				if(st!=null)
					st.close();
			}
			catch(SQLException se) {
			se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try{
				if(sc!=null)
			sc.close();}
			catch(Exception se) {
				se.printStackTrace();}
		}//finally
		}//main
}//class