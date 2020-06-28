/*<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>*/
package modelo.dao;


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
