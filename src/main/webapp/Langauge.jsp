<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Manage Langauge</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>


  <div class="container mt-5 form-container">
    <div class="row justify-content-center">
      <div class="col-md-12">
        <div class="card">
          <div class="card-header">
            <h2 class="text-center">Add Language Form</h2>
          </div>
          <div class="card-body">
            <form action="ManageLangauge" method="post">
              <div class="form-group">
                <label for="language">Language Name</label>
                <input type="text" class="form-control" id="language" name="name" placeholder="Enter language name">
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
        <h2 style="text-align: center;">Langauge Table Data</h2>
        <table class="table mt-4">
            <thead class="thead-dark">
                <tr>
                    <th>Langauge ID</th>
                    <th>Langauge Name</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${lanList}" var="list">
            
                <tr>
                    <td>${list.lanId }</td>
                    <td>${list.name }</td>
                    <td><a href="DeleteLangauge?lanId=${list.lanId}"> <button>Delete</button> </a></td>
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





