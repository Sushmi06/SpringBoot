<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "addStudent" method = "POST">
   <div class="container">
    <label for="id"><b>Id</b></label>
    <input type="text" placeholder="Enter ID" name="id" required>
    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>
    <button type="submit">Add</button>
  </div>
 </form>
 <br/>
 <form action = "getStudents" method = "POST">
	  <div>
	  	<button>Show</button>
	  </div>
  </form>
  <br/>
  <form action = "deleteStudent" method = "POST">
	  <div>
	  <label for="id"><b>Id</b></label>
	   <input type="text" placeholder="Enter ID" name="id" required>
	  	<button>Delete</button>
	  </div>
  </form>
</body>
</html>