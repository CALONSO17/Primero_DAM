import java.util.Scanner;
public class P_3_5_4_Factorial{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num,i,resultado; 
		resultado=1;
		System.out.println("Vamos a calcular el factorial de un numero");
		System.out.println("Dime un numero");
		num = sc.nextInt();
		
		if(num>0){
			for(i=num;i>1;i--){
				resultado=resultado*i;

			}
			System.out.println("El factorial de "+num+" es "+resultado);
			
		}else if(num==0){
			System.out.println("El factorial es 1");
		}else
			System.out.println("ERROR:No se puede hacer factorial de numeros negativos");
	}
}