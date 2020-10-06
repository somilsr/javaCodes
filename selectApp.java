//selectApp

import java.sql.*;
import java.util.*;
import java.io.*;

public class selectApp
{
	public static void main(String args[]) throws SQLException,IOException
	{
	
		//Class.forName("oracle.jdbc.driver.OracleDriver");
	oracle.jdbc.driver.OracleDriver dm= new oracle.jdbc.driver.OracleDriver();
	//register driver manager 
	DriverManager.registerDriver(dm);


		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","manager");
		//jdbc statement object
		Statement st=conn.createStatement();
		//execute the query
		ResultSet rs=st.executeQuery("SELECT * FROM EMP");
		//print db table records 
		while (rs.next()!=false)
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
			rs.close();
			st.close();
			conn.close();

	}
}