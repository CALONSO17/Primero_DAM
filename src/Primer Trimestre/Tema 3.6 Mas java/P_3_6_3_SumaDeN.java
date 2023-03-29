import java.util.Scanner;
public class P_3_6_3_SumaDeN{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n;
		double num,suma;
		suma=0.0;
		System.out.println("¿Cuantos numeros quieres sumar?");
		n = sc.nextInt();
			for(int i=0;i<n;i++){
				System.out.println("Introduce un numero:");
				num = sc.nextDouble();
				suma= suma+num;
				
				
			}
		System.out.println("La suma de los numeros es: "+suma);
		
	}
}