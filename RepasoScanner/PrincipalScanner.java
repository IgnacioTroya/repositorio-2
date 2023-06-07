package RepasoScanner;
import java.util.Scanner;

public class PrincipalScanner {
    public static void main(String[] args) {
        int edad;
        Scanner Lectura = new Scanner(System.in);
        System.out.println("ingrese la edad: ");
        edad = Lectura.nextInt();
        Lectura.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = Lectura.nextLine();
        System.out.println("El nombre de la persona es "+nombre);
        System.out.println("La edad de "+ nombre+" es: "+edad);
        from sympy import symbols, integrate, exp

        x, y = symbols('x y')
        
        u = x/y
        dy_dx = y**2/x
        
        # Usando la sustitución y la regla de la cadena
        integral = integrate((x*exp(x/y))/y, (y, None, y)).subs({y: x/u, dy_dx: u})
              
        # Aplicando integración por partes
        u = u
        dv = exp(u)/x
              
        du = (x-1)/x**2 * exp(u)
        v = x * exp(-u)
        
        integral = u*v.subs(u, integral) - integrate(v*du.subs(u, integral), u)
        
        # Simplificando la integral
        integral = integral.simplify()
    }
    
}
