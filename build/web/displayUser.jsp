<%-- 
    Document   : DisplayUser
    Created on : 22-Oct-2015, 09:54:05
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="request" class="businessEntities.User"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display User</title>
    </head>
    <body>
        <h1>Hi <jsp:getProperty name="user" property="firstName"/> <jsp:getProperty name="user" property="surname"/></h1>
    </body>
</html>
