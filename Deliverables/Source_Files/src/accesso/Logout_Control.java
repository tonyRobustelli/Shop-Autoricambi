package accesso;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout_Control extends HttpServlet{

    public Logout_Control() {
       super();
	 }
	
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		
	}
	
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	  doGet(request,response);
	}  
}