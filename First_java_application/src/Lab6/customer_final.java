package Lab6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Servlet implementation class customer_final
 */
@WebServlet("/customer_final")
public class customer_final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customer_final() {
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
		HttpSession session=request.getSession();
		String c=session.getAttribute("c").toString();
		String name=request.getParameter("user_name");
		String mobile=request.getParameter("user_no");
		String Address=request.getParameter("user_add");		
		session.setAttribute("user_name", name);
		
		
		JSONParser parser=new JSONParser();
		JSONObject obj1 = null;
		try {
			obj1 =  (JSONObject) parser.parse(new FileReader("/media/mukesh/New Volume/Lab9/files/customer"+c+".json"));
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject obj=(JSONObject) obj1.get(c);
		obj.put("Name", name);
		obj.put("Status", "Order Placed");
		obj.put("mobile", mobile);
		obj.put("Address",Address);
		try (FileWriter file = new FileWriter("/media/mukesh/New Volume/Lab9/files/customer"+c+".json")) {
			file.write(obj1.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(name.equals("")||mobile.equals("")||Address.equals("")){
			String Error=session.getAttribute("Error").toString();
			Error="Feilds are not filled";
			System.out.println("yyyy"+name+"adsf"+Address+"adsf"+mobile);
			session.setAttribute("Error", Error);
			response.sendRedirect(request.getContextPath() + "/customer_3.jsp");
		}
		else{
				try{
					System.out.println("check error"+mobile.toString().length());
					if(Double.parseDouble(mobile.toString())!=0)
					{
						if(mobile.toString().length()!=10){
						String Error=session.getAttribute("Error").toString();
						Error="Mobile no. is wrong!";
						session.setAttribute("Error", Error);
						response.sendRedirect(request.getContextPath() + "/customer_3.jsp");}
						else{
							response.sendRedirect(request.getContextPath() + "/customer_4.jsp");}
					}	
					else{
						response.sendRedirect(request.getContextPath() + "/customer_4.jsp");}
				}catch (Exception e){
					String Error=session.getAttribute("Error").toString();
					Error="Mobile no. is wrong!!!";
					session.setAttribute("Error", Error);
					response.sendRedirect(request.getContextPath() + "/customer_3.jsp");
				}
				
		}
	}

}
