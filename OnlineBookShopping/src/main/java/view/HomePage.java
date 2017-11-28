package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.Iterator;

import model.UserModel;


public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public HomePage() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	{
        response.setContentType("text/html;charset=UTF-8");
		
		try{
			PrintWriter out = response.getWriter();
			
			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<title>Servlet Error Page</title>");
			out.println("</head>");
			out.println("<body>");
			
			UserModel user = (UserModel)request.getAttribute("UserModel");
			out.println("Wellcome:"+ user.getFirstName() + ":)");
			out.println("<a href='indexLogIn.html'> Click here for Login. </a>");
			out.println("</body></html>");
			
		}
		catch(Exception e)
		{
			System.out.println("Error = " + e);
		}
	}
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
