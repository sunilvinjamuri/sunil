package p4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import p3.Connectionfact;

public class Billservice implements BillDao
{
	public void ShowBill(Bill bill) {
		try
		{
		Connection connection= Connectionfact.getConnection();
		Statement statement = connection.createStatement();
		
		
		
	    statement.executeUpdate("insert into product_info(`no`,`id`,`item`,`quantity`,`bill`,`total`) values('"+bill.getNo()+"','"+bill.getId()+"','"+ bill.getName()+"','"+ bill.getQuantity()+"','"+ bill.getBill()+"','"+ bill.getTotal()+"')");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	

		
	
	


	public void DisplayBill() 
	{
		Connection connection= Connectionfact.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet re =statement.executeQuery("SELECT * FROM student.product_info;");
			while (re.next())
			{
				System.out.println(re.getInt(1));
				System.out.println(re.getInt(2));
				System.out.println(re.getString(3));
				System.out.println(re.getInt(4));
				System.out.println(re.getInt(5)); 
				System.out.println(re.getInt(6));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}







	@Override
	public void ShowBill() {
		// TODO Auto-generated method stub
		
	}

	
}
