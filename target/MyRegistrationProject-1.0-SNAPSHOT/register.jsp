<%-- 
    Document   : register
    Created on : Jun 27, 2019, 7:21:30 AM
    Author     : Sanduni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="loginRegister" method="post">
            <table style="background-color: lightgreen; margin-left:20px;margin-left:20px;">
                <tr>
                    <td><h3 style="color: black;">Login Page</h3></td>  
                 <td></td>  
                    </tr>
                <tr>
                    <td>First Name :</td><td><input type="text" name="firstname"></td>
                </tr>
                <tr>
                    <td>Last Name :</td><td><input type="text" name="lastname"></td>
                </tr>
                <tr>
                    <td>Address :</td><td><input type="text" name="address"></td>
                </tr>
                <tr>
                    <td>NIC :</td><td><input type="text" name="nic"></td>
                </tr>
                <tr>
                    <td>Gender :</td><td><input type="text" name="gender"></td>
                </tr>
                <tr>
                    <td>Email :</td><td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>Phone No :</td><td><input type="text" name="phoneno"></td>
                </tr>
                <tr>
                    <td>UserName :</td><td><input type="text" name="username"></td>
                </tr>
                <tr>
                
                    <td>Password :</td><td><input type="password" name="password1"></td>
                </tr>
                <tr>
                    <td>Re-Type Password :</td><td><input type="password" name="password2"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="register"></td><td></td>
                </tr>
                
                
            </table> 
            
            
            
            
        </form>
        
    </body>
</html>
