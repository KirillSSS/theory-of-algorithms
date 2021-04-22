<%-- 
    Document   : FormForLab2
    Created on : Apr 11, 2021, 1:43:52 PM
    Author     : savch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3 align="center">V(dx) / (ax^2 + bx + c)</h3>
        <h3 align="center">a = 2, b = -3, c = -6, d = 8</h3>
        
        <p align="center"> --------------------------------------------------------------------------------------- </p>
        
        <h1 align="center">Enter your x</h1>
        
        <div>
            <form align="center" method="post" action="lab2">
                <input type="text" name="x" placeholder="enter your x as ##.###"/>
                <input type="submit" value="ok"/>
            </form>
        </div>
    </body>
</html>
