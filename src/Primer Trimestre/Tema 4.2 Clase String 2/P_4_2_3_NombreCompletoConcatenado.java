import java.util.Scanner;
import java.io.IOException;

public class P_4_2_3_NombreCompletoConcatenado{
	public static void main(String[]args)throws java.io.IOException{
		Scanner sc = new Scanner(System.in);
		String nombre="";
		String apellido1="";
		String apellido2="";
		String nombreCompleto="";
		char seguir='S';
		while(seguir=='S'){
			nombreCompleto="";
			System.out.println("Dime tu nombre");
			nombre = sc.nextLine();
			System.out.println("Dime tu primer apellido");
			apellido1 = sc.nextLine();
			System.out.println("Dime tu segundo apellido");
			apellido2 = sc.nextLine();
			
			nombreCompleto= nombreCompleto.concat(nombre+" "+apellido1+" "+apellido2);//nombre.contact(" ").concat(apellido1).concat(" ").concat(apellido2);
			System.out.println(nombreCompleto);
			System.out.println("¿Desea continuar?(S/N)");
			seguir=(char)Character.toUpperCase(System.in.read());
			sc.nextLine();
		}
	}
}