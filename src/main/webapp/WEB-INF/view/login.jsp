<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div>
        <div>
            <h1>Login Page</h1>
            <form action="home" method="post">
             <input type="text" name="username" />
              <input value="Login" type="submit">
            </form>
             ${message}
         
        </div>
    </div>
</body>
</html>