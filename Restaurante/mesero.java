package Restaurante;

public class mesero extends Persona {
    private String usuario;
    String rol;
    
    public mesero(String nombre, String rol) {
        super(nombre);
        this.rol = rol;
    }

    
    public mesero(String nombre, String usuario, String rol) {
        super(nombre);
        this.usuario = usuario;
        this.rol = rol;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public void llevarOrden() {
        System.out.println("El mesero " + nombre + " está llevando su orden.");
      }
}

