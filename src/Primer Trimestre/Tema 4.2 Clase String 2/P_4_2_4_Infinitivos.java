import java.util.Scanner;
import java.io.IOException;

public class P_4_2_4_Infinitivos{
	public static void main(String[]args)throws java.io.IOException{
		Scanner sc = new Scanner(System.in);
		String palabra="";
		char seguir='S';
		
		while(seguir=='S'){
			System.out.println("Dime una palabra");
			palabra= sc.nextLine();
			
			if(palabra.endsWith("ar") ||palabra.endsWith("er")||palabra.endsWith("ir")){ //palabra.toUpperCase().endsWith("AR");
				System.out.println("Es infinitivo");
			}else
				System.out.println("No es infinitivo");
			
			System.out.println("¿Desea continuar?(S/N)");
			seguir=(char)Character.toUpperCase(System.in.read());
			sc.nextLine();
		}
		
	}
}