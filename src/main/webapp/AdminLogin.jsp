<%@page import="javax.net.ssl.SNIHostName"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>

<link href="assets/css/AdminLogin.css" rel="stylesheet" type="text/css">
</head>
<body>

	 <div class="login-container">
    <h1>Admin Login</h1>
    <form class="login-form" action="AdminAuthentication" method="post">
      <input type="text" name="email" placeholder="Email">
      <input type="password" name="password" placeholder="Password">
      <button type="submit">Login</button>
    </form>
  </div>
 
	 <div class="error">
	  ${error}
	</div>
</body>

</html>