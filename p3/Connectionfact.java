package p3;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectionfact 
{
	 static Connection connection=null;
	 public static Connection getConnection() {
		 try
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	        
	        
	        return connection;
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	        return connection;
	    }	 

}
