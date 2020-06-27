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
public enum IMEC_TipoPizza {
    INSERT("INSERT INTO `pizzeria`.`item_options`(`item_id`,`option_name`,`price`) values(?,?,?);"),
    READ("SELECT * from `pizzeria`.`item_options` where `item_id` = ?;"),
    UPDATE("UPDATE `pizzeria`.`item_options` SET `item_id`=?,`option_name`=?,`price`=? where option_id=? ;"),
    DELETE("DELETE FROM `pizzeria`.`item_options` where `option_id`=?;"),
    QUERY("SELECT * from `pizzeria`.`item_options` where `option_id`=?;");
    IMEC_TipoPizza(String comando)
{
    this.comando=comando;
}
public String obtenerComando(){
    return comando;
}
private final String comando;
}
