import java.util.Scanner;
public class P_3_6_1_Potencia{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int exponente=0;
		int resultado=0;
		int num;
		System.out.println("¿De que numero quieres hacer la potencia?");
		num=sc.nextInt();
		
		do{
			resultado=(int)Math.pow(num,exponente);
			//int potencia=1;
			//for(int i=0;i<=exponente;i++);
			//		potencia=potencia*2;
			System.out.println("La exponente de "+num+" elevado a "+exponente+" es: "+resultado);
			exponente++;
			
			
		}while(exponente<10);
	}
}