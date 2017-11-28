package model;

import java.sql.*;

public class BookModel {
	
	private int BookID;
	private String BookName;
	private String Publisher;
	private String Author;
	private String Cathegory;
	private Date DateOfIssue;
	private String WrittenLanguage;
	private int PageNumber;
	private double Price;
	private int Stock;
	
	
	public BookModel(String bookName, String publisher, String author, String cathegory, Date dateOfIssue,
			String writtenLanguage, int pageNumber, double price, int stock) 
	{	
		BookName = bookName;
		Publisher = publisher;
		Author = author;
		Cathegory = cathegory;
		DateOfIssue = dateOfIssue;
		WrittenLanguage = writtenLanguage;
		PageNumber = pageNumber;
		Price = price;
		Stock = stock;
	}


	public int getBookID() {
		return BookID;
	}


	public void setBookID(int bookID) {
		BookID = bookID;
	}


	public String getBookName() {
		return BookName;
	}


	public void setBookName(String bookName) {
		BookName = bookName;
	}


	public String getPublisher() {
		return Publisher;
	}


	public void setPublisher(String publisher) {
		Publisher = publisher;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	public String getCathegory() {
		return Cathegory;
	}


	public void setCathegory(String cathegory) {
		Cathegory = cathegory;
	}


	public Date getDateOfIssue() {
		return DateOfIssue;
	}


	public void setDateOfIssue(Date dateOfIssue) {
		DateOfIssue = dateOfIssue;
	}


	public String getWrittenLanguage() {
		return WrittenLanguage;
	}


	public void setWrittenLanguage(String writtenLanguage) {
		WrittenLanguage = writtenLanguage;
	}


	public int getPageNumber() {
		return PageNumber;
	}


	public void setPageNumber(int pageNumber) {
		PageNumber = pageNumber;
	}


	public double getPrice() {
		return Price;
	}


	public void setPrice(double price) {
		Price = price;
	}


	public int getStock() {
		return Stock;
	}


	public void setStock(int stock) {
		Stock = stock;
	}
	
	public int InsertBook()
	{
		Connection con = null;
		PreparedStatement ps;
		int a = 0;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc:sqlserver://localhost:1433; databaseName=BookShopping; integratedSecurity=true;";
			ps = con.prepareStatement("INSERT INTO Books VALUES(?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, BookID);
			ps.setString(2, BookName);
			ps.setString(3, Publisher);
			ps.setString(4, Author);
			ps.setString(5, Cathegory);
			ps.setDate(6, DateOfIssue);
			ps.setString(7, WrittenLanguage);
			ps.setInt(8, PageNumber);
			ps.setDouble(9, Price);
			ps.setInt(10, Stock);
			
			a = ps.executeUpdate();
			
			return a;
			
		}
		catch(Exception e)
		{
			a = 1;
		}
		
		return a;
	}
	public int DeleteBook()
	{
		Connection con = null;
		PreparedStatement ps;
		int a = 0;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc:sqlserver://localhost:1433; databaseName=BookShopping; integratedSecurity=true;";
			ps=con.prepareStatement("DELETE FROM School WHERE BookID=?");
			//ps.setString(1, BookID.getText());
		}
		catch(Exception e)
		{
			
		}
		
		return a;
	}
	
	

}
