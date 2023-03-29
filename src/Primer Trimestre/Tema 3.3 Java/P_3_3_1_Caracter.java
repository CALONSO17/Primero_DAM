import java.util.Scanner;
import java.io.IOException;
public class P_3_3_1_Caracter{
	public static void main(String[]args)throws java.io.IOException{
		Scanner sc= new Scanner(System.in);
		char ejemplo;
		
		System.out.println("Dime un caracter");
		ejemplo = (char)System.in.read();
		
		if(ejemplo<48 || ejemplo>=58 && ejemplo<65 || ejemplo>=91 && ejemplo<97 || ejemplo>=123){
			System.out.println("El dato es un caracter");
		}else if(ejemplo>=48 && ejemplo<58){
			System.out.println("El dato es un numero");
		}else if(ejemplo>=65 && ejemplo<91){
			System.out.println("El dato es mayuscula");
		}else if(ejemplo>=97 && ejemplo<123){
			System.out.println("El dato es minuscula");
		}	//En vez de la linea 10, podria haber puesto todo primero y en el ultimo else, que todo lo demas sea caracter, asi me evito todas la comparaciones de la linea 10	
	}
}