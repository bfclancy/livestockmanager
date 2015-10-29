<%-- 
    Document   : addAnimal
    Created on : 27-Oct-2015, 13:18:09
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
    <head>
        <title>Add New Animal</title>
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
      <li><a href="/LivestockManager/searchAnimal.jsp">Search for animal</a></li>
      <li><a href="#" accesskey="3">Accounts</a></li>
      <li><a href="#" accesskey="3">Veterinarian</a></li>
      <li><a href="#" accesskey="3">Dosing</a></li>
      <li><a href="#" accesskey="4">Contact</a></li>
    </ul>
  </div>
</div>
<div id="content">
    <br>
    <h3>Add a new animal</h3>
    <br>
        Add a new animal
        <br></br>
        Enter new animal details
        <form action="AddNewAnimal" method="post">
            Tag Number:<input type ="text" name="tagNumber"/><br/><br/>
            Breed:<input type ="text" name="breed"/><br/><br/>
            Gender:<input type ="text" name="gender"/><br/><br/>
            Date of Birth:<input type ="text" name="dob"/><br/><br/>
            Date last TB test:<input type ="text" name="dtb"/><br/><br/>
            Date last BR test:<input type ="text" name="dbr"/><br/><br/>
            Date moved in:<input type ="text" name="dmi"/><br/><br/>
            Purchase price:<input type="number" name ="purchasePrice"/><br/><br/>
            Sale price:<input type="number" name="salePrice"/><br/><br/>
            Weight:<input type="number" name="weight"/><br/><br/>
            <input type="submit" value="Submit"/>
        </form>
        </div>
    </body>
</html>


