<%@page import="com.manipal.model.SystemUser"%>
<%@page import="java.util.List"%>
<%@page import="com.manipal.service.impl.SystemUserServiceImpl"%>
<%@page import="com.manipal.service.SystemUserService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

<% 

if(session.getAttribute("username")!=null)
{


%>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Creative - Start Bootstrap Theme</title>
	<style type="text/css">
	
	</style>
	
	    
    <link href="C:\Users\Administrator\Downloads\Project GUI\startbootstrap-creative-gh-pages\startbootstrap-creative-gh-pages\css\login.css" rel="stylesheet">


    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
	
	<link rel="stylesheet" type="text/css" href="C:\Users\Administrator\Downloads\Project GUI\startbootstrap-creative-gh-pages\startbootstrap-creative-gh-pages\css\login.css">

    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	
	
	
	<style>
	input[type=text], input[type=password],input[type=date],input[type=number],input[type=email]{
    width: 75%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
     float: center;
     color:black;
	 
	
}
	
	
	
	table {
   
    width: 75%;
     margin-left:auto; 
    margin-right:auto;

     
  
    
}

th, td {
    text-align: left;
    padding: 8px;
	font-size: 25px;
	  
      
}


.td1{
width: 10%;
}

tr{

width: 30%
}

th {
    background-color: #f05f40;
    color: white;
    height: 20px;
   
}


.submitbtn{
background-color:#f05f40;
float:left;
width: 30%;

}
.cbtn{
background-color:#f05f40;
float:right;
width: 30%;


}
header{
 height: 1200px;
    width: 1400px;
}


	</style>
	<script type="text/javascript">

function validateForm() {
    var x = document.forms["myForm"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
}

  
</script>

</head>

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid" id="Home">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
      <img src="img/atos1.png" alt="Smiley face" height="35" width="100">

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
    </nav>

    <header>
<FORM ACTION="TraineeDeleteController" METHOD="GET">

<table border="1" align="center">
  <br><br><h2>System User Details</h2><br><br><tr><th>User ID</font></th>
  <th>Role ID</font></th>
	<th>First Name </font></th>
	<th>User Name</font></th>
	
	<!-- <th><font color='Red'>First </font></th>
	<th><font color='Red'>Question ID</font></th>
	<th><font color='Red'>Faculty Name</font></th> -->
	<!-- <th><font color='Red'>View Training</font></th> -->
	<th>Delete User</font></th></tr>
<%-- 	<%
 String ValidMessage=(String)request.getAttribute("Message");
 if(ValidMessage!=null)
 {%>
	<%=ValidMessage%>
	<%
 }
 %> --%>
<%
SystemUserService ts= new SystemUserServiceImpl();
List<SystemUser> tlist=ts.viewSystemUser();
int cn=0;
String s="Training";
	for(SystemUser detail:tlist)
		{ %>
<tr>
<td><b><font color='#663300'><a href="systemUser_view.jsp?user_id=<%=detail.getUser_id()%>"><%=detail.getUser_id()%></a></font></b></td>
<td><b><font color='#663300'><%=detail.getRole_id()%></font></b></td>
<td><b><font color='#663300'><%=detail.getFirst_name()%></font></b></td>
<td><b><font color='#663300'><%=detail.getLast_name()%></font></b></td>



<%-- <td><b><font color='#663300'><a href="trainee_update.jsp?trainee_id=<%=detail.getTrainee_id()%>">update</a> </font></b></td> --%>



<%
if("ACTIVE".equalsIgnoreCase(detail.getStatus()))
{%>

<td><b><font color='#663300'><a href="SystemUserDeleteController?user_id=<%=detail.getUser_id()%>&status=INACTIVE">DELETE</a></font></b></td>

<%}else{ %>

<td><b><font color='#663300'><a href="SystemUserDeleteController?user_id=<%=detail.getUser_id()%>&status=ACTIVE">ACTIVATE</a></font></b></td>

<%} %>

</tr>
	<%} %>	
</table>
<%
}else{
	response.sendRedirect("home.jsp");
}

%>	
</FORM>
</body>
</html>