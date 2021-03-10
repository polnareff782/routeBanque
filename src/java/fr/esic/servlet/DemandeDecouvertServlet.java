/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.servlet;

import fr.esic.dao.CompteDao;
import fr.esic.model.Compte;
import fr.esic.model.Person;
import fr.esic.model.User;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "DemandeDecouvertServlet", urlPatterns = {"/DemandeDecouvertServlet"})
public class DemandeDecouvertServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DemandeDecouvertServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DemandeDecouvertServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        HttpSession session = request.getSession(true);
        User user = (User) session.getAttribute("user");
        Person person = user.getPerson();

        if (user != null) {

            try {

                Compte comptes = CompteDao.getAllCompte(person);

                request.setAttribute("comptes", comptes);

                this.getServletContext().getRequestDispatcher("/WEB-INF/MesCartes.jsp").forward(request, response);

            } catch (Exception e) {
                PrintWriter out = response.getWriter();
                out.println("exception :" + e.getMessage());
            }
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        User user = (User) session.getAttribute("user");
        Person person = user.getPerson();

        if (user != null) {

            try {
                int montantDecouvert = Integer.parseInt(request.getParameter("montant"));
                int numcarte = Integer.parseInt(request.getParameter("numcarte"));
                CompteDao.demandedecouvert(montantDecouvert, numcarte);
                response.sendRedirect("MesCartes");

            } catch (Exception e) {
                PrintWriter out = response.getWriter();
                out.println("expt :" + e.getMessage());
            }
        }  
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
