<%@page import="com.manipal.model.Questions"%>
<%@page import="com.manipal.service.impl.QuestionServiceImpl"%>
<%@page import="com.manipal.service.QuestionService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<FORM ACTION="question.jsp" METHOD="POST">
 <table border="1" width="30%" height="30%">
 <%String m=request.getParameter("question_id");
 QuestionService ts=new QuestionServiceImpl();
 Questions qs=ts.showQuestions(m);
 %>
<tr><th><font color='Red'>Question ID</font></th>
<th><font color='Red'>Training ID</font></th>
<th><font color='Red'> Question</font></th>
</tr>
<tr>
<td><b><font color='#663300'><%=qs.getQuestion_id()%></font></b></td>
<td><b><font color='#663300'><%=qs.getTraining_id()%></font></b></td>
<td><b><font color='#663300'><%=qs.getQuestion()%></font></b></td>

</tr>

 </table>
 

</FORM>
</body>
</html>