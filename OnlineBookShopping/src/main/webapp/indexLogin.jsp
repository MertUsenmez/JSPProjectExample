<%@page import="model.UserModel"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="UTF-8">
<title>Log in page</title>
</head>
<body>
<div>
   <%  UserModel user = (UserModel)request.getAttribute("UserModel");   %>
   
	<form name="Login" action="Login" method="post">
		<div>
			<div data-role="navbar" id="navbar-1">
				<ul>
					<li><a href="index.html">icon of website</a></li>
					<li><a href="#">null</a></li>
					<li><a href="#">null</a></li>
				</ul>
			</div>
		</div>
		<div align="center">
			<ul>
				<li>Username:</li>
				<li><input name="Username" value="<% user.getUsername(); %>" type="text" /></li>
			</ul>
			<ul>
				<li>Password:</li>
				<li><input name="Password" value="<% user.getPassword(); %>" type="password" /></li>
			</ul>
			<ul>
				<ul>
					<li>
						<div class="ui-input-btn ui-btn ui-corner-all">
							Login <input type="submit" value="Register" name="Register" />
						</div>
					</li>
				</ul>
		</div>

	</form>
 </div>

</body>
</html>