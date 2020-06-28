/*<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>*/
package modelo.dao;

import datos.BaseDatos;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Extras;

/**
 *
 * @author Kike
 */
public class GestorExtras implements Serializable{
    
    public GestorExtras() {
        this.bd = BaseDatos.obtenerInstancia();
    }
    public static GestorExtras obtenerInstancia(){
        if(instancia==null)
            instancia=new GestorExtras();
        return instancia;
    }
    // <editor-fold defaultstate="collapsed" desc="métodos">
          public boolean CreateExtra(Extras newExtra) throws SQLException {
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Extras.INSERT.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, newExtra.getNombre());
                stm.setFloat(2, newExtra.getPrecio());
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

    public List<Extras> ReadExtras() throws SQLException {
        List<Extras> extras = new ArrayList<>();
        try {
            Connection cnx = bd.obtenerConexion();
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(IMEC_Extras.READ.obtenerComando());
            while (rs.next()) {
                Extras register = new Extras(
                        rs.getString("name"),
                        rs.getFloat("cost")
                );
                extras.add(register);
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }

        return extras;
    }

    public boolean updateExtra(Extras act, int id) throws SQLException {
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Extras.UPDATE.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, act.getNombre());
                stm.setFloat(2, act.getPrecio());
                stm.setInt(3, id);
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

    public boolean deleteExtra(int id) throws SQLException {
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Extras.DELETE.obtenerComando())) {
                stm.clearParameters();
                stm.setInt(1, id);
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

    public Extras QueryUser(int id) throws SQLException {
        Extras register = null;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Extras.QUERY.obtenerComando())) {
                stm.clearParameters();
                stm.setInt(1, id);
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                   register = new Extras(
                        rs.getString("name"),
                        rs.getFloat("cost")
                );
                }
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }

        return register;
    }

    // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="atributos BD">
    private static GestorExtras instancia = null;
    private BaseDatos bd = null;
    // </editor-fold>

}
