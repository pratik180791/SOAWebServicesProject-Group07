<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Portal For Truck Services Access</title>
</head>
<body>
<form action="ControllerServlet">
  Web Service 01<br>
  Enter Customer Name:<input type="text" name="ws01_cust_name" ><br><br>
  Web Service 02<br>
  Enter Customer State:<input type="text" name="ws02_cust_state"><br><br>
  Web Service 03<br>
  Enter Customer Name<input type="text" name="ws03_cust_name"><br><br>
  Web Service 04<br>
  Enter transaction date:<input type="text" name="ws04_transaction_date"><br><br>
  Web Service 05<br>
  Enter City Name:<input type="text" name="ws05_location_city"><br><br>
  Web Service 06<br>
  Enter Model Name:<input type="text" name="ws06_model_name"><br><br>
  Web Service 07<br>
  Enter Model Make Year:<input type="text" name="ws07_make_year"><br><br>
  Web Service 08<br>
  Enter Employee First Name:<input type="text" name="ws08_emp_fnamer"><br><br>
  Web Service 09<br>
  Get Pricing Information:<button type="button" name="ws09_get_pricings_info">GET_PRICING_INFO</button><br><br>
  Web Service 10<br>
  Enter Payment Date:<input type="text" name="ws10_payment_date"><br><br>
  Web Service 11<br>
  Enter Customer ID:<input type="text" name="ws11_cust_id"><br><br>
  Web Service 12<br>
  Enter Employee Name:<input type="text" name="ws12_emp_name"><br><br>
  Web Service 13<br>
  Enter Customer Name:<input type="text" name="ws13_cust_name"><br><br>
  Web Service 14<br>
  Enter Employee Name:<input type="text" name="ws14_emp_name"><br><br>
  Web Service 15<br>
  Get Order and Invoice Amounts:<button type="button" name="ws15_get_Invoice_Amounts">GetOrderInvoiceAmounts</button><br><br>
  
  Web Service 16<br>
  Get title wise counts:<button type="button" name="ws16_get_title_wise_counts">GetTitleWiseCounts</button><br><br>
  
  
  Web Service 17<br><br>
  Enter zip code:<button type="button" name="ws17_get_zip">zipcode</button><br><br>
  
  
  Web Service 18<br>
  Enter employee name:<input type="text" name="ws18_get_emp_name"><br><br>
  
  
  Web Service 19<br>
 Enter Comment Id:<input type="text" name="ws19_comment-id"><br><br>
  
  
  Web Service 20<br>
  Get Comments:<button type="button" name="ws20_get_allComments">comments</button><br><br>

  <br>
  <input type="submit" value="Submit">
</form>

</body>
</html>