/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import businessEntities.User;
import data.LivestockManagerDB;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
@WebServlet(name = "addNewUser", urlPatterns = {"/addNewUser"})
public class addNewUser extends HttpServlet{
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String url;
        String firstname = request.getParameter("firstName");
        String surname = request.getParameter("surname");
        String address = request.getParameter("address");
        String herdNumber = request.getParameter("herdNumber");
        String PAC =  request.getParameter("PAC");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = new User(firstname, surname, address, herdNumber, PAC, username, password);
        
        try{
            LivestockManagerDB.openConnection();
            int status = LivestockManagerDB.addUserToDB(user);
            
        }catch (SQLException sqlx) {
            System.out.println(sqlx);
             url = "/error.jsp";
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe);
            url = "/error.jsp";
        }catch (NullPointerException npe) {
            System.out.println(npe);
            url = "/error.jsp";
        }
        request.setAttribute("user", user);
        String url1 = "/displayUser.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url1);
        dispatcher.forward(request, response);
    }
}
