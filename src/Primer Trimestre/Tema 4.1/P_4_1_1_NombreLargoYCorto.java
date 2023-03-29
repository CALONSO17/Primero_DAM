import java.util.Scanner;
import java.io.IOException;
public class P_4_1_1_NombreLargoYCorto{
	public static void main(String[]args) throws java.io.IOException{
		Scanner sc = new Scanner(System.in);
		char parar='S';
		String nombre="";
		String nombreLargo="";
		String nombreCorto="";
		System.out.println("Dime un nombre");
		nombre = sc.nextLine();
		nombreCorto=nombre;
		while(parar=='S'){
			if(nombre.length()>nombreLargo.length()){
				nombreLargo=nombre;	
			}else
				if(nombre.length()<nombreCorto.length()){
					nombreCorto=nombre;
				}
			System.out.println("¿Desea continuar?(S/N)");
			parar =(char)Character.toUpperCase(System.in.read());
			sc.nextLine();
			System.out.println("Dime otro nombre");
			nombre= sc.nextLine();
		}
		System.out.println("El nombre mas largo es "+nombreLargo+" con "+nombreLargo.length()+" letras");
		System.out.println("El nombre mas corto es "+nombreCorto+" con "+nombreCorto.length()+" letras");
	}
}