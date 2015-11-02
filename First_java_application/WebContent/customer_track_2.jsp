<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insane PizzaWala</title>
</head>
<body>	
		<%@ page import="org.json.simple.JSONObject" 
		import="org.json.simple.parser.JSONParser"
	import="org.json.simple.parser.ParseException"
	import="java.io.FileReader"
	import="java.io.IOException"
	%>
		<%	HttpSession session1=request.getSession();
			String c=session1.getAttribute("id").toString();
			JSONParser parser=new JSONParser();
			JSONObject obj1 = null;
			
				
			try {
				
				obj1 =  (JSONObject) parser.parse(new FileReader("/media/mukesh/New Volume/Lab9/files/customer"+c+".json"));
				JSONObject obj=(JSONObject) obj1.get(String.valueOf(c));
				System.out.println(obj.get("Name"));
				String name=(String)obj.get("Name");
				String ID=(String)obj.get("ID");
				String status=(String)obj.get("Status");
				String Address=(String)obj.get("Address");
				String mobile=(String)obj.get("mobile");
			%>
				<table >
			  <tr>
			    <th>Order id</th>
			    <th>Name</th>
			    <th>Mobile no.</th>	
			    <th>Address</th>	
			    <th>Status</th>		
			    <th>Home Page</th>
			  </tr>
			  <tr>
			  		
			  
					  <form action="customer_1.jsp" method="post">
						
					    <td><%=ID%><input type="hidden" name="id" value=<%=ID%> /></td>
					    <td><p><%=name%></p></td>
					    <td><p><%=mobile%></p></td>	
			    		<td><p><%=Address%></p></td>
					    <td><p><%=status%></p></td>		
					    <td><input type="submit" name="update" value="Go Back"></td>
					      </form>
					  </tr>
	</table>	
			<% } catch (IOException e) {
				// TODO Auto-generated catch block
				%><h1>This data is not Preasent</h1>
			<% 

			}
			catch (ParseException 	e) {
				// TODO Auto-generated catch block
				%><h1>This data is not Preasent</h1>
				<% 
				
			}
			
		
		%>

			

</body>
</html>