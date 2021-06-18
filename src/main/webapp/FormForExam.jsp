<%-- 
    Document   : FormForExam
    Created on : 18.06.2021, 12:34:43
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
        <h3 align="center">Task</h3>
        <h3 align="center">a = 5, b = 6</h3>
        
        <p align="center"> --------------------------------------------------------------------------------------- </p>
        
        <div>
            <form align="center" method="post" action="exam">
                <h2 align="center">Enter the length og the list</h2>
                <input type="text" name="l" placeholder="length"/>
                <h2 align="center">Enter "21" to sort from largest to smallest, and "12" to sort from smallest to largest</h2>
                <input type="text" name="sort" placeholder="sort"/>
                <h2 align="center">Enter the number you are going to search</h2>
                <input type="text" name="s" placeholder="search"/>
                <p> <p>
                <input type="submit" value="ok"/>
            </form>
        </div>
    </body>
</html>
