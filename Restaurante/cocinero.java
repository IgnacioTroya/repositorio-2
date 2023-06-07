package Restaurante;

public class cocinero extends Persona{
    private String Usuario;
    String rol;
   
   
    public cocinero(String nombre, String rol) {
        super(nombre);
        this.rol = rol;
    }
    public cocinero(String nombre, String usuario, String rol) {
        super(nombre);
        Usuario = usuario;
        this.rol = rol;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public void prepararOrden() {
        System.out.println("El cocinero "+nombre+ " esta preparando su orden");
    }
    
}
