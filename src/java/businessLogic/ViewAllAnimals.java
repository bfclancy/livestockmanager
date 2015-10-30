/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import businessEntities.Animal;
import data.LivestockManagerDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author asus
 */
@WebServlet(name = "ViewAllAnimals", urlPatterns = {"/ViewAllAnimals"})
public class ViewAllAnimals extends HttpServlet {

    String url = "viewCattle.jsp";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        
        JSONObject json = new JSONObject();
        
        ArrayList<Animal> animals = new ArrayList<>();
        
//        try {
//            //LivestockManagerDB.openConnection();
//            //animals = LivestockManagerDB.getAllAnimals();
//            //json.put("animals", new JSONArray(animals));
//            //LivestockManagerDB.closeConnection();
//            url = "/viewCattle.jsp";
//            
//        }catch (SQLException sqlx) {
//            System.out.println(sqlx);
//             url = "/error.jsp";
//        } catch (ClassNotFoundException cnfe) {
//            System.out.println(cnfe);
//            url = "/error.jsp";
//        }catch (NullPointerException npe) {
//            System.out.println(npe);
//            url = "/error.jsp";
//        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        request.setAttribute("animals", animals);
        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
