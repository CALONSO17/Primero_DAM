import java.util.Scanner;
import java.io.IOException;

public class P_4_1_5_CaracterACaracter{
	public static void main (String[]args)throws java.io.IOException{
		Scanner sc= new Scanner(System.in);
		String frase="";
		System.out.println("Dime una frase");
		frase = sc.nextLine();
		int longitud= frase.length();
		int posicion=0;

		for(int i=0;i<longitud;i++){
			System.out.print(frase.charAt(posicion)+" ");
			posicion++;
		}
	}
}