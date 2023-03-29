import java.util.Scanner;
public class P_4_3_4y7_TruncarYRedondear{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double n=1.0;
		System.out.println("Dime un numero. Cuando quieras para introduce un 0");
		n=sc.nextDouble();
		while(n!=0){
			System.out.println("El numero truncado es: "+(int)n);
			if(n>0){
				System.out.println("El numero truncado con metodo es: "+Math.floor(n));
			}else
				System.out.println("El numero truncado con metodo es: "+Math.ceil(n));
			System.out.println("El numero redondeado es: "+Math.round(n));
			System.out.println("Dime un numero. Cuando quieras para introduce un 0");
			n=sc.nextDouble();
		}
	}
}