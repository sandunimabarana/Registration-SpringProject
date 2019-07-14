<%-- 
    Document   : login
    Created on : Jun 27, 2019, 6:58:05 AM
    Author     : Sanduni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="loginRegister">
            <table style="background-color: skyblue; margin-left:20px;margin-left:20px;">
                <tr>
                    <td><h3 style="color: black;">Registration Page</h3></td>  
                 <td></td>  
                    </tr>
                <tr>
                    <td>UserName</td><td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password</td><td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="login"></td><td><a href="register.jsp">Registration</a></td>
                </tr>
                
                
            </table> 
         
        </form>
        
    </body>
</html>
