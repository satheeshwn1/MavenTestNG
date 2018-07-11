import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by satheesh on 7/6/18.
 */
public class JsonToJava {
    @SuppressWarnings("unchecked")
    public static void main (String args[]) throws IOException, ParseException {
       JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader("/Users/satheesh/Downloads/MavenTestNGProject/src/testData/username.txt"));
            JSONObject jsonObject = (JSONObject) obj;

            String username = (String) jsonObject .get("firstName");
            String password = (String) jsonObject .get("password");
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");

            System.out.println("Name: "+username);
            System.out.println("Pass: "+password);
            System.out.println("Company List: ");
            Iterator <String> iterator = companyList.iterator();
            while(iterator.hasNext())
            {
                System.out.println(iterator.next());
            }

        }
         catch( FileNotFoundException e)
         {
            e.printStackTrace();
          }
     }
}
