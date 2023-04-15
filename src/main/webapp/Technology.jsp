<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Manage Technology</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>


  <div class="container mt-5 form-container">
    <div class="row justify-content-center">
      <div class="col-md-12">
        <div class="card">
          <div class="card-header">
            <h2 class="text-center">Add Technology Form</h2>
          </div>
          <div class="card-body">
            <form action="ManageTechnology" method="post">
              <div class="form-group">
                <label for="language">Technology Name</label>
                <input type="text" class="form-control" id="technology" name="name" placeholder="Enter Technology name">
                ${nameError}
              </div>
              <div style="width="100%"; text-align: center;">
              <button type="submit" class="btn btn-primary btn-block" style="width: 20%;">Submit</button>
              </div> 
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>


    <div class="container mt-5">
        <h2 style="text-align: center;">Technology Table Data</h2>
        <table class="table mt-4">
            <thead class="thead-dark">
                <tr>
                    <th>Technology ID</th>
                    <th>Technology Name</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${techList}" var="list">
            
                <tr>
                    <td>${list.techId }</td>
                    <td>${list.name }</td>
                    <td><a href="DeleteTechnology?techId=${list.techId}"> <button>Delete</button> </a></td>
                </tr>
                
        	</c:forEach>
            
            </tbody>
        </table>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.15/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>





