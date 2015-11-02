<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="customer_3.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insane PizzaWala</title>
</head>
<body>
	<%
				HttpSession session1=request.getSession();
				String c=session1.getAttribute("c").toString();
				String error=session1.getAttribute("Error").toString();
  			%>
      <div style="position:fixed; left:70em;">
      		<h2 style="color:red;">Order ID no:-</h2>
     		<h2 style="color:red; position:relative; left:8em;top:-2em"><%=c%></h2>
      </div>

		<div id="form">		
      <form action="customer_final" method="post">
			      <input class="login" name="user_name" type="text" placeholder="Name">
			     <input class="login" name="user_no" type="text" placeholder="mobile number">
			     <input class="login" name="user_add" type="text" placeholder="Address">
      <input class="login" style="width:10em; left:5em;" type="submit" value="submit">
      </form>
      <p class="login" style="width:10em; left:5em; color:red;"><%=error %></p>
      </div>
</body>
</html>