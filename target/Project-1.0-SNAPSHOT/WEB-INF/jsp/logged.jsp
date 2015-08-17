<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
          <li><a href="loginform"><span class="glyphicon glyphicon-log-out"></span> Log out</a></li>
         <li class="dropdown">
                   <a class="dropdown-toggle" data-toggle="dropdown" href="#">My Account
                   <span class="caret"></span></a>
                   <ul class="dropdown-menu">
                     <li><a href="userdetails/${user.email}">${user.email}</a></li>
                     <li><a href="changepasswordform/${user.email}">Zmien haslo</a></li>
                   </ul>
          </li>

        </ul>
      </div>
    </div>
  </nav>
</div>
<p>You are logged </p>
</body>
</html>