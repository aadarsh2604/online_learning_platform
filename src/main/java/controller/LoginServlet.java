package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import model.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		User user = new User(username,password);
		
		try 
		{			
			if (UserDAO.validateUser(user)) 
			{
	            // Redirect to success page
	            response.sendRedirect("Home.jsp");
	        } 
			else 
			{
	            // Redirect to error page
	            response.sendRedirect("Registration.jsp");
	        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			response.sendRedirect("Home.jsp");
		}
	}
}


