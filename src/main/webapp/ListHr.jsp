<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>HR Table</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2>HR Data Table</h2>
        <table class="table table-bordered mt-3">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Mobile Number</th>
                </tr>
            </thead>
            <tbody>
            
            <c:forEach items="${list}" var="bean">
                <tr>
                    <td>${bean.hrid}</td>
                    <td>${bean.name }</td>
                    <td>${bean.email }</td>
                    <td>${bean.password }</td>
                    <td>${bean.mobileNo }</td>
                </tr>
                
                </c:forEach>
                <!-- Add more rows as needed -->
            </tbody>
        </table>
    </div>

	
	 <a href="AdminDashboard.jsp" class="btn btn-primary" style="margin-left: 120px; margin-bottom: 25px; width: 10%;">Back</a>
	
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.15/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>