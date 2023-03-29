import java.util.Scanner;
public class P_3_6_5_Fibonacci{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n;
		int num=0;
		int numA=1;
		int numB=1;
		System.out.println("Dime la cantidad de numeros que quieres visualizar de la secuencia Fibonacci");
		n = sc.nextInt();
		System.out.println("Los numeros de la secuencia Fibonacci son: ");
		
		for(int i=1;i<=n;i++){
			if(i==1){
				System.out.println(numA);
			}
			else if(i==2)
			{
				System.out.println(numB);
			}
			else{
				num=numA+numB;
				System.out.println(num);
				numA=numB;
				numB=num;
			}
		}
		
	}
}