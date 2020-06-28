/*
<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>

 */
package modelo.dao;

/**
 *
 * @author Kike
 */
public enum IMEC_Ticket {
    INSERT("INSERT INTO `pizzeria`.`pedido`(`ticket_id`) values(?);");
    IMEC_Ticket(String comando)
{
    this.comando=comando;
}
public String obtenerComando(){
    return comando;
}
private final String comando;
}
