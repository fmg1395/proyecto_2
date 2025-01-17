/*<%-- 
    EIF209 - Programación 4 - Proyecto #2
    Junio 2020
    Autores:
    - 117490582 Enrique Solís Aleman 
    - 116050901 Frank Martínez Galo
--%>*/
package modelo;

/**
 *
 * @author Kike
 */
public class Extras {

    private String nombre;
    private float precio;

    public Extras(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Extras() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
