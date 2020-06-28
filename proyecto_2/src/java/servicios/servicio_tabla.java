/*<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>*/
package servicios;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Pizza;
import modelo.TipoPizza;
import modelo.dao.GestorPizza;

@WebServlet(name = "servicio_tabla", urlPatterns = {"/servicio_tabla"})
@MultipartConfig
public class servicio_tabla extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            GestorPizza gestor_pizza = new GestorPizza();
            JsonArray array_pizza = new JsonArray();
            JsonObject salida = new JsonObject();

            List<Pizza> lista_pizza = gestor_pizza.ReadPizza();

            for (int i = 0; i < lista_pizza.size(); i++) {
                JsonObject pizza = new JsonObject();
                pizza.addProperty("nombre", lista_pizza.get(i).getNombre());
                pizza.addProperty("descripcion", lista_pizza.get(i).getDescripcion());

                JsonArray array_tipos = new JsonArray();

                List<TipoPizza> tipos = gestor_pizza.readType(lista_pizza.get(i).getId());
                
                for(int j=0;j<tipos.size();j++)
                {
                    JsonObject tipo = new JsonObject();
                    tipo.addProperty("tamano", tipos.get(j).getTam());
                    tipo.addProperty("precio", tipos.get(j).getPrecio());
                    array_tipos.add(tipo);
                }
                pizza.add("tipos", array_tipos);
                array_pizza.add(pizza);
            }
            salida.add("lista", array_pizza);

            out.println(salida);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
