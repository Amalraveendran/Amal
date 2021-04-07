<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin-panel</title>

 <link href="assets/img/back.jpg" rel="icon">
  <link href="assets/img/index.jpg" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">
</head>
<body>
<center>
<h1>Welcome Admin</h1>
<hr>
<h2>Login Here</h2>
<div>
<form action="AdminLogin" >

            <div class="col-lg-4 col-md-6 form-group">
              <input type="text" class="form-control" name="uname" id="uname" placeholder="Your username" data-rule="email" data-msg="Please enter a valid email">
            
            </div>
            <div class="col-lg-4 col-md-6 form-group">
              <input type="password" class="form-control" name="pwd" id="pwd" placeholder="Your password" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
			</div> 

            
            <input type="submit" class="btn btn-primary" value="Login">
            
            
           
</form>	
 </div>
</center>
 <script src="assets/vendor/jquery/jquery.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>
  <script src="assets/vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/venobox/venobox.min.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>
  <script>
    $('#datepicker').datepicker({
        uiLibrary: 'bootstrap4'
    });
</script>
  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>
</body>
</html>