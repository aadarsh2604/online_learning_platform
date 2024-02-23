<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="style.css">
<!-- <script src="https://cdn.jsdelivr.net/npm/@supabase/supabase-js@2"></script>
<script src="supabase.js" type="module"></script> -->
</head>
<body>
	<div class="form-group">
    <form action="LoginServlet" method="post">
        <h1>Login</h1>
        <input class="username-input" type="text" id="username" name="username" placeholder="username">
        <input class="password-input" type="text" id="password" name="password" placeholder="password">
        <button type="submit" id="register">Register</button>
    </form>
    </div>
</body>
</html>