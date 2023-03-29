import java.util.Scanner;
import java.io.IOException;

public class P_4_2_1_PalabraSilaba{
	public static void main(String[]args)throws java.io.IOException{
		Scanner sc = new Scanner (System.in);
		String palabra="";
		String silaba="";
		char seguir='S';
		int posicion;
		
		while(seguir=='S'){
			System.out.println("Dime una palabra");
			palabra=sc.nextLine();
			System.out.println("Dime una silaba");
			silaba=sc.nextLine();
			posicion=palabra.indexOf(silaba);
			
			if(posicion>=0){
				System.out.println("La silaba se encuentra en la posicion: "+(posicion+1));
			}else
				System.out.println("La silaba no se encuentra en la palabra");
			
			System.out.println("Desea continuar?(S/N)");
			seguir=(char)Character.toUpperCase(System.in.read());
			sc.nextLine();
		}
	}
}