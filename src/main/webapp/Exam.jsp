<%-- 
    Document   : Exam
    Created on : 18.06.2021, 12:34:17
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
        <h1 align="center">Exam</h1>
        <h2 align="center">Option 17</h2>
        <h3 align="center">Task</h3>
        
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
                
        <h2 align="center">Equation results:</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("eq")%></h2>
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
        
        <h2 align="center">Sorted random list:</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("sort")%></h2>
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
        
        <h2 align="center">Search result:</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("search")%></h2>
        
        <div>
            <form align="center" action="FormForExam.jsp">  
                <input type="submit" value="One more time">
            </form> 
        </div>
        
        <p align="center"><a href="index.jsp">Go back</a></p>
    </body>
</html>
