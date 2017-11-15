package controller;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ws.ClientRest;

/**
 * Servlet implementation class ControllerServlet
 */

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw= response.getWriter();
	response.setContentType("text/html");
	try {
		ClientRest cr=new ClientRest();
		pw.println("before call");
		//pw.print(cr.getHello());
		
		
		String s_ws02_cust_state=request.getParameter("ws02_cust_state");
		String s_ws01_cust_namee=request.getParameter("ws01_cust_name");
		String s_ws03_cust_name=request.getParameter("ws03_cust_name");
		String s_ws04_transaction_date=request.getParameter("ws04_transaction_date");
		String s_ws05_location_city=request.getParameter("ws05_location_city");
		String s_ws06_model_name=request.getParameter("ws06_model_name");
		String s_ws07_make_year=request.getParameter("ws07_make_year");
		String s_ws08_emp_fname=request.getParameter("ws08_emp_fnamer");
		String s_ws10_payment_date=request.getParameter("ws10_payment_date");
		String s_ws11_cust_id=request.getParameter("ws11_cust_id");
		String s_ws12_emp_name=request.getParameter("ws12_emp_name");
		String s_ws13_cust_name=request.getParameter("ws13_cust_name");
		String s_ws14_emp_name=request.getParameter("ws14_emp_name");
		String s_ws17_get_zip=request.getParameter("ws17_get_zip");
		String s_ws18_get_emp_name=request.getParameter("ws18_get_emp_name");
		String s_ws19_comment_id=request.getParameter("ws19_comment-id");
		
		if(s_ws01_cust_namee!=null && !s_ws01_cust_namee.isEmpty())
		{
			pw.println("<br>"+cr.getCustomerInfo(s_ws01_cust_namee));
		}
			
		if(s_ws02_cust_state!=null && !s_ws02_cust_state.isEmpty())
		{
		pw.println("<br>"+cr.getCustomerInfoOnState(s_ws02_cust_state));
		}
		
		
		if(s_ws03_cust_name!=null && !s_ws03_cust_name.isEmpty())
		{
		pw.println("<br>"+cr.getCustomerAddressInfo(s_ws03_cust_name));
		}
		
		
		if(s_ws04_transaction_date!=null && !s_ws04_transaction_date.isEmpty())
		{
pw.println("<br>"+cr.getTransactionsDetailsInfo(s_ws04_transaction_date));
		}
		
		
		
		if(s_ws05_location_city!=null && !s_ws05_location_city.isEmpty())
		{
			pw.println("In if, --------");
		pw.println("<br>"+cr.getLocationInfo(s_ws05_location_city));
		}
		//s_ws06_model_name
		if(s_ws06_model_name!=null && !s_ws06_model_name.isEmpty())
		{
		pw.println("<br>"+cr.getModelWiseTrucks(s_ws06_model_name));
		}
		
		
		if(s_ws07_make_year!=null && !s_ws07_make_year.isEmpty())
		{
		pw.println("<br>"+cr.getMakeYearWiseTrucks(s_ws07_make_year));
		}
		//s_ws08_emp_fname
		
		if(s_ws08_emp_fname!=null && !s_ws08_emp_fname.isEmpty())
		{
		pw.println("<br>"+cr.getFirstNameWiseEmployees(s_ws08_emp_fname));
		}
		
		if(request.getParameter("ws09_get_pricings_info")!=null)
		{
		pw.println("<br>"+cr.getPricingsInfo());
		}
	
		if(s_ws10_payment_date!=null && !s_ws10_payment_date.isEmpty())
		{
		pw.println("<br>"+cr.getPaymentsInfo(s_ws10_payment_date));
		}
		
		if(s_ws11_cust_id!=null && !s_ws11_cust_id.isEmpty())
		{
		pw.println("<br>"+cr.getCustomerOrdersCount(s_ws11_cust_id));
		}
		
		if(s_ws12_emp_name!=null && !s_ws12_emp_name.isEmpty())
		{
		pw.println("<br>"+cr.getEmployeeExpenses(s_ws12_emp_name));
		}
		
		if(s_ws13_cust_name!=null && !s_ws13_cust_name.isEmpty())
		{
		pw.println("<br>"+cr.getCustomerwiseInvoice(s_ws13_cust_name));
		}
		
		if(s_ws14_emp_name!=null && !s_ws14_emp_name.isEmpty())
		{
		pw.println("<br>"+cr.getEmployeeWiseInfo(s_ws14_emp_name));
		}
		
		if(request.getParameter("ws15_get_Invoice_Amounts")!=null)
		{
		pw.println("<br>"+cr.getOrderInvoiceAmount());
		}
		
		if(request.getParameter("ws16_get_title_wise_counts")!=null)
		{
		pw.println("<br>"+cr.getTitleWiseCount());
		}
		
		if(s_ws17_get_zip!=null && !s_ws17_get_zip.isEmpty())
		{
		pw.println("<br>"+cr.getZipCodeWiseCustInfo(s_ws17_get_zip));
		}
		
		if(s_ws18_get_emp_name!=null && !s_ws18_get_emp_name.isEmpty())
		{
		pw.println("<br>"+cr.getEmployeeTransactionInfo(s_ws18_get_emp_name));
		}
		
		if(s_ws19_comment_id!=null && !s_ws19_comment_id.isEmpty())
		{
		pw.println("<br>"+cr.getCommentsDetails(s_ws19_comment_id));
		}
		
		if(request.getParameter("ws20_get_allComments")!=null)
		{
		pw.println("<br>"+cr.getAllComments());
		}
	}
	catch(Exception e)
	{
pw.println(e.getMessage());	
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
