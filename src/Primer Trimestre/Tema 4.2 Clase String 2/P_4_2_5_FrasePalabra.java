import java.util.Scanner;
import java.io.IOException;

public class P_4_2_5_FrasePalabra{
	public static void main(String[]args)throws java.io.IOException{
		Scanner sc= new Scanner(System.in);
		String frase ="";
		String palabra="";
		char seguir='S';
		int posicion;
		
		while(seguir=='S'){
			System.out.println("Dime una frase");
			frase=sc.nextLine();
			System.out.println("Dime una palabra");
			palabra=sc.nextLine();
			
			posicion=frase.lastIndexOf(palabra);
			if(posicion>=0){
				System.out.println("La palabra se encuentra en la posicion: "+(posicion+1));
			}else
				System.out.println("La palabra no se encuentra en la frase");
			
			System.out.println("Desea continuar?(S/N)");
			seguir = (char)Character.toUpperCase(System.in.read());
			sc.nextLine();
		}
	}
}