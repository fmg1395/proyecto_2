package modelo;

/**
 *
 * @author Kike
 */
public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String pass;
    private char tipo;//A: administrador, C: cliente

    public Usuario(String cedula, String nombre, String apellido, String direccion, String telefono, String pass) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pass = pass;
    }
    public Usuario(String cedula, String nombre, String apellido, String direccion, String telefono, String pass,String tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pass = pass;
        this.tipo=tipo.charAt(0);
    }
    public Usuario() {
        this("","","","","","");
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
