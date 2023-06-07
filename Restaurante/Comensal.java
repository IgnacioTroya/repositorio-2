package Restaurante;

public class Comensal extends Persona{
    int Orden;
    int mesa;
    public Comensal(String nombre, int orden, int mesa) {
        super(nombre);
        Orden = orden;
        this.mesa = mesa;
    }
  
  
}
