<%-- 
    Document   : Lab6-7
    Created on : 23.05.2021, 21:05:31
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
        <h1 align="center">Lab6</h1>
        <h2 align="center">Option 17</h2>
        <h3 align="center">Complete the task using recursion and build a binary tree</h3>
        
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
                
        <h2 align="center">Search <%=request.getAttribute("l6n")%> numbers of arithmetic progression <%=request.getAttribute("l6array")%></h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("lab6")%></h2>
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
        
        <h1 align="center">Lab7</h1>
        <h1 align="center">[3, 6, 11, 10, 7, 8, 1, 2]</h1>
        
        <h2 align="center"> the order of adding numbers to the tree</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("lab7ind")%></h2>
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>

        
        <h2 align="center"> Is <%=request.getAttribute("n1")%> in this tree?</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("lab7n1")%></h2>
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
        
        <h2 align="center"> Is <%=request.getAttribute("n2")%> in this tree?</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("lab7n2")%></h2>
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
        
        <h2 align="center"> traverseInOrder</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("lab7sort")%></h2>
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
        
        <h2 align="center">traversePreOrder</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("lab7pre")%></h2>
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
        
        <h2 align="center">traversePostOrder</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("lab7post")%></h2>
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>
        
        <h2 align="center">traverseLevelOrder</h2>
        <h2 align="center" style="color:#1E90FF"><%=request.getAttribute("lab7lev")%></h2>
        
        <div>
            <form align="center" action="FormForLab6-7.jsp">  
                <input type="submit" value="One more time">
            </form> 
        </div>
        
        <p align="center"><a href="index.jsp">Go back</a></p>
    </body>
</html>
