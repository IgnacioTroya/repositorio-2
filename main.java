public class Main {
public static void main(String[] args) {
    Animales animal1 = new Animales(5, "Ramon");
    System.out.println("El nombre del animal 1 es "+animal1.nombre);
    System.out.println("La edad del animal es:"+animal1.edad);
    animal1.comer("perro");

    Perro perro1 = new Perro(11, "Timon","pitbull");
    System.out.println("la raza del perro es: "+perro1.raza );
    System.out.println("El nombre del perro es: "+perro1.nombre );
    System.out.println("la edad del perro es: "+perro1.edad);
 
    

}
}
