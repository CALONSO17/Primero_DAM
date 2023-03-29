import java.util.Scanner;
import java.io.IOException;

public class P_4_2_6_PalabraEmpiezaPorSilaba{
	public static void main(String[]args)throws java.io.IOException{
		Scanner sc= new Scanner(System.in);
		String palabra="";
		String silaba="";
		char seguir='S';
		
		while(seguir=='S'){
			System.out.println("Dime una palabra");
			palabra=sc.nextLine();
			System.out.println("Dime una silaba");
			silaba=sc.nextLine();
			
			if(palabra.startsWith(silaba)){
				System.out.println("La palabra "+palabra+" empieza por la silaba "+silaba);
			}else
				System.out.println("La palabra no empieza por esa silaba");
			
			System.out.println("¿Desea continuar?(S/N)");
			seguir=(char)Character.toUpperCase(System.in.read());
			sc.nextLine();
		}
	}
}