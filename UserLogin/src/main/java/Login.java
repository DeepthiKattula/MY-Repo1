

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out=response.getWriter();  
        
        request.getRequestDispatcher("index.html").include(request, response);  
		String userId = request.getParameter("userid");
		String userPw = request.getParameter("userpw");
        HttpSession session=request.getSession();  
    session.setAttribute("userid",  userId);
    session.setAttribute("userpw",  userPw);
    //PrintWriter out = response.getWriter();
  
  
    if (userId != null && userId.equalsIgnoreCase("admin") && userPw != null && userPw.equalsIgnoreCase("admin"))
    	
    request.getRequestDispatcher("").forward(request, response);
    response.sendRedirect("Dashboard");
		doGet(request, response);
	}

}
