public class Main {
public static void main(String[] args) {
/*  Animales animal1 = new Animales(5, "Ramon");
    System.out.println("El nombre del animal 1 es "+animal1.nombre);
    System.out.println("La edad del animal es:"+animal1.edad);
    animal1.comer("perro");*/

    Perro perro1 = new Perro(11, "Timon","pitbull");
    System.out.println("la raza del perro es: "+perro1.raza );
    System.out.println("El nombre del perro es: "+perro1.nombre );
    System.out.println("la edad del perro es: "+perro1.edad);
    perro1.comer("perro");
    System.out.println("---------------------------");
    Gato gato1 = new Gato(6,"Lana", "Femenino");
    System.out.println("El genero del gato(a) es: "+gato1.genero);
    System.out.println("El nombre del gato(a) es: "+gato1.nombre );
    System.out.println("La edad del gato(a) es: "+gato1.edad );
    gato1.dormir("gato");
    System.out.println("---------------------------");
    Loro loro1 = new Loro(4, "pepe", "verde");
    System.out.println("El nombre del loro es: "+loro1.nombre );
    System.out.println("El nombre del loro es: "+loro1.edad );
    System.out.println("El color del loro es: "+loro1.colores);
    loro1.Hablar("loro");
    System.out.println("---------------------------");
    Hamster hamster1 = new Hamster(1, "Ratatuille", 15);
    System.out.println("El nombre del hamster es: "+hamster1.nombre);
    System.out.println("La edad del hamster es: "+hamster1.edad );
    System.out.println("La altura del hamster en cm es: "+hamster1.altura);
    hamster1.correr("hamster");
}
}
