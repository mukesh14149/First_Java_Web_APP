package Lab6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Servlet implementation class Restaurant
 */
@WebServlet("/Restaurant")
public class Restaurant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Restaurant() {
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
		String c=request.getParameter("id");
		String c1=request.getParameter("update");
		System.out.println(c+c1);

			JSONParser parser=new JSONParser();
			JSONObject obj1 = null;
			try {
				obj1 =  (JSONObject) parser.parse(new FileReader("/media/mukesh/New Volume/Lab9/files/customer"+c+".json"));
			}catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JSONObject obj=(JSONObject) obj1.get(c);
			System.out.println((String)obj.get("Status"));
			
			if(((String)obj.get("Status")).equals("Out for delivery")==true){
					obj.put("Status", "Delivered");
			}
			else if(((String)obj.get("Status")).equals("Quality Check")==true){
				obj.put("Status", "Out for delivery");
			}
			else if(((String)obj.get("Status")).equals("Bake")==true){
				obj.put("Status", "Quality Check");
			}
			else if(((String)obj.get("Status")).equals("Preparation")==true){
				obj.put("Status", "Bake");
			}
			else if(((String)obj.get("Status")).equals("Order Placed")==true){
				obj.put("Status", "Preparation");
			}
			try (FileWriter file = new FileWriter("/media/mukesh/New Volume/Lab9/files/customer"+c+".json")) {
				file.write(obj1.toJSONString());
				System.out.println("Successfully Copied JSON Object to File...");
				System.out.println("\nJSON Object: " + obj1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect(request.getContextPath() + "/Restaurant.jsp");
	}

}
