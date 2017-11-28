<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add book</title>
</head>
<body>

<form name="Registration" action="Registration" method="post">
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
				<li>BookName:</li>
				<li><input name="BookName" value="" type="text" /></li>
			</ul>
			<ul>
				<li>Publisher:</li>
				<li><input name="Publisher" value="" type="text" /></li>
			</ul>
			<ul>
				<li>Author:</li>
				<li><input name="Author" value="" type="text" /></li>
			</ul>
			<ul>
				<li>Cathegory:</li>
				<li><input name="Cathegory" value="" type="text" /></li>
			</ul>
			<ul>
				<li>Date Of Issue:</li>
				<li><input name="DateOfIssue" value="" type="text" /></li>
			</ul>
			<ul>
				<li>Written Language:</li>
				<li><input name="WrittenLanguage" value="" type="text" /></li>
			</ul>
			<ul>
				<li>Page Number:</li>
				<li><textarea name="PageNumber" rows="5" cols="20"></textarea></li>
			</ul>
			<ul>
			<ul>
				<li>Price:</li>
				<li><input name="Price" value="" type="text" /></li>
			</ul>
			<ul>
				<li>Stock:</li>
				<li><input name="Stock" value="" type="" /></li>
			</ul>
				<li>
					<div class="ui-input-btn ui-btn ui-corner-all">
						Add this book: <input type="submit" value="Register" name="Register" />
					</div>
				</li>
			</ul>

		</div>
	</form>

</body>
</html>