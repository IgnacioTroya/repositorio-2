public class Animales {
    int edad; 
    String nombre;
    public Animales(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
public void comer (String animal){
    System.out.println("El "+animal+ " esta comiendo pichula");
}    
}