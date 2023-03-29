import java.util.Scanner;
public class P_3_4_2_Constantes{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double radio,longitud, area,volumen;
		final double pi=3.1416;
		String seguir="";
		do{
			 System.out.println(" Longitud, area y volumen de una esfera/circulo");
			 System.out.println("Introduzca el radio");
			 radio= sc.nextDouble();
			 sc.nextLine();
			 
			 longitud=2*pi*radio;
			 area=pi*(radio*radio);
			 volumen=(-pi)*(Math.pow(radio,3));
			 
			 System.out.println("La longitud de la circunferencia es "+longitud);
			 System.out.println("El area del circulo es "+area);
			 System.out.println("El volumen de la esfera es "+volumen);
			 System.out.println("¿Desea seguir calculando?S/N");
			 seguir=sc.nextLine();
			 //char repetir;
			 //seguir= (char)System.in.read(); Para capturar un caracter, el system.in.read coge la primera letra de lo que escribas.el (char) de antes es porque el system.in.read
			 //capta un entero, por eso hacemos el casting (char). Para hacer esto tenemos que poner despues de public static void main(String[]args) throws java.io.IOException{
			 //while Character.toUpperCase(seguir)='S' se pone el nombre de la clase porque es estatico
		}while(seguir.toUpperCase().equals("S"));
		// si quisieramos poner distinto en vez de igual podriamos poner !seguir.equals("N");
			
		
		
		 
	}
}