<%@page import="com.manipal.model.SystemUser"%>
<%@page import="com.manipal.service.impl.SystemUserServiceImpl"%>
<%@page import="com.manipal.service.SystemUserService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<FORM ACTION="systemUser.jsp" METHOD="POST">
 <table border="1" width="30%" height="30%">
 <%int m=Integer.parseInt(request.getParameter("user_id"));
 SystemUserService ts=new SystemUserServiceImpl();
SystemUser ttt=ts.showSystemUser(m);
 %>
<tr><th><font color='Red'>Role ID</font></th>
<th><font color='Red'>User Id</font></th>
<th><font color='Red'>User Name</font></th>
<th><font color='Red'>Password</font></th>
<th><font color='Red'>First Name</font></th>
<th><font color='Red'>Last Name</font></th>
<th><font color='Red'>Email ID</font></th>
<th><font color='Red'>Date Of Birth</font></th>
<th><font color='Red'>Contact Number</font></th>





</tr>
<tr>
<td><b><font color='#663300'><%=ttt.getRole_id()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getUser_id()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getUsername()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getPassword()%></font></b></td>

<td><b><font color='#663300'><%=ttt.getFirst_name()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getLast_name()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getEmail_id()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getDob()%></font></b></td>
<td><b><font color='#663300'><%=ttt.getContact_no()%></font></b></td>


</tr>

 </table>
 

</FORM>
</body>
</html>