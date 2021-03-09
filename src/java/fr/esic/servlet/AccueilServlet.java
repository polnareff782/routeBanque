/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.servlet;

import fr.esic.dao.ConseillerDao;
import fr.esic.dao.UserDao;
import fr.esic.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nathan Ghozlan
 */
@WebServlet(name = "AccueilServlet", urlPatterns = {"/AccueilServlet"})
public class AccueilServlet extends HttpServlet {

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
            out.println("<title>Servlet AccueilServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AccueilServlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);

        HttpSession session = request.getSession(true);
        User user = (User) session.getAttribute("user");
        if (user != null) {
            try {
                List<User> users = UserDao.getAll();
                request.setAttribute("users", users);
                switch (user.getRole().getId()) {
                    case 1:
                        this.getServletContext().getRequestDispatcher("/WEB-INF/homeAdmin.jsp").forward(request, response);
                        break;
                    case 2:
                        this.getServletContext().getRequestDispatcher("/WEB-INF/homeConseiller.jsp").forward(request, response);
                        break;
                    case 3:
                        this.getServletContext().getRequestDispatcher("/WEB-INF/homeClient.jsp").forward(request, response);
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                PrintWriter out = response.getWriter();
                out.println("expt :" + e.getMessage());
            }

        } else {
            request.setAttribute("msg", "tu n'es pas connecter");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        String id = request.getParameter("id");
        int idu = Integer.parseInt(id);
        System.out.println("id: " + id);

        try {

            User u = UserDao.getUserById(idu);

            if (u != null) {
                request.getSession(true).setAttribute("user", u);
                // remettre en menuAdmin
                //this.getServletContext().getRequestDispatcher("/WEB-INF/menuAdmin.jsp").forward(request, response);

                switch (u.getRole().getId()) {
                    case 1:
                        this.getServletContext().getRequestDispatcher("/WEB-INF/homeAdmin.jsp").forward(request, response);
                        break;
                    case 2:
                        this.getServletContext().getRequestDispatcher("/WEB-INF/homeConseiller.jsp").forward(request, response);
                        break;
                    case 3:
                        this.getServletContext().getRequestDispatcher("/WEB-INF/homeClient.jsp").forward(request, response);
                        break;
                    default:
                        break;
                }

                //response.sendRedirect("memos");
            } else {
                request.setAttribute("msg", "identifiants incorrects!!");
                this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            }

        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("err" + e.getMessage());

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
