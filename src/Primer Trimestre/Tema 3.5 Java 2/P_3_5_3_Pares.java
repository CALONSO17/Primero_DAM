import java.util.Scanner;
public class P_3_5_3_Pares{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		int num,i;
		
		System.out.println("Numeros Pares");
		System.out.println("Dime un numero");
		num=sc.nextInt();
		
		if(num>1){
			System.out.println("Los numeros pares son:");
			for(i=2;i<=num;i++){
				if(i%2==0){
					System.out.println(i);
				}			
			}
		}else
				System.out.println("ERROR:Escriba un numero mayor de uno");
		
	}
}
