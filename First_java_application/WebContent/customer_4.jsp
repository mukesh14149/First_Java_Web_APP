<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insane PizzaWala</title>
<link rel="stylesheet" type="text/css" href="customer_4.css"/>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
		<%	HttpSession session1=request.getSession();
		String name=session1.getAttribute("user_name").toString();
		String c=session1.getAttribute("c").toString();
  	%>
  	<div style="position:fixed; left:70em;">
      		<h2 style="color:red;">Hii!</h2>
     		<h2 style="color:red; position:relative; left:2em;top:-1.8em"><%=name%></h2>
      </div>
      <div style="position:fixed; left:70em; top:3em;">
      		<h2 style="color:red;">Order ID no:-</h2>
     		<h2 style="color:red; position:relative; left:6em;top:-1.7em"><%=c%></h2>
      </div>
 
  	
		<div id="form">
		<h3 style="color:red;" class="login">Your order Successfully placed</h3>
		<a href="customer_1.jsp"><button class="btn btn-primary" id="button"  value="Track order" name="option">Click your Status</button></a>
		</div>
</body>
</html>