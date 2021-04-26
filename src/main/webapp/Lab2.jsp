<%-- 
    Document   : Lab2
    Created on : Apr 9, 2021, 12:45:38 AM
    Author     : savch
--%>

<%@page import="kirill.knu.fit.ta.lab2.EquationForLab2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Lab2</h1>
        <h2 align="center">Option 17</h2>
        <h3 align="center">V(dx) / (ax^2 + bx + c)</h3>
        <h3 align="center">a = 2, b = -3, c = -6, d = 8</h3>
        <p align="center"> --------------------------------------------------------------------------------------- </p>
        
        
        <h1 align="center" style="color:#1E90FF"> <font size="10"><%=request.getAttribute("output")%></font size></h1>
        
        <div>
            <form align="center" action="FormForLab2.jsp">  
                <input type="submit" value="New x">
            </form> 
        </div>
        
        <p align="center"><a href="index.jsp">Go back</a></p>
    </body>
</html>
