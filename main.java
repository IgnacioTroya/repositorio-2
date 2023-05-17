public class Main {
public static void main(String[] args) {

  Conejo conejo1 = new Conejo(4, "Bugs", "negro");
  System.out.println("El nombre del conejo es "+conejo1.nombre+ "El color del conejo es "+ conejo1.color+" La edad del conejo es "+conejo1.edad);
  conejo1.saltar("conejo");
    
 
}
}