/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.servlet;

import fr.esic.dao.CompteDao;
import fr.esic.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author marye
 */
@WebServlet(name = "DesactiverCarteCompte", urlPatterns = {"/DesactiverCarteCompte"})
public class DesactiverCarteCompte extends HttpServlet {

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
            out.println("<title>Servlet DesactiverCarteCompte</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DesactiverCarteCompte at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  HttpSession session=request.getSession(true);
  User user =(User) session.getAttribute("user");
                if (user != null) {
                    try {
                        if (user.getId()==2) {
                        int numcarte =Integer.parseInt(request.getParameter("numcarte")); 
                        CompteDao.DesactiverCompte(numcarte);
                        request.getRequestDispatcher("Conseiller").forward(request, response);
                            
                        }
                        else if (user.getId()==3)  {
                          int numcarte =Integer.parseInt(request.getParameter("numcarte")); 
                        CompteDao.DesactiverCompte(numcarte);
                        request.getRequestDispatcher("ClientHome").forward(request, response);
                            
                        }}
                    catch (SQLException ex) {
          Logger.getLogger(DesactiverCarteCompte.class.getName()).log(Level.SEVERE, null, ex);
      }}}
    

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    }
