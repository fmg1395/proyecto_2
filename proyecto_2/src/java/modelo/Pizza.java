/*
<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>*/

package modelo;

public class Pizza {
Integer id;
String nombre;
String descripcion;
    public Pizza(Integer id,String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Pizza() {
        this("","");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}