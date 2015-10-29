<%-- 
    Document   : register
    Created on : 28-Oct-2015, 14:41:40
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
      <li><a href="#" accesskey="3">Events</a></li>
      <li><a href="#" accesskey="3">Accounts</a></li>
      <li><a href="#" accesskey="3">Veterinarian</a></li>
      <li><a href="#" accesskey="3">Dosing</a></li>
      <li><a href="#" accesskey="4">Contact</a></li>
    </ul>
  </div>
</div>
<div id="content">
    <br>
    <h3>Register Your Account</h3>
    <br>
            <form action="addNewUser" method="post">
                <label>First Name:</label><input type ="text" name="firstName"/><br/><br/>
                Surname:<input type ="text" name="surname"/><br/><br/>
                Address:<input type ="text" name="address"/><br/><br/>
                Herd Number:<input type ="text" name="herdNumber"/><br/><br/>
                PAC:<input type ="text" name="PAC"/><br/><br/>
                Username:<input type ="text" name="username"/><br/><br/>
                Password:<input type ="text" name="password"/><br/><br/>
                <input type="submit" value="Submit"/>
            </form>
</div>
        </div>
    </body>
</html>
