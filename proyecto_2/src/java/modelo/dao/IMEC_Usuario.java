/*<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>*/
package modelo.dao;

public enum IMEC_Usuario {
     INSERT("INSERT INTO `pizzeria`.`usuario`(`cedula`,`nombre`,`apellido`,"
             + "`direccion`,`telefono`,`contraseña`) values(?,?,?,?,?,?);"),
    READ("SELECT * from `pizzeria`.`usuario`;"),
    UPDATE("UPDATE `pizzeria`.`usuario` SET `nombre`=?,`apellido`=?,"
             + "`direccion`=?,`telefono`=?,`contraseña`=? where `cedula`=?;"),
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
