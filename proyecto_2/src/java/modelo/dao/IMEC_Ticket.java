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
