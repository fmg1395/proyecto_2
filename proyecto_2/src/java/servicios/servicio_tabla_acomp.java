/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Extras;
import modelo.Pizza;
import modelo.TipoPizza;
import modelo.dao.GestorExtras;
import modelo.dao.GestorPizza;

/**
 *
 * @author Kike
 */
public class servicio_tabla_acomp {
  @WebServlet(name = "servicio_tabla_acomp", urlPatterns = {"/servicio_tabla_acomp"})
@MultipartConfig
public class servicio_tabla extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            GestorExtras gestor_extras = new GestorExtras();
            JsonArray array_extras = new JsonArray();
            JsonObject salida = new JsonObject();

            List<Extras> lista_extras = gestor_extras.ReadExtras();

            for (int i = 0; i < lista_extras.size(); i++) {
                JsonObject extra = new JsonObject();
                extra.addProperty("nombre", lista_extras.get(i).getNombre());
                 extra.addProperty("precio", lista_extras.get(i).getPrecio());

                 array_extras.add(extra);
            }
            salida.add("lista", array_extras);

            out.println(salida);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servicio_tabla_acomp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servicio_tabla_acomp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
  
}
