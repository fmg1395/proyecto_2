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
public class TipoPizza {
    private Integer id;
    private String tam;
    private Float precio;

    public TipoPizza(Integer id, String tam, Float precio) {
        this.id = id;
        this.tam = tam;
        this.precio = precio;
    }

    public TipoPizza() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

   
}
