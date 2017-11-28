package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * Servlet implementation class ErrorPage
 */
public class ErrorPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
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
			List errors = (List) request.getAttribute("Errors");
			out.println("<font-color='red'>");
			Iterator items = (Iterator) errors.iterator();
			//out.println("<h1>Servlet Error Page at " + request.getContextPath() + "</h1>");
			
			out.println("<OL>");
			
			while(((java.util.Iterator) items).hasNext())
			{
				//out.println("<LI>" + items.next() + "</LI>");
			}
						
			out.println("</OL>");	
			out.println("</font>");
			out.println("</body></html>");
			
		}
		catch(Exception e)
		{
			System.out.println("Error = " + e);
		}
	}
	
	
	
    public ErrorPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

}
