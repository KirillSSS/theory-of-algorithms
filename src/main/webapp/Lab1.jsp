<%-- 
    Document   : Lab1
    Created on : Apr 4, 2021, 8:45:19 PM
    Author     : savch
--%>

<%@page import="kirill.knu.fit.ta.FirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Lab1</h1>
        
        <%! FirstJavaClass fjc = new FirstJavaClass(7);%>
        
        <%! 
            int x= fjc.getMyInt();
            
            int y = x * x; 
        %>
        
        <h1 align="center" style="color:#1E90FF"> <font size="10"> the square of <%=x%> is <%=y%> </font size></h1>
        
        <p align="center"><a href="index.jsp">Go back</a></p>
    </body>
</html>
