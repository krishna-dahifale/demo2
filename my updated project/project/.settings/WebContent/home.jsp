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


    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top">

    <nav id="Home" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid" id="Home">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
      <img src="img/atos1.png" alt="Smiley face" height="35" width="100" >

                <a class="navbar-brand page-scroll" href="#page-top"></a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#Home">Home</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#courses">Courses</a>
                    </li>
					<li>
                        <a class="page-scroll" href="#ql">Quick Links</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#about">AboutUs</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#contact">ContactUs</a>
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
                <h1 id="homeHeading">Give Your Feedback Here</h1>
                <p>Your Feedback is valuable to us!!! which will help us to improve training</p>

                <hr>
                <a href="#login" class="btn btn-primary btn-xl page-scroll">Trainee Login</a><br><br>
				                <a href="#alogin" class="btn btn-primary btn-xl page-scroll">Admin Login</a>

            </div>
        </div>
    </header>

   <section class="bg-primary" id="login">
                       <h2 class="section-heading" align="center">Trainee Login</h2>

   <form action="LoginController" method="post">
  <div class="imgcontainer">
    <img src="images/avatar.png" alt="Avatar" class="avatar"  ><br>
  </div>

  <div class="container" align="center">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required><br>

    <label><b>Password</b></label>
   <input type="password" placeholder="Enter Password" name="password" required><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit"  class="btn">Login</button>

    <button type="button"  class="btn">Cancel</button>
  </div>
  </td>
 
</form>



<section class="bg-second" id="alogin">
                       <h2 class="section-heading" align="center">Admin Login</h2>

   <form action="LoginAdminController" method="post">
  <div class="imgcontainer">
    <img src="images/avatar.png" alt="Avatar" class="avatar"  ><br>
  </div>

  <div class="container" align="center">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required><br>

    <label><b>Password</b></label>
   <input type="password" placeholder="Enter Password" name="password" required><br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" class="btn">Login</button>

    <button type="button"  class="btn">Cancel</button>
  </div>
  </td>
 
</form>

        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <hr> 
                    <p class="text-faded"></p>
                   
				  
                </div>
            </div>
        </div>
    </section>
					

                    
                </div>
            </div>
        </div>
    </section>
	
	
	 <section id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">About Us</h2>
				 <p>One of the most sensible ways of improving the training is to ask the trainees for the feedback. At the end of each session, 
				 the training institute surveys their Trainees. Usually these surveys are managed manually by paper work based approach. Paper based approach for trainees feedback management is a labour intensive process. We are going to develop the Web Based Training Feedback System to provide feedback in an easy and quick manner to the authenticated users. So we call it as Training Feedback System which is delivered via trainees. This project has two kinds of modules such as Trainee and Admin. The trainee can give the feedback in the Web Based System provided by Training Institute. This feedback report is checked by the Admin. The admin can view grades obtained to the Trainers and views several reports like how many
				 feedbacks have been conducted, analysis of the numerical feedback ratings, training wise feedback, trainer wise feedback ratings.</p>
                 <a href="#about" class="btn btn-primary btn-xl page-scroll">Find Out More</a>

                    <hr class="primary">
                </div>
            </div>
        </div>
	
	
	
	

    <section id="ql">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">At Your Service</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-diamond text-primary sr-icons"></i>
                        <h3>Batches :</h3>
                        <p class="text-muted">ATOS-JAVA<br>ATOS-ASP.NET<br></p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-paper-plane text-primary sr-icons"></i>
                        <h3>Faculty</h3>
                        <p class="text-muted">Mr.Aditya Sharma<br>Ms.Sheetal Shah</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-newspaper-o text-primary sr-icons"></i>
                        <h3>Give Feedback</h3>
                        <p class="text-muted">Latest Available Feedback</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        <i class="fa fa-4x fa-heart text-primary sr-icons"></i>
                        <h3>Rate Us</h3>
                        <p class="text-muted">You have to make your websites with love these days!</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

   

    <aside class="bg-dark" id="courses">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Courses</h2>
				<table >
  <tr>
   <th >Atos</th>
   </tr>
 
   <tr>
   <td >
<a href="addcandidate.jsp">ATOS-JAVA</a>
   <td>
   </tr>
   <tr>
   <td >
<a href="removecandidate.jsp">ATOS-ASP.NET</a>
   <td>
   </tr>
 </table>
 
 		<table >
  <tr>
   <th >Atos</th>
   </tr>
 
   <tr>
   <td >
<a href="addcandidate.jsp">IBM-JAVA</a>
   <td>
   </tr>
   <tr>
   <td >
<a href="removecandidate.jsp">IBM-ASP.NET</a>
   <td>
   </tr>
 </table>
                <a href="http://startbootstrap.com/template-overviews/creative/" class="btn btn-default btn-xl sr-button">Download Now!</a>
            </div>
        </div>
    </aside>

    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Let's Get In Touch!</h2>
                    <hr class="primary">
                    <p>Ready to start your next project with us? That's great! Give us a call or send us an email and we will get back to you as soon as possible!</p>
                </div>
                <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="fa fa-phone fa-3x sr-contact"></i>
                    <p>123-456-6789</p>
                </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-envelope-o fa-3x sr-contact"></i>
                    <p><a href="mailto:your-email@your-domain.com">feedback@atos.com</a></p>
                </div>
            </div>
        </div>
    </section>

    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="vendor/scrollreveal/scrollreveal.min.js"></script>
    <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/creative.min.js"></script>

</body>

</html>
