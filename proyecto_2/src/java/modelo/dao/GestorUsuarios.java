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
import modelo.Usuario;

/**
 *
 * @author Kike
 */
public class GestorUsuarios implements Serializable {

    public GestorUsuarios() {
        this.bd = BaseDatos.obtenerInstancia();
    }
    public static GestorUsuarios obtenerInstancia(){
        if(instancia==null)
            instancia=new GestorUsuarios();
        return instancia;
    }
    // <editor-fold defaultstate="collapsed" desc="métodos">
          public boolean CreateUser(Usuario newUser){
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.INSERT.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, newUser.getCedula());
                stm.setString(2, newUser.getNombre());
                stm.setString(3, newUser.getApellido());
                stm.setString(4, newUser.getDireccion());
                stm.setString(5, newUser.getTelefono());
                stm.setString(6, newUser.getPass());
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

    public List<Usuario> ReadUser() throws SQLException {
        List<Usuario> users = new ArrayList<>();
        try {
            Connection cnx = bd.obtenerConexion();
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(IMEC_Usuario.READ.obtenerComando());
            while (rs.next()) {
                Usuario register = new Usuario(
                        rs.getString("cedula"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("contraseña")
                );
                users.add(register);
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }

        return users;
    }

    public boolean updateUser(Usuario user){
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.UPDATE.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, user.getNombre());
                stm.setString(2, user.getApellido());
                stm.setString(3, user.getDireccion());
                stm.setString(4, user.getTelefono());
                stm.setString(5, user.getPass());
                stm.setString(6,user.getCedula());
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

    public boolean deleteUser(int id) throws SQLException {
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.DELETE.obtenerComando())) {
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

    public Usuario QueryUser(String id){

        Usuario user = null;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Usuario.QUERY.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, id);
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                    user = new Usuario(
                           rs.getString("cedula"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("contraseña"),
                        rs.getString("rol")
                    );
                }
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }

        return user;
    }

    // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="atributos BD">
    private static GestorUsuarios instancia = null;
    private BaseDatos bd = null;
    // </editor-fold>

}
