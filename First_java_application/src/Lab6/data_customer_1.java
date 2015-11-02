package Lab6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class data_customer_1
 */
@WebServlet("/data_customer_1")
public class data_customer_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public data_customer_1() {
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
		
		
		String onion=request.getParameter("pizza1");
		String small_onion=request.getParameter("small1");
		String medium_onion=request.getParameter("medium1");
		String large_onion=request.getParameter("large1");
		String onion_s=request.getParameter("qtyS1");
		String onion_m=request.getParameter("qtyM1");
		String onion_l=request.getParameter("qtyL1");
		
		
		
		
		String simple=request.getParameter("PIZZA2");
		String small_simple=request.getParameter("small2");
		String medium_simple=request.getParameter("medium2");
		String large_simple=request.getParameter("large2");
		String simple_s=request.getParameter("qtyS2");
		String simple_m=request.getParameter("qtyM2");
		String simple_l=request.getParameter("qtyL2");
		
		
		
		
		String cheese=request.getParameter("PIZZA3");
		String small_cheese=request.getParameter("small3");
		String medium_cheese=request.getParameter("medium3");
		String large_cheese=request.getParameter("large3");
		String Cheese_s=request.getParameter("qtyS3");
		String Cheese_m=request.getParameter("qtyM3");
		String Cheese_l=request.getParameter("qtyL3");
		
		
		
		
		String tomato=request.getParameter("PIZZA4");
		String small_tomato=request.getParameter("small4");
		String medium_tomato=request.getParameter("medium4");
		String large_tomato=request.getParameter("large4");
		String Tomato_s=request.getParameter("qtyS4");
		String Tomato_m=request.getParameter("qtyM4");
		String Tomato_l=request.getParameter("qtyL4");
		
		
		
		
		System.out.println("welcome"+c+onion);
		JSONParser parser=new JSONParser();
		JSONObject obj1 = null;
		try {
			obj1 =  (JSONObject) parser.parse(new FileReader("/media/mukesh/New Volume/Lab9/files/customer"+c+".json"));
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject obj=(JSONObject) obj1.get(c);
		//obj.put("Status", "orderplaced");
		if(simple!=null){
		JSONObject sample=(JSONObject) obj.get("Simple");
			if(small_simple!=null)
			sample.put("Small", simple_s);
			
			if(medium_simple!=null)
			sample.put("Medium", simple_m);
			
			if(large_simple!=null)
			sample.put("Large", simple_l);
		}
		
		
		
		if(tomato!=null){
			JSONObject Tomato=(JSONObject) obj.get("Tomato");
			if(small_tomato!=null)
			Tomato.put("Small", Tomato_s);
			
			if(medium_tomato!=null)
			Tomato.put("Medium", Tomato_m);
			
			if(large_tomato!=null)
			Tomato.put("Large", Tomato_l);
		}
		
		
		
		
		if(cheese!=null){
			
			JSONObject Cheese=(JSONObject) obj.get("Cheese");
			if(small_cheese!=null)
			Cheese.put("Small", Cheese_s);
			
			if(medium_cheese!=null)
			Cheese.put("Medium", Cheese_m);
			
			if(large_cheese!=null)
			Cheese.put("Large", Cheese_l);
		}
		
		
		
		if(onion!=null){
			System.out.println("/media/mukesh/New Volume/Lab9/files/customer"+c+".json");
			System.out.println(obj.get("Onion"));
			System.out.println("hello"+small_onion);
			System.out.println("hello2"+onion);
			JSONObject Onion=(JSONObject) obj.get("Onion");
				if(small_onion!=null)
				Onion.put("Small", onion_s);
				
				if(medium_onion!=null)
				Onion.put("Medium", onion_m);
				
				if(large_onion!=null)
				Onion.put("Large", onion_l);
		}
			
			
			
			

		
		
		try (FileWriter file = new FileWriter("/media/mukesh/New Volume/Lab9/files/customer"+c+".json")) {
			file.write(obj1.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out=response.getWriter();
		out.println(obj1);
		//out.println(obj.get("Name"));
		response.sendRedirect(request.getContextPath() + "/customer_3.jsp");
	}

}
