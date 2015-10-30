<%-- 
    Document   : viewCattle
    Created on : 28-Oct-2015, 19:51:13
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page errorPage="error.jsp" %>
<%@page import="businessEntities.Animal"%>
<%@page import="java.util.ArrayList" %>
<jsp:useBean id="animals" scope="request" type="ArrayList<businessEntities.Animal>"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Livestock Manager Title</title>
        <link href="LMStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div id="wrapper">
        
        
  <div id="header">
    <h1>Livestock Manager</h1>
    <h2>Managing Your Beef Herd</h2>
    <ul>
      <li class="first"><a href="#" accesskey="1">Home</a></li>
      <li><a href="/LivestockManager/addAnimal.jsp" accesskey="2">Livestock</a></li>
      <li><a href="#" accesskey="3">Events</a></li>
      <li><a href="#" accesskey="3">Accounts</a></li>
    </ul>
  </div>
</div>
<div id="content">
  <div id="colOne">
        <table border="2">
            <h2>List of all animals</h2>
        
        <c:forEach items="${animals}" var="animal">
            <tr>
            <td><c:out value="${animal.tagNumber}"/></td>
            <td><c:out value="${animal.breed}"/></td>
            <td><c:out value="${animal.gender}"/></td>
            <td><c:out value="${animal.dateOfBirth}"/></td>
            <td><c:out value="${animal.dateLastTBTest}"/></td>
            <td><c:out value="${animal.dateLastBRTest}"/></td>
            <td><c:out value="${animal.dateMovedIn}"/></td>
            <td><c:out value="${animal.purchasePrice}"/></td>
            <td><c:out value="${animal.salePrice}"/></td>
        </tr>
        </c:forEach>
        </table>
  </div>
</div>
    </body>
</html>
