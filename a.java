import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class a {

	public static void main(String[] args) throws Exception{
		Scanner sc= new Scanner(System.in);
		//regester oracle driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","admin");

		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","admin"); 
		
		/*
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system","admin");
		*/
		//create stetment object
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("SELECT EMPNO,ENAME,DEPTNO,SAL,RANK() OVER (PARTITION BY DEPTNO ORDER BY SAL) AS RANK FROM EMP");
		System.out.println("EMPNO \tENAME \tDEPTNO \tSAL \tRank");
		System.out.println("----- \t----- \t------ \t--- \t----");
		while(rs.next())
		{
			
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5));
		}
	}

}
