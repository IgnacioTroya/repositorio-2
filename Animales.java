import javax.sound.midi.Synthesizer;

public class Animales {
    int edad; 
    String nombre;
    public Animales(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public void comer (String animal){
        System.out.println("El "+animal+ " esta comiendo ");
    }
    public void ladrar(String animal) {
        System.out.println("El "+animal+ " esta ladrando ");
    }
    public void saltar(String animal) {
        System.out.println("El "+animal+" esta saltando");        
    }
    public void dormir (String animal){
        System.out.println("El "+animal+" esta durmiendo");
    }
    public void Hablar (String animal){
        System.out.println("El "+animal+" esta hablando");
    }
    public void correr (String animal){
        System.out.println("El "+animal+" esta corriendo");
    }
}
