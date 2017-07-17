<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 

if(session.getAttribute("username")!=null)
{


%>
<html lang="en">



<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Creative - Start Bootstrap Theme</title>
	<style type="text/css">
	
	</style>
	
	  <link href="css\login.css" rel="stylesheet">
	      <link href="vendor\bootstrap\css\bootstrap.min.css" rel="stylesheet">
	  
	      <link href="vendor\font-awesome\css\font-awesome.min.css" rel="stylesheet" type="text/css">
	  
	  
 <link href="css\creative.css" rel="stylesheet">
 
	     <link href="css\creative.min.css" rel="stylesheet">
	     
  


    <!-- Bootstrap Core CSS -->

    <!-- Custom Fonts -->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

    <!-- Plugin CSS -->
	

    <link href="vendor\magnific-popup\magnific-popup.css" rel="stylesheet">
    <link href="css/creative.css" rel="stylesheet">
   
	<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
       color: Black;
}

tr:nth-child(even){background-color: #f2f2f2}
tr:nth-child(odd){background-color: #fca997}


th {
    background-color: #F05F40;;
    color: Black;
}

header{
 height: 900px;
    width: 1400px;
}


	</style>

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
                    <li>
                        <a class="page-scroll" href="home.jsp"><img alt="err" src="img/logout11.png"  height="50" width="70"></a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
		</div>
    </nav>
	

<header>

 <div class="header-content">
            <div class="header-content-inner">
              <h1 id="homeHeading">Trainee Home Page</h1>
                <h3>Welcome Trainee</h3>
                <hr>
				<table align="center">
				<br><br><tr>
				<th>SI No.</th>
                <th>Feedback name</th>
                <th>Feedback Type</th>
                <th>Options</th>
				</tr>
				<tr>
				<td>1.</td>
				<td>	Student Feedback Form - Servlet & JSP</td>
				<td>Student evaluation of subject</td>
				<td><a href="giveFeedback.jsp"><img alt="err" src="img/play.png" width="60" height="50"></a></td>
				</tr>
				
				
				<td>2.</td>
				<td>Student Feedback Form - Hibernate</td>
				<td>Student evaluation of subject</td>
				<td><a href="giveFeedback.jsp"><img alt="err" src="img/play.png" width="60" height="50"></a></td>
				</tr>
				
				
				<td>3.</td>
				<td>	Student Feedback Form - Java Web Services</td>
				<td>Student evaluation of subject</td>
				<td><a href="giveFeedback.jsp"><img alt="err" src="img/play.png" width="60" height="50"></a></td>
				</tr>
				
				
				<td>4.</td>
				<td>	Student Feedback Form - Servlet & JSP</td>
				<td>Student evaluation of subject</td>
				<td><a href="giveFeedback.jsp"><img alt="err" src="img/play.png" width="60" height="50"></a></td>
				</tr>
				
				
				<td>5.</td>
				<td>Student Feedback Form - Advanced J2EE and EJB & JSF</td>
				<td>Student evaluation of subject</td>
				<td><a href="giveFeedback.jsp"><img alt="err" src="img/play.png" width="60" height="50"></a></td>
				</tr>
				
				
				<td>6.</td>
				<td>Student Feedback Form - Build Tools (Ant & Maven)	</td>
				<td>Student evaluation of subject</td>
				<td><a href="giveFeedback.jsp"><img alt="err" src="img/play.png" width="60" height="50"></a></td>
				</tr>
				
				</table>
		
<%
}else{
	response.sendRedirect("home.jsp");
}

%>

</body>

</html>