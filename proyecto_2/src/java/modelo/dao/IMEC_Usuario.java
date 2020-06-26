/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

/**
 *
 * @author Kike
 */
public enum IMEC_Usuario {
     INSERT("INSERT INTO `pizzeria`.`usuario`(`cedula`,`nombre`,`apellido`,"
             + "`direccion`,`telefono`,`contraseña`) values(?,?,?,?,?,?);"),
    READ("SELECT * from `pizzeria`.`usuario`;"),
    UPDATE("UPDATE `pizzeria`.`usuario` SET `contraseña`=? where `cedula`=?;"),
    DELETE("DELETE FROM `pizzeria`.`usuario` where `cedula`=?;"),
    QUERY("SELECT * from `pizzeria`.`usuario` where `cedula`=?;");
IMEC_Usuario(String comando)
{
    this.comando=comando;
}
public String obtenerComando(){
    return comando;
}
private final String comando;
}
