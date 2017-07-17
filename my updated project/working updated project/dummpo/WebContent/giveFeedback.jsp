<%@page import="com.manipal.service.impl.FeedbackFormReportServiceImpl"%>
<%@page import="com.manipal.service.FeedbackFormReportService"%>
<%@page import="com.manipal.service.impl.QuestionServiceImpl"%>
<%@page import="com.manipal.service.QuestionService"%>
<%@page import="com.manipal.service.impl.TrainingServiceImpl"%>
<%@page import="com.manipal.service.TrainingService"%>
<%@page import="com.manipal.model.*"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>

<% 

if(session.getAttribute("username")!=null)
{


%>
<style type="text/css">
input[type=text], input[type=password],input[type=date],input[type=number],input[type=email],select{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
     float: center;
     color:black;
	 
	
}


input[type=text], input[type=password],input[type=date],input[type=number],input[type=email],select{
    width: 20%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
     float: center;
	     color: black;

	 
	
}

	

table {
    border-collapse: collapse;
    width: 90%;
    
}

th, td {
    text-align: left;
    padding: 8px;
   
     color: white;
     width:20%;
}
.td1{
color:white;
width:30%;
}

th{
  background-color: #edebea;
}

/* tr:nth-child(even){background-color: #f2f2f2} */

/* th {
    background-color: #efe9e8;
    color: #f05f40;
} */

/* tr:hover{background-color:#f5f5f5} */

.submitbtn{
margin-left:auto;
    margin-right:auto;
background-color:#f05f40;
 

width: 40%;

}
.cbtn{
margin-left:auto;
    margin-right:auto;
background-color:#f05f40;

width: 40%;
 


}



</style>
<link href="css\login.css" rel="stylesheet">
	      <link href="vendor\bootstrap\css\bootstrap.min.css" rel="stylesheet">
	  
	      <link href="vendor\font-awesome\css\font-awesome.min.css" rel="stylesheet" type="text/css">
	  
	  
 <link href="css\creative.css" rel="stylesheet">
 
	     <link href="css\creative.min.css" rel="stylesheet">
	     
	     <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
	

    <link href="vendor\magnific-popup\magnific-popup.css" rel="stylesheet">
    <link href="css/creative.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="page-top">


    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid" id="Home">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
      <img src="img\atos1.png" alt="Smiley face" height="35" width="100">

                <a class="navbar-brand page-scroll" href="#page-top"></a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="home.jsp">Home</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="home.jsp">Courses</a>
                    </li>
					<li>
                        <a class="page-scroll" href="home.jsp">Quick Links</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="home.jsp">AboutUs</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="home.jsp">ContactUs</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
		</div>
    </nav>

<header>
<form action="GenerateFeedbackReportController" method="POST">
<table width="10%" color="white" align="left">
<br><br><br><br><tr><td width="20%"><h3>FeedbackId</h3></td><td ><input type="text" name="feedback_id" class="td1"></td></tr>
<tr><td><h3>TraineeId</h3></td><td ><input type="text" name="trainee_id" class="td1"></td></tr></table>
</table>

<%
QuestionService qs= new QuestionServiceImpl();
FeedbackFormReportService ffr=new FeedbackFormReportServiceImpl();
List<Questions> qlist=qs.viewQuestions();
 for(Questions ss:qlist)
{%>
<table>
<tr><td colspan="3"><b><h3><%=ss.getQuestion()%></h3></b></td></tr>
<tr>
<td><input type="radio" name="<%=ss.getQuestion_id()%>" value="5">5</td>
<td><input type="radio" name="<%=ss.getQuestion_id()%>" value="4">4</td>
<td><input type="radio" name="<%=ss.getQuestion_id()%>" value="3">3</td>
<td><input type="radio" name="<%=ss.getQuestion_id()%>" value="2">2</td>
<td><input type="radio" name="<%=ss.getQuestion_id()%>" value="1">1</td>
</tr>

<%} %>
<br><tr><td align="center" ><br><br><br><input type="submit" value="Submit" name ="Submit" class="submitbtn"/></td>
	<td align="center" ><br><br><br><input type="reset" value="Reset" name="Reset" class="cbtn"></td>
</tr>



</table>
		
<%
}else{
	response.sendRedirect("home.jsp");
}

%>
</form>
</header>
</body>
</html>