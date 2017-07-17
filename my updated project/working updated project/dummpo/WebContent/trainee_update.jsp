<%@page import="com.manipal.model.Trainee"%>
<%@page import="com.manipal.service.impl.TraineeServiceImpl"%>
<%@page import="com.manipal.service.TraineeService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
table{

 
}
th, td {
     height: 30px;
	 
	 
}
th{
color: white;
 font-size: 150%;
}
td{
font-size: 120%;
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
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
		</div>
    </nav>
	

<header>
<form action="TraineeUpdateController" method="post">

<%	
int m=Integer.parseInt(request.getParameter("trainee_id"));
		  TraineeService bs=new TraineeServiceImpl();
		   
		  Trainee t=bs.showTrainee(m);
		  
		%>
		
		
	<font size=4><b>Trainee</b></font></br>
				</br> Trainee ID</br> <input type=text name="trainee_id" id="textname" size="30" value="<%=t.getTrainee_id()%>"></br>
				</br> Username</br> <input type=text name="username" id="textname" size="30" value="<%=t.getUsername()%>"></br>
				</br> Password</br> <input type=text name="password" id="textname" size="30" value="<%=t.getPassword()%>"></br>
				</br> First Name</br> <input type=text name="first_name" id="textname" size="30" value="<%=t.getFirst_name()%>"></br>
				</br> Last Name</br> <input type=text name="last_name" id="textname" size="30" value="<%=t.getLast_name()%>"></br>
				</br> Email ID</br> <input type=text name="email_id" id="textname" size="30" value="<%=t.getEmail_id()%>"></br>
				</br> Date Of Birth</br> <input type=text name="dob" id="textname" size="30" value="<%=t.getDob()%>"></br>
				</br> Contact No</br> <input type=text name="contact_no" id="textname" size="30" value="<%=t.getContact_no()%>"></br>
				</br> Higher Qualification</br> <input type=text name="h_qualification" id="textname" size="30" value="<%=t.getH_qualification()%>"></br>
				</br> Date OF Joining</br> <input type=text name="d_o_joining" id="textname" size="30" value="<%=t.getD_o_joining()%>"></br>
				
				
				
				</br> <input class="button" type="submit" value="Submit">
</form>
</header>
</body>
</html>