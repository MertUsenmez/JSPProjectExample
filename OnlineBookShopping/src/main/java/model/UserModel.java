package model;

import java.sql.*;

public class UserModel {
	
	private String UserID;
	private String FirstName;
	private String Surname;
	private String Username;
	private String Password;
	private String EMail;
	private String Address;
	
		
	public UserModel(String UserID, String firstName, String surname, String username, String password, String eMail, String address)
	{
		this.UserID = UserID;
		FirstName = firstName;
		Surname = surname;
		Username = username;
		Password = password;
		EMail = eMail;
		Address = address;
	}
	
	
	public UserModel(String firstName, String surname, String username, String password, String eMail, String address) {
		super();
		FirstName = firstName;
		Surname = surname;
		Username = username;
		Password = password;
		EMail = eMail;
		Address = address;
	}


	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getSurname() {
		return Surname;
	}
	
	public void setSurname(String surname) {
		Surname = surname;
	}
	
	public String getUsername() {
		return Username;
	}
	
	public void setUsername(String username) {
		Username = username;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getEMail() {
		return EMail;
	}
	
	public void setEMail(String eMail) {
		EMail = eMail;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	
	public int InsertUser()
	{
		Connection con = null;
		PreparedStatement ps;
		int a = 0;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc:sqlserver://localhost:1433; databaseName=BookShopping; integratedSecurity=true;";
			ps = con.prepareStatement("INSERT INTO Users VALUES(?,?,?,?,?,?,?)");
			ps.setString(1, UserID);
			ps.setString(2, FirstName);
			ps.setString(3, Surname);
			ps.setString(4, Username);
			ps.setString(5, Password);
			ps.setString(6, EMail);
			ps.setString(7, Address);
			
			a = ps.executeUpdate();
			
			return a;			
		}
		catch(Exception e)
		{
			a = 1;
		}
		
		return a;
	}
	

}
