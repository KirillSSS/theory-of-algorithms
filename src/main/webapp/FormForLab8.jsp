<%-- 
    Document   : FormForLab8
    Created on : 27.05.2021, 20:17:40
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
        <h2 align="center">Methods for finding a number in an array</h2>
                
        <p align="center"> ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- </p>

        
        <div>
            <form align="center" method="post" action="lab8">
                <h1 align="center">Lab8</h1>
                <h2 align="center">Enter the array(only numbers without punctuation marks and separated by a space (like "2 5 8")) or write "random", if you want a random length array with numbers from -100 to 100</h2>
                <input type="text" name="array" placeholder="only numbers without punctuation marks and separated by a space (like "2 5 8")"/>
                
                <h2 align="center">Enter the number to search in this array</h2>
                <input type="text" name="n" placeholder="like 15"/>
                <input type="submit" value="ok"/>
            </form>
        </div>
    </body>
</html>
