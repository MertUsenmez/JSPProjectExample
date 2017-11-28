package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserModel;

public class RegistrationValidationController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public RegistrationValidationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		

		PrintWriter writer = response.getWriter();

		String firstName = request.getParameter("FirstName");
		String surname = request.getParameter("Surname");
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		String confirmPassword = request.getParameter("ConfirmPassword");
		String eMail = request.getParameter("EMail");
		String address = request.getParameter("Address");

		List eList = new LinkedList();

		if (firstName.length() == 0) {
			eList.add("Enter your firstname.");
		}
		if (surname.length() == 0) {
			eList.add("Enter your surname.");
		}
		if (username.length() == 0) {
			eList.add("Enter a username.");
		}
		if (password.length() < 6) {
			eList.add("Enter a password longer than 6 characters.");
		}
		if (confirmPassword.length() == 0) {
			eList.add("Validation your entered password.");
		}
		if(password.compareTo(confirmPassword) != 0)
		{
			eList.add("Password do not matching with confirm password.");
		}
		if (eMail.length() == 0) {
			eList.add("Enter a Mail Address.");
		}
		if (address.length() <= 5) {
			eList.add("Enter a address.");
		}
		
		request.setAttribute("Errors", eList);
		
		if(!eList.isEmpty())
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Error.view");
			dispatcher.forward(request, response);			
			return;
		}
		
		UserModel userModel = new UserModel(firstName, surname, username, password, eMail, address);
		request.setAttribute("UserModel", userModel);
		int u = userModel.InsertUser();
		
		if(u > 0)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Home.view");
			dispatcher.forward(request, response);			
			return;
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Error.view");
			dispatcher.forward(request, response);			
			return;
		}
	}

}
