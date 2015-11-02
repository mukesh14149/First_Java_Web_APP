package Lab6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

/**
 * Servlet implementation class customer_1
 */
@WebServlet("/customer_1")
public class customer_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int c=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customer_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		c++;
		PrintWriter out=response.getWriter(); 
		String a=request.getParameter("option");
		if(a!=null){
		System.out.println(a);}
		HttpSession session=request.getSession();
		
		if(a.equals("Create order"))
		{
			session.setAttribute("option", a);
			session.setAttribute("c", c);
			String Error="";
			session.setAttribute("Error", Error);
			JSONObject obj=new JSONObject();
			JSONObject subobj=new JSONObject();
			JSONObject subsubobj=new JSONObject();
			obj.put(c,subobj );
			//subobj=(JSONObject) JSONValue.parse("obj");
			subobj.put("Status", null);
			subobj.put("Name", null);
			subobj.put("ID", String.valueOf(c));
			subobj.put("mobile", null);
			subobj.put("Address", null);
			subobj.put("Onion",  subsubobj);
			subobj.put("Simple", subsubobj);
			subobj.put("Cheese", subsubobj);
			subobj.put("Tomato", subsubobj);
			subsubobj.put("Small", null);
			subsubobj.put("Medium", null);
			subsubobj.put("Large", null);
			
	
		 
			try (FileWriter file = new FileWriter("/media/mukesh/New Volume/Lab9/files/customer"+c+".json")) {   //path of files of customer
				file.write(obj.toJSONString());
				System.out.println("Successfully Copied JSON Object to File...");
				System.out.println("\nJSON Object: " + obj);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(c);
			response.sendRedirect(request.getContextPath() + "/customer_2.jsp");
			
		}
		else{ 
			
			c--;
			response.sendRedirect(request.getContextPath() + "/customer_track_1.jsp");
		}
	}

}
