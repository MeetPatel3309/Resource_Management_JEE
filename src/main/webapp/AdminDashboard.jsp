<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="assets/css/Dashboard.css" rel="stylesheet" type="text/css">

</head>
<body>
	<h1>Admin Dashboard</h1>

	<div class="buttons-container">
		<a href="HRRegistration.jsp">
			<button class="add-btn" style="width: 266px">Add New HR</button>
		</a>
	</div>
	<div class="buttons-container">
		<a href="ListHr">
			<button class="view-btn view-btn1">View HR List</button>
		</a> <a href="#">
			<button class="view-btn view-btn2">View Resource</button>
		</a>
	</div>
	
    <div class="container ">
  
        <div class="row mt-4" style="align-items: center; margin: 0 30%;">
            <div class="col-md-4">
                <a href="ManageLangauge" class="btn btn-primary btn-block" style="background-color:  #cccc00; border: none;">Manage Language</a>
            </div>
            <div class="col-md-4">
                <a href="ManageTechnology" class="btn btn-secondary btn-block" style="border: none;">Manage Technology</a>
            </div>
            <div class="col-md-4">
                <a href="ManageDatabase" class="btn btn-success btn-block" style="background-color: #9ACD32; border: none;">Manage Database</a>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.15/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>	
	
</body>

</html>