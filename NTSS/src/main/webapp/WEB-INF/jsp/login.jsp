<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<jsp:include page="navbar.jsp"></jsp:include>
</head>
<body>
	
	 <div class="container">
  <h1>Login</h1>
  <div class="card">
   <div class="card-body">
    <form action = "userLogin" method="post">

     <div class=" form-group row">
      <label for="email" class="col-sm-2 col-form-label">Email Address</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="email"
        placeholder="Enter Email">
      </div>
     </div>

     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Password</label>
      <div class="col-sm-7">
       <input type="password" class="form-control" name="password"
        placeholder="Enter Password">
      </div>
     </div>
	


	<div class="form-group row">
     <button type="submit" class="btn btn-primary" >Login</button>
     </div>
    </form>
   </div>
  </div>
 </div>

</body>
</html>