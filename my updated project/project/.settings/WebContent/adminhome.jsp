<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<% 

if(session.getAttribute("username")!=null)
{


%>

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
		</div>
    </nav>
	

<header>
        <div class="header-content">
            <div class="header-content-inner">
                <br><br><br><br><br><h1 id="homeHeading">Admin Home Page</h1>
                <h3>Welcome Admin!!!</h3>
                <hr>
				<table style="width:100%" >
				<tr>
				<td >
  <table class="t1"  >
  <tr >
<th align="right">Trainee</th>
   </tr>
 
   <tr>
   <td >
<a href="addtrainee.jsp">Add Trainee</a>
   <td>
   </tr>
   
    <tr>
   <td >
<a href="trainee.jsp">Customize Trainee</a>
   <td>
   </tr>
   
   
 </table></td>
 
<td> <table > 
   
    <tr>
   <th>Batch</th>
   </tr>
 
   <tr>
   <td >
<a href="addbatch.jsp">Add Batch</a>
   <td>
   </tr>
   <tr>
   <td >
<a href="batch.jsp">Customize Batch</a>
   <td>
   </tr>
   
   
   
</table></td><br><br>

<td><table > 
   
    <tr>
   <th >Feedback Form</th>
   </tr>
 
   <tr>
   <td >
<a href="addfbform.jsp">Add Feedback Form</a>
   <td>
   </tr>
   <tr>
   <td >
<a href="feedbackForm.jsp">Customize Feedback Form</a>
   <td>
   </tr>
   
  <!--   <tr>
   <td >
<a href="viewfbform.jsp">View Feedback Form</a>
   <td>
   </tr> -->
   
</table></td></tr>

 <td>
  <table > 
   
    <br><br><tr>
   <th>User</th>
   </tr>
 
   <tr>
   <td >
<a href="adduser.jsp">Add User</a>
   <td>
   </tr>
   <tr>
   <td >
<a href="systemUser.jsp">Customize User</a>
   <td>
   </tr>
   <!-- 
    <tr>
   <td >
<a href="viewuser.jsp">View User</a>
   <td>
   </tr>
    -->
   
   
   
   </td>
</table>


   
   <!--  <tr>
   <td >
<a href="viewfbform.jsp">View Feedback</a>
   <td>
   </tr> -->
   </td>
   
   <td  >
  <table > 
   
   <br><br> <tr>
   <th >Training</th>
   </tr>
 
   <tr>
   <td >
<a href="addtraining.jsp">Add Training</a>
   <td>
   </tr>
   <tr>
   <td >
<a href="training.jsp">Customize Training</a>
   <td>
   
</table>
<td>
 <table > 
   
   <br><br> <tr>
   <th>Question</th>
   </tr>
 
   <tr>
   <td >
<a href="Question.jsp">Customize Question</a>
   <td>
   </tr>
   
    <!-- <tr>
   <td >
<a href="viewquestion.jsp">View Question</a>
   <td>
   </tr> -->
   </td>
</table>

<tr >
 
   </tr>
   
    <!-- <tr>
   <td >
<a href="viewtraining.jsp">View Training</a>
   <td>
   </tr> -->
   </td>
</table>
 <td>
 
</table>


 
               <br><br><br> <a href="ReportFeedback.jsp" class="btn btn-primary btn-xl page-scroll">View feedback report</a><br><br>



 



       </div>
        </div>  
    </header>
  <%
}else{
	response.sendRedirect("home.jsp");
}

%>
</body>
</html>