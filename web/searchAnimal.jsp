<%-- 
    Document   : searchAnimal
    Created on : 29-Oct-2015, 09:17:35
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="LMStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
    <h1>Livestock Manager</h1>
    <h2>Managing Your Beef Herd</h2>
    <ul>
      <li class="first"><a href="#" accesskey="1">Home</a></li>
      <li><a href="#" accesskey="2">Livestock</a></li>
      <li><a href="/LivestockManager/ViewAllAnimals" accesskey="3">View Animals</a></li>
      <li><a href="searchAnimal.jsp">Search for animal</a></li>
      <li><a href="#" accesskey="3">Accounts</a></li>
      <li><a href="#" accesskey="3">Veterinarian</a></li>
      <li><a href="#" accesskey="3">Dosing</a></li>
      <li><a href="#" accesskey="4">Contact</a></li>
    </ul>
  </div>
</div>
        <div id="content">
    <br>
    <h3>Search for animal</h3>
    <br>
        <br></br>
        Search for animal
        <form action="SearchAnimal" method="post">
            Tag Number:<input type ="text" name="tagNumber"/><br/><br/>
        </form>
        </div>
    </body>
</html>
