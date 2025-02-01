/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class API 
{
	public static void main(String[] args) throws IOExpection, InterruptedException {
     var url = "https://www.accuweather.com/en/in/mumbai/204842/weather-forecast/204842";
     var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
     var client = HttpClient.newBuilder().build();
     var response = client.send(request, HttpResponse.BodyHandlers.ofString());
     System.out.println(response.statusCode());
     System.out.println(response.body());
	   }
	  
   }
	