<%-- 
    Document   : Lab8
    Created on : 27.05.2021, 20:17:04
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
        <h1 align="center">Lab8</h1>
        <h3 align="center">Methods for finding a number in an array</h3>
        
        <h2 align="center">Your sorted array:</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("array")%></h2>
        
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
                
        <h2 align="center">LinearSearch for <%=request.getAttribute("n")%></h2>
        <h2 align="center" style="color:#1E90FF">Result: <%=request.getAttribute("lS")%></h2>
        <h2 align="center" style="color:#1E90FF">Time: <%=request.getAttribute("lSTime")%></h2>
        <h2 align="center" style="color:#1E90FF">Complexity: O(N)</h2>
        
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
                
        <h2 align="center">BinarySearch for <%=request.getAttribute("n")%></h2>
        <h2 align="center" style="color:#1E90FF">Result: <%=request.getAttribute("bS")%></h2>
        <h2 align="center" style="color:#1E90FF">Time: <%=request.getAttribute("bSTime")%></h2>
        <h2 align="center" style="color:#1E90FF">Complexity: O(log (N)) </h2>
        
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
                
        <h2 align="center">ExponentialSearch for <%=request.getAttribute("n")%></h2>
        <h2 align="center" style="color:#1E90FF">Result: <%=request.getAttribute("eS")%></h2>
        <h2 align="center" style="color:#1E90FF">Time: <%=request.getAttribute("eSTime")%></h2>
        <h2 align="center" style="color:#1E90FF">Complexity: O(log (N)) </h2>
        
        <div>
            <form align="center" action="FormForLab8.jsp">  
                <input type="submit" value="One more time">
            </form> 
        </div>
        
        <p align="center"><a href="index.jsp">Go back</a></p>
    </body>
</html>
