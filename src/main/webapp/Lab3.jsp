<%-- 
    Document   : Laba3
    Created on : Apr 15, 2021, 11:48:05 PM
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
        <h1 align="center">Lab3</h1>
        <h2 align="center">Option 17</h2>
        <h3 align="center">Fill the array with k integers. Determine how many negative numbers it starts with.</h3>
        <p align="center"> --------------------------------------------------------------------------------------- </p>
        
        <h1 align="center" style="color:#1E90FF"><%=request.getAttribute("output")%></h1>
        
        <h1 align="center" style="color:#1E90FF"> <font size="5"><%=request.getAttribute("cfn")%></font size></h1>
        
        <h1 align="center" style="color:#1E90FF"> <font size="5"><%=request.getAttribute("check")%></font size></h1>
        
        <div>
            <form align="center" action="FormForLab3.jsp">  
                <input type="submit" value="One more array">
            </form> 
        </div>
        
        <p align="center"><a href="index.jsp">Go back</a></p>
    </body>
</html>
