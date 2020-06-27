package servicios;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.dao.GestorUsuarios;

@WebServlet(name = "servicio_pass", urlPatterns = {"/servicio_pass"})
@MultipartConfig
public class servicio_pass extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            GestorUsuarios gestor = new GestorUsuarios();
            JsonObject r = new JsonObject();
            Enumeration<String> p = request.getParameterNames();
            String n = p.nextElement();

            Usuario usr = new Gson().fromJson(request.getParameter(n), Usuario.class);
            String pass = usr.getPass();
            usr = gestor.QueryUser(usr.getCedula());
            usr.setPass(pass);

            boolean update = gestor.updateUser(usr);

            if (update) {
                r.addProperty("respuesta", "inicio.jsp");
                out.println(r.toString());
            } else {
                r.addProperty("respuesta", "cambio_pass.jsp");
                out.println(r.toString());
            }

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
