package myws;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import myws.ConnectionClass;

@Path("demo")
public class FirstWebService
{

	ConnectionClass conn= new ConnectionClass();
	
	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String prc_hello()
	{
		return "Hello";
	}
	
	@GET
	@Path("cust/{Cust_name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCustomerOnName(@PathParam("Cust_name")String Cust_name)
	 {
		 Statement stmt;
		 String result="Customer Information on Name";
		 String sql="select Cust_name,business_type,cust_add from customers where Cust_name='"+Cust_name+"'";
		 try {
			
			stmt=conn.getConnection().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				result=result.concat(rs.getString("Cust_name")+" "+rs.getString("business_type")+""+rs.getString("cust_add"));
			}
			
			return result;
		 }
		 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		 
		 return result;
	 }
	
}
