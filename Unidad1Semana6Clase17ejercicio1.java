
import java.util.Scanner;
/**
 *
 * @Carlos Rivas 
 */

public class ejercicio4 {
    public static void main(String[] args) {
        String nombre, clave;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario: ");
        nombre = Entrada.nextLine(); 
        System.out.println("Ingrese clave de usuario");
        clave = Entrada.nextLine();
        if(nombre.equals("juan") && clave.equals("123456")){
        System.out.println("bienvenido al Sistema");
        }
        else{
        System.out.println("nombre del usuario o contraseña incorrecta");    
        }
}
        
   
}
