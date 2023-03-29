import java.util.Scanner;

public class P_4_3_2_EPotencia{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int numero;
		
		System.out.println("Dime un numero");
		numero = sc.nextInt();
		
		System.out.println("El valor de E elevado a "+numero+" es de "+Math.pow(Math.E,numero));
		
	}
}