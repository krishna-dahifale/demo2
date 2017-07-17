<%@page import="com.manipal.model.Batch"%>
<%@page import="com.manipal.service.impl.BatchServiceImpl"%>
<%@page import="com.manipal.service.BatchService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="BatchUpdateController" method="post">

<%	
int m=Integer.parseInt(request.getParameter("batch_id"));
		  BatchService bs=new BatchServiceImpl();
		   
		   Batch t=bs.showBatch(m);
		  
		%>
		
		
	<font size=4><b>Batch</b></font></br>
				</br> Batch ID</br> <input type=text name="batch_id" id="textname" size="30" value="<%=t.getBatch_id()%>"></br>
				</br> Training ID</br> <input type=text name="training_id" id="textname" size="30" value="<%=t.getTraining_id()%>"></br>
				</br> Batch Name</br> <input type=text name="batch_name" id="textname" size="30" value="<%=t.getBatch_name()%>"></br>
		


				</br> <input class="button" type="submit" value="Submit">
</form>
</body>
</html>