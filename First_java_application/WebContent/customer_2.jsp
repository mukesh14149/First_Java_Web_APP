<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="customer_2.css"/>
<title>Insane PizzaWala</title>
	<style>
		table{
			margin-left:30em;
			margin-top:-8em;
		}
		table, th, td {
		    border: 1px solid black;
		    border-collapse: collapse;
		   
		}
		th, td {
		    padding: 5px;
		}
		</style>
</head>
<body>
		<%HttpSession session1=request.getSession();
	String c=session1.getAttribute("c").toString();
  %>
		
		<div style="position:fixed; left:70em;">
      		<h2 style="color:red;">Order ID no:-</h2>
     		<h2 style="color:red;position:relative; left:8em;top:-2em"><%=c%></h2>
      </div>
      <div style="position:relative;margin-top:0em;">
      <br>
      <br>
      <br>
      <br>
      <br>
      <br>
  	<form action="data_customer_1" method="post">
			<div style="position:relative;">
			
			<span style="position:relative; top:-5em;left:1em;  "><input  type="checkbox" name="pizza1" value="pizza1"></span>
			<span class="items"><div id="onion"><img  src="./onion.jpg" ><span style="position:relative;top:1em;margin-left:5em;">Onion Pizza</span></div></span>
			
			
			<table style="position:relative;width:40%; top:-5em;" >
			<tr>
			    <th>Checkout</th>
			    <th>Pizza Size</th>
			    <th>Quantity</th>		
			 </tr>
			 <tr>
					<td><input type="checkbox" name="small1" value="small" ></td>
					<td>Small</td>	
					<td ><input  type="text" name="qtyS1"  size="1" placeholder="1"  value="1"></td>
			</tr>
			<tr>
					<td><input type="checkbox" name="medium1" value="medium"></td>
					<td>Medium</td>
					<td><input  type="text" name="qtyM1"  size="1" placeholder="1"  value="1"></td>
			</tr>
			<tr>
					<td><input type="checkbox" name="large1" value="large"></td>
					<td>Large</td>
					<td><input  type="text" name="qtyL1"  size="1" placeholder="1"  value="1"></td>
			</tr>
			</table>
			</div>
			<br>
			
			
			<div>
					<span style="position:relative; top:-5em;left:1em;"><input type="checkbox" name="PIZZA2" value="pizza2"></span>
					<span class="items"><div id="onion"><img  src="./simple.jpg" ><span style="position:relative;top:1em;margin-left:5em;">Simple Pizza</span></div></span>
					
					<table style="position:relative;width:40%; top:-5em;" >
							<tr>
							    <th>Checkout</th>
							    <th>Pizza Size</th>
							    <th>Quantity</th>		
							 </tr>
			 				<tr>
								<td><input type="checkbox" name="small2" value="small">
								<td>SMALL</td>
								<td><input type="text" name="qtyS2"  size="1" placeholder="1"  value="1"></td>
							</tr>
					
							<tr>
								<td><input type="checkbox" name="medium2" value="medium"></td>
								<td>MEDIUM</td>
								<td><input type="text" name="qtyM2"  size="1" placeholder="1"  value="1"></td>
					</tr>
					
					<tr>
								<td><input type="checkbox" name="large2" value="large"></td>
								<td>LARGE</td>
								<td><input type="text" name="qtyL2"  size="1" placeholder="1"  value="1"></td>
					</tr>
				</table>	
			</div>
			
			
			<br>
			
			
			<div>
			<table style="position:relative;width:40%; top:-5em;" >
							<span style="position:relative; top:-5em;left:1em;"><input type="checkbox" name="PIZZA3" value="pizza3"></span>
							<span class="items"><div id="onion"><img  src="./cheese.jpg" ><span style="position:relative;top:1em;margin-left:5em;">Cheese Pizza</span></div></span>
							<tr>
							    <th>Checkout</th>
							    <th>Pizza Size</th>
							    <th>Quantity</th>		
							 </tr>
			<tr>
			<td><input type="checkbox" name="small3" value="small"></td>
			<td>SMALL</td>
			<td><input type="text" name="qtyS3"  size="1" placeholder="1"  value="1"></td>
			</tr>
			<tr>
			<td><input type="checkbox" name="medium3" value="medium"></td>
			<td>MEDIUm</td>
			<td><input type="text" name="qtyM3"  size="1" placeholder="1" value="1"></td>
			</tr>
			<tr>
			<td><input type="checkbox" name="large3" value="large"></td>
			<td>LARGE</td>
			<td><input type="text" name="qtyL3"  size="1" placeholder="1"  value="1"></td>
			</tr>
			</table>
			
			</div>
						
			
			<br>
			
			
			
			<div>
						<table style="position:relative;width:40%; top:-5em;" >
							<span style="position:relative; top:-5em;left:1em;"><input type="checkbox" name="PIZZA4" value="pizza4"></span>
							<span class="items"><div id="onion"><img  src="./tomato.jpg" ><span style="position:relative;top:1em;margin-left:5em;">Tomato Pizza</span></div></span>
							<tr>
							    <th>Checkout</th>
							    <th>Pizza Size</th>
							    <th>Quantity</th>		
							 </tr>
							 
							<tr>
							   <td><input type="checkbox" name="small4" value="small"></td>
							   <td>SMALL</td>
								<td><input type="text" name="qtyS4" size="1" placeholder="1" value="1"></td>
							</tr>
							
							
							<tr>
								<td><input type="checkbox" name="medium4" value="medium"></td>
								<td>MEDIUM</td>
								<td><input type="text" name="qtyM4" size="1" placeholder="1" value="1"></td>
							</tr>
							
							<tr>
							
									<td><input type="checkbox" name="large4" value="large"></td>
									<td>LARGE</td>
									<td><input type="text" name="qtyL4"  size="1" placeholder="1" value="1"></td>
									
							</tr>
							
							
			</table>
			</div>
			<br>
							<input style="position:relative; top:-1em;left:40em;width:10em;height:5em;"type="submit" name="submit" value="SUBMIT">
  </form>
  
  </div>
</body>
</html>