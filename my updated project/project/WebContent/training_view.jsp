<%@page import="com.manipal.model.Training"%>
<%@page import="com.manipal.service.impl.TrainingServiceImpl"%>
<%@page import="com.manipal.service.TrainingService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<FORM ACTION="training.jsp" METHOD="POST">
 <table border="1" width="30%" height="30%">
 <%int m=Integer.parseInt(request.getParameter("training_id"));
 TrainingService ts=new TrainingServiceImpl();
 Training ttt=ts.showTrainee(m);
 %>
<tr><th><font color='Red'>Training ID</font></th>
<th><font color='Red'>Training Name</font></th>
<th><font color='Red'>Training Duration</font></th>
<th><font color='Red'>Training Discription</font></th></tr>
<tr>
<td><b><font color='#663300'><%=ttt.getTraining_id()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getTraining_name()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getTraining_duration()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getDiscription()%></font></b></td>
</tr>

 </table>
 

</FORM>
</body>
</html>