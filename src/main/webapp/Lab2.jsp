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
        
        <%!
        
            float x = EquationForLab2.equation(1, 2, 3, 4);

        %>
        
        <h1 align="center"> <font size="10"> the result is <%=x%> </font size></h1>
        
        <p align="center"><a href="index.jsp">Go back</a></p>
    </body>
</html>
