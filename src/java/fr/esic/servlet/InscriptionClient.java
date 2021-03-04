
package fr.esic.servlet;

import fr.esic.dao.ClientDao;
import fr.esic.model.Client;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import static sun.security.jgss.GSSUtil.login;

@WebServlet(name = "InscriptionClient", urlPatterns = {"/InscriptionClient"})
public class InscriptionClient extends HttpServlet {

    public static final int taille_tampon=10240;//tampon pour copier les fichiers depuis le ficier tempor
    public static final String chemin="/Users/marye/fichiertemp/fichier/";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConnexionClient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConnexionClient at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                   this.getServletContext().getRequestDispatcher("/Connexion.jsp").forward(request, response);

       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String log = request.getParameter("login");
        String mdp = request.getParameter("password");
        String sexe=request.getParameter("sexe");
        String tel= request.getParameter("numtel");
        String date=request.getParameter("datenaissance");
        String email=request.getParameter("Email");
        String adresse=request.getParameter("adresse");
        
        
        /*
        String description = request.getParameter("description");
        request.setAttribute("description", description );
        
        Part part =request.getPart("fichier");
        
        String nomfichier = getNomFichier(part);
        
        if(nomfichier!=null && !nomfichier.isEmpty()){
        String nomchamp=part.getName();
        ecrireFichier(part,nomfichier,chemin);
        request.setAttribute(nomchamp,nomfichier);
        }
*/
       Client c = new Client (nom, prenom,tel,sexe,date,email,adresse);
      // Utilisateur u = new Utilisateur (log,mdp); 
       try {        
          //UtilisateurDao.insertUtilisateur(u);

            ClientDao.insertPerson(c);

            this.getServletContext().getRequestDispatcher("/Connexion.jsp").forward(request, response);

        } catch (Exception e) {

            PrintWriter out = response.getWriter();
            out.println("err" + e.getMessage());
        }
        

        
    }
    /*

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

   
    
     private void ecrireFichier( Part part, String nomFichier, String chemin ) throws IOException {
        BufferedInputStream entree = null;
        BufferedOutputStream sortie = null;
        try {
            entree = new BufferedInputStream(part.getInputStream(), taille_tampon);
            sortie = new BufferedOutputStream(new FileOutputStream(new File(chemin + nomFichier)), taille_tampon);

            byte[] tampon = new byte[taille_tampon];
            int longueur;
            while ((longueur = entree.read(tampon)) > 0) {
                sortie.write(tampon, 0, longueur);
            }
        } finally {
            try {
                sortie.close();
            } catch (IOException ignore) {
            }
            try {
                entree.close();
            } catch (IOException ignore) {
            }
        }
    }
    
    
    
    private static String getNomFichier(Part part)
    {
    for(String contentDisposition :part.getHeader("content-disposition").split(";"))
    {
    if (contentDisposition.trim().startsWith("fichier"))
    {
    return contentDisposition.substring(contentDisposition.indexOf('=') + 1).trim().replace( "\"", "" );
            }
        }
        return null;
    }   
*/
}

