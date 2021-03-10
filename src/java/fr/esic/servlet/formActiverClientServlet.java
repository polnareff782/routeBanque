/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.servlet;

import fr.esic.dao.PersonDao;
import fr.esic.dao.UserDao;
import fr.esic.model.Person;
import fr.esic.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dylan55
 */
@WebServlet(name = "formActiverClientServlet", urlPatterns = {"/formActiverClient"})
public class formActiverClientServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet formActiverClientServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet formActiverClientServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
String userId = request.getParameter("userId");
        int idU = Integer.parseInt(userId);
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        String login = request.getParameter("login");
        String password = request.getParameter("mdp");

        String statut = request.getParameter("statut");
        System.out.println("stat: " + statut);
        int stat = Integer.parseInt(statut);

        Person p = new Person(nom, prenom);
        try {
            

            PersonDao.UpdatePerson(p);

            Person pe = PersonDao.getPersonByNom(nom);
            //System.out.println("person: " + pe);

            User c = new User(login, password, pe, stat);
            c.setId(idU);
            UserDao.changerStatutConseiller(c);

          

            request.getRequestDispatcher("AccueilServlet").forward(request, response);
        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("Exception :" + e.getMessage());
        }    }

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
