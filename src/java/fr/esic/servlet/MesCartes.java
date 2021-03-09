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
 * @author marye  HttpSession session = request.getSession(true);
        User user = (User) session.getAttribute("user");
 */
@WebServlet(name = "MesCartes", urlPatterns = {"/MesCartes"})
public class MesCartes extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MesCartes</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MesCartes at " + request.getContextPath() + "</h1>");
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
                out.println("expt :" + e.getMessage());
            }
        }

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

        HttpSession session = request.getSession(true);
        User user = (User) session.getAttribute("user");
        Person person = user.getPerson();

        if (user != null) {

            try {
                int idcarte = Integer.parseInt(request.getParameter("numcarte"));
                Compte comptes = CompteDao.getAllCompte(person);
                int solde = Integer.parseInt(comptes.getSolde());
                int montantDecouvert = comptes.getMontantDecouvert();
                
                int solde_total=solde+=montantDecouvert;
                request.setAttribute("solde_total", solde_total);

                
                String etat = String.valueOf(comptes.isEtatcarte());
                request.setAttribute("etat", etat);
                String opposition = String.valueOf(comptes.isOpposition());
                request.setAttribute("opposition", opposition);
                
                if (opposition.equals("true")) {
                    CompteDao.OppositionCarte(idcarte);
                } 
                
                
                else if (etat.equals("false")) {
                    CompteDao.ActiveCarte(idcarte);
                } else {
                    CompteDao.DesactiverCarte(idcarte);
                }

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
    }// </editor-fold>

}
