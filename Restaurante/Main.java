package Restaurante;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nombre;
        int Orden;
        int mesa; 
        String respuesta;     
        Scanner lectura = new Scanner(System.in);
        mesero mesero1 = new mesero("Ignacio","Mesero");
        cocinero cocinero1 = new cocinero("Luis", "Cocinero");
        System.out.println("Bienvenido a nuestro restaurante soy "+mesero1.nombre+ "Su mesero");
        System.out.println("EL cocinero se llama"+cocinero1.nombre+"y su rol es:"+cocinero1.rol);
        System.out.println("Puedo tomar su orden? ");
        respuesta =lectura.nextLine();
        if (respuesta.equals("si")) {
            System.out.println("Ingrese su mesa: ");
            mesa = lectura.nextInt();
            lectura.nextLine();
            System.out.println("Digame su nombre: ");
            nombre = lectura.nextLine();            
            do {
               
                System.out.println("Seleccione una opción:");
                System.out.println("1- Desayuno");
                System.out.println("2- Almuerzo");
                System.out.println("3- Merienda");
                System.out.println("0- Salir del menú");  
                try {
                    // Pedimos al usuario que ingrese un valor entero
                    System.out.print("Ingrese una orden: ");
                    Orden = Integer.parseInt(lectura.nextLine());
                
                // Imprimimos el valor entero ingresado
                System.out.println("El valor entero ingresado es: " + Orden);
                } catch (NumberFormatException e) {  
                    System.out.println("Ha ocurrido un error al ingresar el valor entero: " + e.getMessage()); 
                                System.out.println(" Ingrese una opción valida: ");
                                Orden = lectura.nextInt();
                }
                Comensal comensal1 = new Comensal(nombre, Orden, mesa);
                System.out.println("Sus datos son: "+comensal1.nombre+" y su mesa es: " +comensal1.mesa+" y su orden es: "+comensal1.Orden);
                
                switch (Orden) {
                    case 1:
                        System.out.println("Has elegido desayuno.");
                        cocinero1.prepararOrden();
                        mesero1.llevarOrden();
                        break;
                    case 2:
                        System.out.println("Has elegido almuerzo.");
                        cocinero1.prepararOrden();
                        mesero1.llevarOrden();
                        break;
                    case 3:
                        System.out.println("Has elegido merienda.");
                        cocinero1.prepararOrden();
                        mesero1.llevarOrden();
                        break;
                    case 0:
                        System.out.println("Saliendo del menú.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
    
            } while(Orden != 0);
        } else {
            
            System.out.println("Programa cerrado.");
        }
        
     }
        


}
