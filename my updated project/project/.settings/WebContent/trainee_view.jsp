<%@page import="com.manipal.model.Trainee"%>
<%@page import="com.manipal.service.impl.TraineeServiceImpl"%>
<%@page import="com.manipal.service.TraineeService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<FORM ACTION="trainee.jsp" METHOD="POST">
 <table border="1" width="30%" height="30%">
 <%int m=Integer.parseInt(request.getParameter("trainee_id"));
 TraineeService ts=new TraineeServiceImpl();
 Trainee ttt=ts.showTrainee(m);
 %>
<tr><th><font color='Red'>Trainee ID</font></th>
<th><font color='Red'>Username</font></th>
<th><font color='Red'>Password</font></th>
<th><font color='Red'>First Name</font></th>
<th><font color='Red'>Last Name</font></th>
<th><font color='Red'>Email ID</font></th>
<th><font color='Red'>Date Of Birth</font></th>
<th><font color='Red'>Contact No</font></th>
<th><font color='Red'>Higher Qualification</font></th>
<th><font color='Red'>Date Of Joining</font></th>




</tr>
<tr>
<td><b><font color='#663300'><%=ttt.getTrainee_id()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getUsername()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getPassword()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getFirst_name()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getLast_name()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getEmail_id()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getDob()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getContact_no()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getH_qualification()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getD_o_joining()%></font></b></td>



</tr>

 </table>
 

</FORM>
</body>
</html>