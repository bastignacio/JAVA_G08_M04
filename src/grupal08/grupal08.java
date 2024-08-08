package grupal08;

import java.util.Scanner;

public class grupal08 {
	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.print("Ingresa tu nombre: ");
	 String nombre = scanner.nextLine(); // Leer una cadena
	 
	 System.out.print("Ingresa tu apellido: ");
	 String apellido = scanner.nextLine();
	 
	 System.out.print("Ingresa tu fecha de nacimiento: ");
	 String fechaNacimiento = scanner.nextLine();
	 
	 System.out.print("Ingresa tu RUT: ");
	 String RUT = scanner.nextLine();
	 
	 System.out.print("Ingrese tipo de usuario: \n");
	 System.out.print("[ 1 ] Cliente \n");
	 System.out.print("[ 2 ] Profesional \n");
	 System.out.print("[ 3 ] Administrativo \n");
	 String tipoUsuario = scanner.nextLine(); // Leer un entero
	 
	 
	 
	 System.out.println("Tu nombre completo es: " + nombre + " " + apellido + ", tu fecha de nacimiento es: " + fechaNacimiento + " y tu RUT es: " + RUT);
	 
	 // Para comparar el contenido de un string se debe utilizar el método .equals("valor"), de esta forma funcionará.
	 // El comparador "==" compara la referencia de los objetos. Pueden contener lo mismo pero no están alojado en la misma memoria. 
	 
	 if (tipoUsuario.equals("1")) { 
         tipoUsuario = "Cliente";
         System.out.print("El tipo de perfil que posees es: " + tipoUsuario);

     } else if (tipoUsuario.equals("2")) {
         tipoUsuario = "Profesional";
         System.out.print("El tipo de perfil que posees es: " + tipoUsuario);
     } else if (tipoUsuario.equals("3")) {
         tipoUsuario = "Administrativo";
         System.out.print("El tipo de perfil que posees es: " + tipoUsuario);
     } else {
         System.out.print("Opción no válida.");
     }
	 
	 scanner.close();
 }
}
