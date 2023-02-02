import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@SuppressWarnings("serial")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String uname=request.getParameter("un");
		String password=request.getParameter("ps");
		
		if(uname.equals("Rutikesh")&& password.equals("123")) {
			response.sendRedirect("nextPage.jsp");
		}
		
		else {
			response.sendRedirect("index.jsp");
		}
	
	}

	

}
