import java.util.Scanner;
public class Persona {
    int edad;
    String nombre;
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    public void correr() {
        try{
        Scanner Lectura = new Scanner(System.in);
        System.out.println("ingrese la edad: ");
        edad = Lectura.nextInt();
        Lectura.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = Lectura.nextLine();
        System.out.println("El nombre de la persona es "+nombre);
        System.out.println("La edad de "+ nombre+" es: "+edad);
        } catch(ImputMismatchException edad){
            System.out.println("Ingrese un entero");
        }  
}
}


