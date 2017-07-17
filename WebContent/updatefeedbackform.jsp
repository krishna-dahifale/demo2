<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
	
	    
    <link href="css/login.css" rel="stylesheet">


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
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
     float: center;
	 
	
}
	
	
	
	table {
   
    width: 80%;
     margin-left:auto; 
    margin-right:auto;

     
  
    
}

th, td {
    text-align: left;
    padding: 8px;
	font-size: 25px;
	  width: 50px;
      
}

tr{

width: 30%
}

th {
    background-color: #B0C4DE;
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
 height: 1400px;
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
      <img src="C:\Users\Administrator\Downloads\Project GUI\startbootstrap-creative-gh-pages\startbootstrap-creative-gh-pages\img\atos1.png" alt="Smiley face" height="35" width="100">

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
        <div class="header-content">
            <div class="header-content-inner">
             <h2 id="homeHeading">Update Feedback Form</h2>
                <form action="/action_page.php">
<table align="center" >
<tr>
  <td width="20%">
  Trainee ID:
   </td>
    <td><input type="text" name="uname" value="Enter Name" required/>
  </td>
  </tr>
  
 
<tr>
  <td width="20%">
  Username:
   </td>
    <td><input type="text" name="uname" value="Enter Name" required/>
  </td>
  </tr>
  
  
  <tr>
  <td>
  Password:
   </td>
    <td><input type="password" name="passwd" value="Enter Password" required/>
  </td>
  </tr>
  
   <!-- <tr  >
  <td width="40%">
  Course ID: </td>
  <td width="60%">
  <input type="text" name="tid" value="Enter ID" required/></td>
  </tr>
  
  
   <tr  >
  <td width="40%">
  Batch ID: </td>
  <td width="60%">
  <input type="text" name="tid" value="Enter ID" required/></td>
  </tr> -->
  
  <tr>
  <td>
  
  First Name:
   </td>
    <td><input type="text" name="tname" value="Enter Name" required/>
  </td>
  </tr>
  
   <tr  >
  <td width="40%">
  Last Name: </td>
  <td width="60%">
  <input type="text" name="tid" value="Enter ID" required/></td>
  </tr>
  
  <tr>
  <td>
  E-mail Id: </td>
   <td><input type="email" name="tmail" value="Enter E-mail" required/>
  </td>
  </tr>
  
   <tr>
  <td>
  Date Of Birth: </td>
   <td><input type="date" name="tdate" value="Enter" required/>
  </td></tr>
  
  
  
  
  
  <tr>
  <td>
  Contact No.: </td>
   <td><input type="text" name="tnum" value="Mobile No." required/>
  </td>
  </tr>
  
 <tr  >
  <td width="40%">
  Highest Qualification: </td>
  <td width="60%">
  <input type="text" name="tid" value="Enter ID" required/></td>
  </tr>
  
  <tr  >
  <td width="40%">
 Date Of Joining: </td>
  <td width="60%">
  <input type="date" name="tid" value="Enter ID" required/></td>
  </tr>
  
  <tr  >
  <td width="40%">
 End Date: </td>
  <td width="60%">
  <input type="date" name="tid" value="Enter ID" required/></td>
  </tr>
  
 
  

  
 <tr>
 
<td align="center" colspan="2">

 <div class="contain" >
  <button type="button" class="submitbtn" >Update</button>
    
  </div>
   <div class="contain" >
  <button type="reset" class="cbtn" >clear</button>
    
  </div>
 </td></tr>
 </table>
</form>
                <hr>
                

            </div>
        </div>
    </header>


</body>

</html>
