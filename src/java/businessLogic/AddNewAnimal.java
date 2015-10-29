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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asus
 */
@WebServlet(name = "AddNewAnimal", urlPatterns = {"/AddNewAnimal"})
public class AddNewAnimal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "";
        String tagNumber = request.getParameter("tagNumber");
        String breed = request.getParameter("breed");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String dtb = request.getParameter("dtb");
        String dbr = request.getParameter("dbr");
        String dmi = request.getParameter("dmi");
        double purchasePrice = Double.parseDouble(request.getParameter("purchasePrice"));
        double salePrice = Double.parseDouble(request.getParameter("salePrice"));
        int weight = Integer.parseInt(request.getParameter("weight"));
        
        Animal animal = new Animal(tagNumber, breed, gender, dmi, tagNumber, tagNumber, breed, purchasePrice, salePrice, weight);
        
        
        try{
            LivestockManagerDB.openConnection();
            LivestockManagerDB.addAnimalToDB(animal);
            LivestockManagerDB.closeConnection();
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
