package firstapp;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
public class Hello {
public static void main(String args[]) throws Exception
{
	try
	{
		Class.forName("com.mysql.jdbc.driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement stmt=con.createStatement();
		String de="delete from stu where sid=4";
		System.out.println("one row deleted");
		stmt.execute(de);
		
		

	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
