<%@page import="com.manipal.model.FeedbackForm"%>
<%@page import="com.manipal.service.impl.FeedbackFormServiceImpl"%>
<%@page import="com.manipal.service.FeedbackFormService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FeedbackFormUpdate" method="post">
<table>
<%	
int m=Integer.parseInt(request.getParameter("feedback_id"));
		  FeedbackFormService bs=new FeedbackFormServiceImpl();
		   
		   FeedbackForm t=bs.showFeedbackForm(m);
		  
		%>

<tr><td>Feedback Id</td><td><input type="text" name="feedback_id" value="<%=t.getFeedback_id()%>"></td></tr>
<tr><td>Training Id</td><td><input type="text" name="training_id" value="<%=t.getTraining_id()%>"></td></tr>
<tr><td>Batch Id</td><td><input type="text" name="batch_id" value="<%=t.getBatch_id()%>"></td></tr>
<tr><td>Faculty Name</td><td><input type="text" name="faculty_name" value="<%=t.getFaculty_name()%>"></td></tr>
<tr><td>Feedback Date</td><td><input type="date" name="feedback_date" value="<%=t.getFeedback_date()%>"></td></tr>
<tr><td><input type="submit" name="Submit" value="submit"></td></tr>
</table>

</form>
</body>
</html>