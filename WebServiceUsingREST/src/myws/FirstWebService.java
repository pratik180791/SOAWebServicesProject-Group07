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
	
	//Web Service: 01
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
	
	//Web Service:02
	@GET
	@Path("custonstate/{Cust_State}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCustomerOnState(@PathParam("Cust_State")String Cust_State)
	 {
	 
		 Statement stmt;
		 String result="Customers state wise";
		 String sql="select Cust_Name,Cust_State from customers where Cust_state='"+Cust_State+"'";
		 try {
			conn.getConnection();
			stmt=conn.getConnection().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				result=result.concat(rs.getString("Cust_Name")+" "+rs.getString("Cust_State"));
			}
			
			return result;
		 }
		 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		 
		 return result;
	 }
	
	//WebService 03
	@GET
	@Path("custaddress/{Cust_Name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCustomerAddress(@PathParam("Cust_Name")String Cust_Name)
	 {
		 Statement stmt;
		 String result="Customer Information";
		 String sql="select Cust_Name, Cust_Add from customers where Cust_Name='"+Cust_Name+"'";
		 try {
			conn.getConnection();
			stmt=conn.getConnection().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				result=result.concat(rs.getString("Cust_Name")+" "+rs.getString("Cust_Add"));
			}
			
			return result;
		 }
		 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		 
		 return result;
	 }
	
	//WebService 04
	@GET
	@Path("transactiondetails/{date_of_transaction}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getTransactionsDetailsOnDate(@PathParam("date_of_transaction")String date_of_transaction)
	 {
		// System.out.println("Demo");
	 
		 Statement stmt;
		 String result="Transaction Details";
		 String sql="select transaction_Details,transaction_amount,vin from transactions where date_of_transaction='"+date_of_transaction+"'";
		 try {
			conn.getConnection();
			stmt=conn.getConnection().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				result=result.concat(rs.getString("transaction_Details")+" "+rs.getInt("transaction_amount")+" "+rs.getString("vin")+"\n");
			}
			
			return result;
		 }
		 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return result;
	 }

	//WebService 05
	@GET
	@Path("locationoncity/{loc_City}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getLocationOnCity(@PathParam("loc_City")String loc_City)
	 {
		 Statement stmt;
		 String result="Location Count";
		 String sql="select Loc_City, count(Loc_City) as 'Count' from locations where Loc_City='"+loc_City+"' group by Loc_City";
		 try {
			conn.getConnection();
			stmt=conn.getConnection().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				result=result.concat(rs.getString("Loc_City")+" "+ rs.getString("Count")+"\n");
			}
			
			return result;
		 }
		 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		 
		 return result;
	 }
	
	//WebService 06
		@GET
		@Path("modelwise/{make_model}")
		@Produces(MediaType.TEXT_PLAIN)
	public String getTrucksonModel(@PathParam("make_model")String make_model)
	 {
		 Statement stmt;
		 String result="Truck models /n";
		 String sql="select Make_Model, License_Plate_No, Truck_Color, Truck_VIN from trucks where Make_Model='"+make_model+"'";
		 try {
			conn.getConnection();
			stmt=conn.getConnection().createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				result=result.concat(rs.getString("Make_Model")+" "+rs.getString("License_Plate_No")+" "+rs.getString("Truck_Color")+" "+rs.getString("Truck_VIN")+"\n");
			}
			
			return result;
		 }
		 
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 return result;
	 }
	
		//WebService 07
		@GET
		@Path("makeyearwise/{make_year}")
		@Produces(MediaType.TEXT_PLAIN)
		public String getTrucksOnMakeYear(@PathParam("make_year")int make_year)
		 {
			// System.out.println("Demo");
		 
			 Statement stmt;
			 String result="List of Trucks & Information On Make year\n";
			 String sql="select Make_Model,License_Plate_No,truck_color,truck_vin from trucks where make_year='"+make_year+"'";
			 try {
				conn.getConnection();
				stmt=conn.getConnection().createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next())
				{
					result=result.concat(rs.getString("make_model")+" "+rs.getString("license_plate_no")+" "+rs.getString("truck_color")+ " "+ rs.getString("truck_vin") +"\n");
				}
				
				return result;
			 }
			 
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
			 
			 return result;
		 }
		
		//WebService 08
		@GET
		@Path("empdetails/{emp_first_name}")
		@Produces(MediaType.TEXT_PLAIN)
		public String getEmployeesOnFirstName(@PathParam("emp_first_name")String emp_first_name)
		 {
			// System.out.println("Demo");
		 
			 Statement stmt;
			 String result="Employee Information on First Name\n";
			 String sql="select emp_first_name,emp_last_name,emp_Add,job_title,driver_license_no,emp_phone_no from employees where emp_first_name='"+emp_first_name+"'";
			 try {
				conn.getConnection();
				stmt=conn.getConnection().createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next())
				{
					result=result.concat(rs.getString("emp_first_name")+" "+rs.getString("emp_last_name")+" "+rs.getString("emp_Add")+" "+rs.getString("job_title")+" "+rs.getString("driver_license_no")+" "+rs.getLong("emp_phone_no")+"\n");
				}
				
				return result;
			 }
			 
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
			 
			 return result;
		 }
		
		
		//WebService 09
				@GET
				@Path("pricing")
				@Produces(MediaType.TEXT_PLAIN)
				public String getPricings()
				 {	 
					 Statement stmt;
					 String result="Pricing list\n";
					 String sql="select Loc_Name_To,Loc_Name_From, price from Pricings";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getString("Loc_Name_To")+" "+rs.getString("Loc_Name_From")+" "+rs.getString("price")+"\n");
						}
						
						return result;
					 }
					 
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
					 
					 return result;
				 }
				
				//WebService 10
				@GET
				@Path("payments/{Payment_Date}")
				@Produces(MediaType.TEXT_PLAIN)
				public String getPaymentsOnDate(@PathParam("Payment_Date")String Payment_Date)
				 {
					// System.out.println("Demo");
				 
					 Statement stmt;
					 String result="Total payment on a given date\n";
					 String sql="select sum(Payment_amt) as 'Total' from payments where Payment_Date='"+Payment_Date+"' group by Payment_Date";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getInt("Total")+"\n");
						}
						
						return result;
					 }
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
					 
					 return result;
				 }
				
				//WebService 11
				@GET
				@Path("customerwiseorders/{cust_id}")
				@Produces(MediaType.TEXT_PLAIN)
				public String getCustomerTotalOrders(@PathParam("cust_id")String cust_id)
				 {
					 Statement stmt;
					 String result="Total orders till date by a customer\nCustomer Name   Order\n";
					 String sql="select customers.Cust_Name as Cust_Name, count(orders.order_id) as 'Total' from customers, orders where customers.cust_id = '"+cust_id+"' group by Cust_Name";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getString("Cust_Name")+" "+rs.getString("Total")+"\n");
						}
						
						return result;
					 }
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
					 
					 return result;
				 }
				
				//WebService12
				@GET
				@Path("employeewiseexpenses/{Emp_Name}")
				@Produces(MediaType.TEXT_PLAIN)
				public String getExpensesonEmpName(@PathParam("Emp_Name")String Emp_Name)
				 {
					// System.out.println("Demo");
					 Statement stmt;
					 String result="Expense based on Employee Name";
String sql="select e.Expense_Type,e.Purpose_of_Expense,e.Expense_Description,e.Payment_Method,e.Amount_Spend, e.Advance_Amt from expenses e,employees em where em.emp_id =e.emp_id AND em.Emp_First_Name='"+Emp_Name+"'";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getString("Expense_Type")+" "+rs.getString("Purpose_of_Expense")+" "+rs.getString("Expense_Description")+" "+rs.getString("PaymentMethod")+" "+rs.getInt("Amount_Spent")+" "+rs.getDate("Date_Purchased")+" "+rs.getDate("Date_Submitted")+" "+rs.getInt("Advance_Amt")+"\n");
						}		
						return result;
					 } 
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 return result;
				 }
				
				//WebService13
				@GET
				@Path("customerwiseinvoice/{Cust_Name}")
				@Produces(MediaType.TEXT_PLAIN)
				public String getInvoiceOnCustName(@PathParam("Cust_Name")String Cust_Name)
				 {
					 Statement stmt;
					 String result="Invoice information on Customer";
					 String sql="select i.Invoice_Id, i.invoice_amount, c.Cust_Name from invoices i, customers c where cust_name='"+Cust_Name+"'";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getString("i.Invoice_Id")+" "+rs.getString("i.invoice_amount")+" "+rs.getString("c.cust_name")+"\n");
						}
						
						return result;
					 }
					 
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
					 
					 return result;
				 }
				
				//WebService14
				@GET
				@Path("employeerevenue/{Emp_Name}")
				@Produces(MediaType.TEXT_PLAIN)
				public String getEmployeeRevenue(@PathParam("Emp_Name")String Emp_Name)
				 {
					// System.out.println("Demo");
				 
					 Statement stmt;
					 String result="Employee Wise Revenues\nAmount Employee ";
					 String sql="select i.invoice_amount, e.Emp_First_Name from invoices i, employees e where e.Emp_ID=i.employee_id AND Emp_First_Name='"+Emp_Name+"'";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getString("i.invoice_amount")+" "+rs.getString("e.Emp_First_Name")+"\n");
						}
						
						return result;
					 }
					 
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 return result;
				 }
				
				//WebService15
				@GET
				@Path("orderandinvoiceamounts")
				@Produces(MediaType.TEXT_PLAIN)
				public String getInvoiceOrderAmount()
				 {
					// System.out.println("Demo");
				 
					 Statement stmt;
					 String result="Invoice Amount OrderTotalAmount";
					 String sql="select i.invoice_amount, o.order_total_amount from orders o, invoices i where i.order_id=o.Order_ID;\r\n";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getString("i.invoice_amount")+" "+rs.getString("o.order_total_amount")+"\n");
						}
						
						return result;
					 }
					 
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
					 
					 return result;
				 }
				
				//WebService16
				@GET
				@Path("titlewisecounts")
				@Produces(MediaType.TEXT_PLAIN)
				public String getCountByTitle()
				 {
					// System.out.println("Demo");
				 
					 Statement stmt;
					 String result="Employee count by Job Title\nTitle Number of Employees";
					 String sql="select job_title, count(job_title) from employees group by job_title;";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getString("job_title")+ " " + rs.getString("count(job_title)")+"\n");
						}
						
						return result;
					 }
					 
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
					 
					 return result;
				 }
				
				//WebService17
				@GET
				@Path("zipcodewise/{zip_code}")
				@Produces(MediaType.TEXT_PLAIN)
				public String getCustomerOnZipCode(@PathParam("zip_code")int zip_code)
				 {
					// System.out.println("Demo");
				 
					 Statement stmt;
					 String result="Customer details on Zip Code\n";
					 String sql="select Cust_Name, Cust_City from customers where cust_zipcode='"+zip_code+"';";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getString("Cust_Name")+ " " + rs.getString("Cust_City")+"\n");
						}
						
						return result;
					 }
					 
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
					 
					 return result;
				 }
				
				//WebService18
				@GET
				@Path("employeetransact/{emp_name}")
				@Produces(MediaType.TEXT_PLAIN)
				public String getEmployeeTransaction(@PathParam("emp_name")String emp_name)
				 {
					Statement stmt;
					 String result="Employee Transaction amount";
					 String sql="select t.transaction_amount, e.emp_first_name from transactions t, employees e where t.Emp_ID=e.Emp_ID and e.Emp_First_Name ='"+emp_name+"';";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getString("t.transaction_amount")+ " " + rs.getString("e.emp_first_name")+"\n");
						}
						
						return result;
					 }
					 
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
					 
					 return result;
				 }

				//WebService19
				@GET
				@Path("comments/{Comment_ID}")
				@Produces(MediaType.TEXT_PLAIN)
				public String getComments(@PathParam("Comment_ID")String Comment_ID)
				 {
							 
					 Statement stmt;
					 String result="Comment Details\n CommentTime CommentDetail CustId\n";
					 String sql="select Time_of_Comment,Comment_detail,Cust_ID from Comments where Comment_ID='"+Comment_ID+"'";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getTimestamp("Time_of_Comment")+" "+rs.getString("Comment_detail")+" "+rs.getString("Cust_ID")+"\n");
						}
						
						return result;
					 }
					 
					 catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
					 
					 return result;
				 }
			
				//WebService20
				@GET
				@Path("allcomments")
				@Produces(MediaType.TEXT_PLAIN)
				public String getAllComments()
				 {
				
				 
					 Statement stmt;
					 String result="Comments from customers\nCommentTime  CommentDetail\n";
					 String sql="select time_Of_Comment,comment_detail from comments;";
					 try {
						conn.getConnection();
						stmt=conn.getConnection().createStatement();
						ResultSet rs=stmt.executeQuery(sql);
						while(rs.next())
						{
							result=result.concat(rs.getTimestamp("Time_of_Comment")+" "+rs.getString("comment_detail")+"\n");
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
