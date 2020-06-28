/*<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>*/
package modelo.dao;

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
