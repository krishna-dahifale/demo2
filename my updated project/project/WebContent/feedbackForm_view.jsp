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
<FORM ACTION="feedbackForm.jsp" METHOD="POST">
 <table border="1" width="30%" height="30%">
 <%int m=Integer.parseInt(request.getParameter("feedback_id"));
FeedbackFormService ts=new FeedbackFormServiceImpl();
 FeedbackForm ttt=ts.showFeedbackForm(m);
 %>
<tr><th><font color='Red'>Feedback ID</font></th>
<th><font color='Red'>Training ID</font></th>
<th><font color='Red'> Batch ID</font></th>
<th><font color='Red'> Faculty Name</font></th>
<th><font color='Red'> Feedback Date</font></th>

</tr>
<tr>
<td><b><font color='#663300'><%=ttt.getFeedback_id()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getTraining_id()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getBatch_id()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getFaculty_name()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getFeedback_date()%></font></b></td>


</tr>

</table>
 

</FORM>
</body>
</html>