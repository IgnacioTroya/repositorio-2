package RepasoPrueba;

public class Repaso {
    public static void main(String[] args) {
        PersonaPrivado persona1 = new PersonaPrivado();
        persona1.setEdad(20);
        persona1.setNombre("Ignacio");
        System.out.println("El nombre de la persona es: "+persona1.getEdad()+" La edad de la persona es: "+persona1.getNombre());
    }
}
