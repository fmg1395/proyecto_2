/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import modelo.Pizza;
import modelo.TipoPizza;

/**
 *
 * @author Kike
 */
public class GestorPizza implements Serializable {

    public GestorPizza() {
        this.bd = BaseDatos.obtenerInstancia();
    }

    public static GestorPizza obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorPizza();
        }
        return instancia;
    }

    // <editor-fold defaultstate="collapsed" desc="métodos">
    public boolean CreatePizza(Pizza newPizza) {
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Pizza.INSERT.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, newPizza.getNombre());
                stm.setString(2, newPizza.getDescripcion());
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

    public List<Pizza> ReadPizza() {
        List<Pizza> pizzas = new ArrayList<>();
        try {
            Connection cnx = bd.obtenerConexion();
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(IMEC_Pizza.READ.obtenerComando());
            while (rs.next()) {
                Pizza register = new Pizza(
                        rs.getInt("item_id"),
                        rs.getString("item_name"),
                        rs.getString("desc")
                );
                pizzas.add(register);
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }

        return pizzas;
    }

    public boolean updatePizza(Pizza newPizza, int id) throws SQLException {
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Pizza.UPDATE.obtenerComando())) {
                stm.clearParameters();
                stm.setString(1, newPizza.getNombre());
                stm.setString(2, newPizza.getDescripcion());
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

    public boolean deletePizza(int id) throws SQLException {
        this.deleteType(id);
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Pizza.DELETE.obtenerComando())) {
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

    public Pizza QueryPizza(int id) throws SQLException {
        Pizza pizza = null;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_Pizza.QUERY.obtenerComando())) {
                stm.clearParameters();
                stm.setInt(1, id);
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                    pizza = new Pizza(
                            rs.getInt("item_id"),
                            rs.getString("item_name"),
                            rs.getString("desc")
                    );
                }
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }

        return pizza;
    }

    public boolean CreatePizzaType(TipoPizza newType) throws SQLException {
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_TipoPizza.INSERT.obtenerComando())) {
                stm.clearParameters();
                stm.setInt(1, newType.getId());
                stm.setString(2, newType.getTam());
                stm.setFloat(3, newType.getPrecio());
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

    public List<TipoPizza> readType(int idPizza) {
        List<TipoPizza> tipoPizzas = new ArrayList<>();
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_TipoPizza.READ.obtenerComando())) {
                stm.clearParameters();
                stm.setInt(1, idPizza);
                ResultSet rs = stm.executeQuery();
                while (rs.next()) {
                    TipoPizza register = new TipoPizza(
                            rs.getInt("item_id"),
                            rs.getString("option_name"),
                            rs.getFloat("price")
                    );
                    tipoPizzas.add(register);
                }
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }

        return tipoPizzas;
    }

    public boolean updateType(TipoPizza newType, int id) throws SQLException {
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_TipoPizza.UPDATE.obtenerComando())) {
                stm.clearParameters();
                stm.setInt(1, newType.getId());
                stm.setString(2, newType.getTam());
                stm.setFloat(3, newType.getPrecio());
                stm.setInt(4, id);
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

    public boolean deleteType(int id) throws SQLException {
        boolean success = false;
        int updateRegisters = 0;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_TipoPizza.DELETE.obtenerComando())) {
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

    public TipoPizza QueryType(int id) throws SQLException {
        TipoPizza Type = null;
        try {
            Connection cnx = bd.obtenerConexion();
            try (PreparedStatement stm = cnx.prepareStatement(IMEC_TipoPizza.QUERY.obtenerComando())) {
                stm.clearParameters();
                stm.setInt(1, id);
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                    Type = new TipoPizza(
                            rs.getInt("item_id"),
                            rs.getString("option_name"),
                            rs.getFloat("price")
                    );
                }
            }
        } catch (SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        } finally {
            bd.cerrarConexion();
        }

        return Type;
    }
    //FALTA CRUD EXTRAS
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="atributos BD">
    private static GestorPizza instancia = null;
    private BaseDatos bd = null;
    // </editor-fold>
}
