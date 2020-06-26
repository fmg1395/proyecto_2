/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
