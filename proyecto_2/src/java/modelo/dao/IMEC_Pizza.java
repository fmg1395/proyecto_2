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
public enum IMEC_Pizza {
    INSERT("INSERT INTO `pizzeria`.`items`(`item_name`,`desc`) values(?,?);"),
    READ("SELECT * from `pizzeria`.`items`;"),
    UPDATE("UPDATE `pizzeria`.`items` SET `item_name`=?,`desc`=? where `item_id`=?;"),
    DELETE("DELETE FROM `pizzeria`.`items` where `item_id`=?;"),
    QUERY("SELECT * from `pizzeria`.`items` where `item_id`=?;");
IMEC_Pizza(String comando)
{
    this.comando=comando;
}
public String obtenerComando(){
    return comando;
}
private final String comando;
}
