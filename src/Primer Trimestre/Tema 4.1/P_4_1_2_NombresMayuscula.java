import java.util.Scanner;
import java.io.IOException;
public class P_4_1_2_NombresMayuscula{
	public static void main(String[]args) throws java.io.IOException{
		Scanner sc = new Scanner(System.in);
		String nombre="";
		String clase="";
		char seguir='S';
		
		System.out.println("Dime los nombres de los alumnos de tu clase");
		while(seguir=='S'){
			System.out.println("Dime un nombre");
			nombre=sc.nextLine();
			clase= clase+"\n"+nombre;
			System.out.println("¿Desea continuar?(S/N)");
			seguir = (char)Character.toUpperCase(System.in.read());
			sc.nextLine();

		}
		System.out.println(clase.toUpperCase());
	}
}