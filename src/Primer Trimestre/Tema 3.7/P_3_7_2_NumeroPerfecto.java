import java.util.Scanner;
public class P_3_7_2_NumeroPerfecto{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n,d,sum;
		sum=0;
		
		do{
			System.out.println("Dime un numero: ");
			n =sc.nextInt();
		}while(n<=0);
		d=n-1;
		
		for(int i=1;i<n;i++){
			if(n%d==0){
				sum=sum+d;
			}
			d--;

		}
		if(sum==n){
			System.out.println("El numero es perfecto");
		}else
			System.out.println("El numero no es perfecto");
			
	}
}