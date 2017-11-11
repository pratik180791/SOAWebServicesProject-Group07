package ws;

import java.text.MessageFormat;


import javax.ws.rs.core.*;
import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.*;

public class ClientRest 
{
private WebResource webResource;
private Client client;
public static final String BASE_URI="http://localhost:8080/WebServiceUsingREST/rest";

public 	ClientRest()
{
	client=Client.create(new DefaultClientConfig());
	webResource=client.resource(BASE_URI).path("demo");
}

public String getHello() throws UniformInterfaceException
{WebResource resource=webResource;
resource=resource.
		 path(MessageFormat.format("hello", new 
				 Object[] {}));
	return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 01
public String getCustomerInfo(String cust_name) throws UniformInterfaceException
{WebResource resource=webResource;
resource=resource.
		 path(MessageFormat.format("cust/{0}", new 
				 Object[] {cust_name}));
	return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 02
public String getCustomerInfoOnState(String cust_state) throws UniformInterfaceException
{WebResource resource=webResource;
resource=resource.
		 path(MessageFormat.format("custonstate/{0}", new 
				 Object[] {cust_state}));
	return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 03
public String getCustomerAddressInfo(String cust_name) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("custaddress/{0}", new 
					 Object[] {cust_name}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
	
}

//WebService 04
public String getTransactionsDetailsInfo(String transaction_date) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("transactiondetails/{0}", new 
					 Object[] {transaction_date}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
	
}

//WebService 05
public String getLocationInfo(String location_city) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("locationoncity/{0}", new 
					 Object[] {location_city}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
	
}

//WebService 06
public String getModelWiseTrucks(String make_model) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("modelwise/{0}", new 
					 Object[] {make_model}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
	
}

//WebService 07
public String getMakeYearWiseTrucks(String make_year) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("makeyearwise/{0}", new 
					 Object[] {make_year}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
	
}

//WebService 08
public String getFirstNameWiseEmployees(String fname) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("empdetails/{0}", new 
					 Object[] {fname}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 09
public String getPricingsInfo() throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("pricing", new 
					 Object[] {}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 10
public String getPaymentsInfo(String payment_date) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("payments/{0}", new 
					 Object[] {payment_date}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 11
public String getCustomerOrdersCount(String custo_id) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("customerwiseorders/{0}", new 
					 Object[] {custo_id}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 12
public String getEmployeeExpenses(String empl_name) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("employeewiseexpenses/{0}", new 
					 Object[] {empl_name}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 13
public String getCustomerwiseInvoice(String custor_name) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("customerwiseinvoice/{0}", new 
					 Object[] {custor_name}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 14
public String getEmployeeWiseInfo(String employee_name) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("employeerevenue/{0}", new 
					 Object[] {employee_name}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 15
public String getOrderInvoiceAmount() throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("orderandinvoiceamounts", new 
					 Object[] {}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}


//WebService 16
public String getTitleWiseCount() throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("titlewisecounts", new 
					 Object[] {}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 17
public String getZipCodeWiseCustInfo(String zip) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("zipcodewise/{0}", new 
					 Object[] {zip}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 18
public String getEmployeeTransactionInfo(String emp_name) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("employeetransact/{0}", new 
					 Object[] {emp_name}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 19
public String getCommentsDetails(String comm_id) throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("comments/{0}", new 
					 Object[] {comm_id}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}

//WebService 20
public String getAllComments() throws UniformInterfaceException
{
	WebResource resource=webResource;
	resource=resource.
			 path(MessageFormat.format("allcomments", new 
					 Object[] {}));
		return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}



}
