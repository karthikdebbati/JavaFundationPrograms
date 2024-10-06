package firstapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class Dynamicinsert {
	public static void main(String args[]) throws Exception
	{
		try
		{
			//Class.forName("com.mysql.jdbc.driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement stmt=con.createStatement();
			PreparedStatement pstmt=con.prepareStatement("select marks from stu where sid=1");
			
			

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
