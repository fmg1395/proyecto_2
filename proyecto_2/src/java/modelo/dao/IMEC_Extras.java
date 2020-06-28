/*<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>*/
package modelo.dao;

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
