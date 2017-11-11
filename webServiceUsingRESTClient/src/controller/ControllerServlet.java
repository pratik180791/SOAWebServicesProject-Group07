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
		pw.print(cr.getHello());
		pw.println("<br>"+cr.getCustomerInfo("Harvey"));
		pw.println("<br>"+cr.getCustomerInfoOnState("New York"));
		
		pw.println("<br>"+cr.getCustomerAddressInfo("Harvey"));
		pw.println("<br>"+cr.getTransactionsDetailsInfo("2017-08-02"));
		pw.println("<br>"+cr.getLocationInfo("Chicago"));
		pw.println("<br>"+cr.getModelWiseTrucks("TATA"));
		pw.println("<br>"+cr.getMakeYearWiseTrucks("2015"));
		pw.println("<br>"+cr.getFirstNameWiseEmployees("Mike"));
		pw.println("<br>"+cr.getPricingsInfo());
		pw.println("<br>"+cr.getPaymentsInfo("2017-08-02"));
		pw.println("<br>"+cr.getCustomerOrdersCount("Cust003"));
		pw.println("<br>"+cr.getEmployeeExpenses("Harvey"));
		pw.println("<br>"+cr.getCustomerwiseInvoice("Harvey"));
		pw.println("<br>"+cr.getEmployeeWiseInfo("Pratik"));
		pw.println("<br>"+cr.getOrderInvoiceAmount());
		pw.println("<br>"+cr.getTitleWiseCount());
		pw.println("<br>"+cr.getZipCodeWiseCustInfo("60605"));
		pw.println("<br>"+cr.getEmployeeTransactionInfo("Pratik"));
		pw.println("<br>"+cr.getCommentsDetails("Com1"));
		pw.println("<br>"+cr.getAllComments());
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
