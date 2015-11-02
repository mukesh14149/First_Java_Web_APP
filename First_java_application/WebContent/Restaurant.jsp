<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="Restaurant.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insane PizzaWala</title>

		<style>
		table{
				background-color:white;
				position:relative;
				width:50%;
				left:20em;
				top:5em;
				
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
	<%@ page import="org.json.simple.JSONObject" 
		import="org.json.simple.parser.JSONParser"
	import="org.json.simple.parser.ParseException"
	import="java.io.FileReader"
	import="java.io.IOException"
	%>
			
		<table >
			  <tr>
			    <th>Order id</th>
			    <th>Name</th>
			    <th>Mobile no.</th>	
			    <th>Address</th>	
			    <th>Status</th>		
			    <th>update</th>
			  </tr>
			  <% 		
			  	//HttpSession session1=request.getSession();
				//String c=session1.getAttribute("c").toString();
				int count=100;
					//	System.out.println(c);		  
			  			System.out.println("hello"+count);
						JSONParser parser=new JSONParser();
						JSONObject obj1 = null;
						for(int i=1;i<=count;i++){
							
						try {
							
							obj1 =  (JSONObject) parser.parse(new FileReader("/media/mukesh/New Volume/Lab9/files/customer"+i+".json"));
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("No order found!!");
							break;

						}
						catch (ParseException 	e) {
							// TODO Auto-generated catch block
							System.out.println("No order found!!");
							break;
						}
						JSONObject obj=(JSONObject) obj1.get(String.valueOf(i));
						System.out.println(obj.get("Name"));
						String name=(String)obj.get("Name");
						String ID=(String)obj.get("ID");
						String status=(String)obj.get("Status");
						String Address=(String)obj.get("Address");
						String mobile=(String)obj.get("mobile");
	%>
					<% if(status.equals("Delivered")==false){  %>
					  <tr>
					  <form action="Restaurant" method="post">
						
					    <td><%=ID%><input type="hidden" name="id" value=<%=ID%> /></td>
					    <td><p><%=name%></p></td>
					    <td><p><%=mobile%></p></td>	
			    		<td><p><%=Address%></p></td>
					    <td><p><%=status%></p></td>		
					    <td><input type="submit" name="update" value="Update"></td>
					      </form>
					  </tr>
			  <% }} %>
		</table>
			
</body>
</html>