<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
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
          <li><a href="loginform"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </ul>
      </div>
    </div>
  </nav>
  <form:form method="POST" role="form" action="createaccount"  modelAttribute="user">
  <div class="form-group">
    <label for="email">Email address:</label>
    <form:input  path="email" type="email" class="form-control" id="email" />
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <form:input path="password" type="password" class="form-control" id="pwd" />
  </div>
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <form:button type="submit" class="btn btn-default">Submit</form:button>
</form:form>


</div>

</body>
</html>