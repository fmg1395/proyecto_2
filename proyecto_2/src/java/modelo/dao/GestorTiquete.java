/*<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>
*/
package modelo.dao;

import datos.BaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kike
 */
public class GestorTiquete {
     public GestorTiquete() {
        this.bd = BaseDatos.obtenerInstancia();
    }
      public static GestorTiquete obtenerInstancia(){
        if(instancia==null)
            instancia=new GestorTiquete();
        return instancia;
    }
    // <editor-fold defaultstate="collapsed" desc="métodos">
          public boolean CreateTicket(String pal){
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Ticket.INSERT.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, pal);
                updateRegisters = stm.executeUpdate();
                success = updateRegisters == 1;
            }

        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }
        return success;
    }
          // <editor-fold defaultstate="collapsed" desc="atributos BD">
    private static GestorTiquete instancia = null;
    private BaseDatos bd = null;
    // </editor-fold>

}
