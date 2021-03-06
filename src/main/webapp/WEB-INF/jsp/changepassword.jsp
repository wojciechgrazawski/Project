<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Project</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

  <nav class="navbar navbar-inverse">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="#">Project</a>
      </div>
      <div>
        <ul class="nav navbar-nav">
          <li class="active"><a href="#">Home</a></li>
          <li><a href="index">Page 1</a></li>
          <li><a href="#">Page 2</a></li>
          <li><a href="#">Page 3</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li><a href="singup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
          <li><a href="loginform"><span class="glyphicon glyphicon-log-out"></span> Log out</a></li>
        </ul>
      </div>
    </div>
  </nav>

   <form  action="change"  method="post">
      <input type="hidden" name="email" value=${user.email}>
     <div class="form-group">
       <label for="oldpassword">Old password:</label>
       <input  type="password" class="form-control" name="oldpassword" />
     </div>
     <div class="form-group">
       <label for="newpassword">New Password:</label>
       <input type="password" class="form-control" name="newpassword" />
     </div>
     <button type="submit" class="btn btn-default">Submit</button>
   </form>


</div>

</body>
</html>