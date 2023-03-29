import java.util.Scanner;
public class P_3_7_4_Salario{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int horas,horasExtra;
		double eurosHora;
		double salario;
		System.out.println("¿Hola, cuanto te pagan la hora en el trabaj0?");
		eurosHora=sc.nextDouble();
		do{
		System.out.println("Dime cuantas horas has trabajado esta semana: ");
		horas=sc.nextInt();

		salario= horas*eurosHora;
		
		if(horas>40){
			horasExtra=Math.abs(40-horas);
			horas=40;
			salario= (horas*eurosHora)+horasExtra*(eurosHora*1.5);
		}
		
		
		System.out.println("El salario de la semana es de: "+salario);
		}while(horas!=0);
	}
}