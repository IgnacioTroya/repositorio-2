public class Funcionario extends Persona {
    String usuario;
    String email;
    public Funcionario(String nombre, String usuario, String email) {
        super(nombre);
        this.usuario = usuario;
        this.email = email;
    }
    
    
}
