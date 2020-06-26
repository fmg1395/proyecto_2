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
public enum IMEC_Extras {
    INSERT("INSERT INTO `pizzeria`.`item_extras`(`name`,`cost`) values(?,?);"),
    READ("SELECT * from `pizzeria`.`item_extras`;"),
    UPDATE("UPDATE `pizzeria`.`item_extras` SET `name`=?,`cost`=? where extra_id=? ;"),
    DELETE("DELETE FROM `pizzeria`.`item_extras` where `extra_id`=?;"),
    QUERY("SELECT * from `pizzeria`.`item_extras` where `extra_id`=?;");
    IMEC_Extras(String comando)
{
    this.comando=comando;
}
public String obtenerComando(){
    return comando;
}
private final String comando;
}
