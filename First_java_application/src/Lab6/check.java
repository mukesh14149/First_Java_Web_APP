package Lab6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class check {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		JSONParser parser=new JSONParser();
		JSONObject obj1 = null;
		try {
			obj1 =  (JSONObject) parser.parse(new FileReader("/media/mukesh/New Volume/Lab9/files/customer"+"1"+".json"));
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject obj=(JSONObject) obj1.get("1");
		System.out.println(obj.get("Name"));
		//long name=(long) obj.get("ID");
		//System.out.println(name);
	}

}
