import  java.util.Scanner;
public class P_4_1_3_PalabraRepetida{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		String nombre="";
		String primerNombre="";
		int acc=0;
		
		System.out.println("Vamos a contar cuantas palabras escribes");
		System.out.println("Dime la primera palabra(cuando quieras terminar repitela)");
		primerNombre= sc.nextLine();
		
		while(primerNombre.equals(nombre)==false){
			System.out.println("Dime otra palabra");
			nombre=sc.nextLine();
			acc++;
		}
		System.out.println("Has escrito "+acc+" palabras");
	}
}