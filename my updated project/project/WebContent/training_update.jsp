<%@page import="com.manipal.model.Training"%>
<%@page import="com.manipal.service.impl.TrainingServiceImpl"%>
<%@page import="com.manipal.service.TrainingService"%>
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
<form action="TrainingUpdateController" method="post">
<%	
int m=Integer.parseInt(request.getParameter("training_id"));
		   TrainingService ts=new TrainingServiceImpl();
		   
		   Training t=ts.showTrainee(m);
		  
		%>
		
		
	<font size=4><b>Training</b></font></br>
				</br> Training ID</br> <input type=text name="training_id" id="textname" size="30" value="<%=t.getTraining_id()%>"></br>
				</br> Training Name</br> <input type=text name="training_name" id="textname" size="30" value="<%=t.getTraining_name()%>"></br>
				</br> Training Duration</br> <input type=text name="training_duration" id="textname" size="30" value="<%=t.getTraining_duration()%>"></br>
				</br> Training Description</br> <input type=text name="training_discription" id="textname" size="30" value="<%=t.getDiscription()%>"></br>

				</br> <input class="button" type="submit" value="Submit">
		
				
				
			

</form>
</header>
</body>
</html>