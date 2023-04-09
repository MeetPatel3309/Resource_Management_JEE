<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HR Registration</title>

<link href="assets/css/HRRegistration.css" rel="stylesheet" type="text/css">
</head>
<body>
  
  <div class="frame">
 
	<h1>HR Registration Form</h1>

    <form class="registration-form" action="HRRegistration" method="post">
   
      <input type="text" id="name" name="name" placeholder="Your name" value="${nameValue}"> ${nameError }
      
      <input type="email" id="email" name="email" placeholder="Your email" value="${emailValue}"> ${emailError }
      
      <input type="password" id="password" name="password" placeholder="Your password">${passwordError }
      
      <input type="text" id="mobileNo" name="mobileNo" placeholder="Your mobile number" value="${mobileValue}">  ${mobileError }
      
      <input type="submit" value="Register">
    
    </form>
  </div>
  
  
</body>

</html>