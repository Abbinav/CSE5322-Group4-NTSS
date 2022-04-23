<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.group6.ntss.model.Event" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NTSS</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<jsp:include page="navbar.jsp"></jsp:include>
</head>
<body>
<div class="container">
  <h1>Event Registration</h1>
  <div class="card">
   <div class="card-body">
    <form action = "/event/registration" method="post">

     <table class="table table-striped">
				<thead>
					<tr class="row">
						<th class="col col-3" scope="col">Name</th>
						<th class="col col-2" scope="col">Theme</th>
						<th class="col col-2" scope="col">Location</th>
						<th class="col col-1" scope="col">Duration</th>
						<th class="col col-3" scope="col">Slogan</th>
						<th class="col col-1" scope="col">Register</th>
					</tr>
				</thead>

				<tbody>
					<%
					List<Event> eventsList = (List<Event>)request.getAttribute("eventsList");
						
					for(int i=0;i < eventsList.size();i++) {
					%>		
					<tr class="row">
						<td class="col col-3" scope="col"> <%= eventsList.get(i).getEvent_name() %> </td>
						<td class="col col-2" scope="col"><%= eventsList.get(i).getTheme() %></td>
						<td class="col col-2" scope="col"><%= eventsList.get(i).getLocation() %></td>
						<td class="col col-1" scope="col"><%= eventsList.get(i).getDuration() %></td>
						<td class="col col-3" scope="col"><%= eventsList.get(i).getSlogan() %></td>
						<td class="col col-1" scope="col">
							<input type="checkbox" id="registerEvent<%= eventsList.get(i).getId() %>" 
									name="event-register" value="event-register">
						</td>
						<%
							}
						%>
					</tr>
					
				</tbody>
			</table>

	<div class="form-group row">
     <button type="submit" class="btn btn-primary">Register</button>
     </div>
    </form>
   </div>
  </div>
 </div>
</body>
</html>

