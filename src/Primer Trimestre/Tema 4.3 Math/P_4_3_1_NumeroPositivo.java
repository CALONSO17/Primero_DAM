import java.util.Scanner;

public class P_4_3_1_NumeroPositivo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n,nTotal=0,nPosTotal=0;
		
		System.out.println("Dime un numero. Introduzca 0 cuando quiera finalizar");
		n=sc.nextInt();
		
		while(n!=0){
			nTotal++;
			if(n<0){
				n=Math.abs(n);
				nPosTotal++;
			}
			System.out.println("Dime un numero. Introduzca 0 cuando quiera finalizar");
			n=sc.nextInt();
		}
		System.out.println("Se han metido "+nTotal+" numeros de los cuales se han convertido en positivo "+nPosTotal);
	}
}