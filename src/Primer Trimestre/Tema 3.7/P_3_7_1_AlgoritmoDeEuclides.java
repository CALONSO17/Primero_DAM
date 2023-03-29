import java.util.Scanner;
public class P_3_7_1_AlgoritmoDeEuclides{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int m,n,r,maxComDiv;
		maxComDiv=0;
		
		do{
			System.out.println("Dime un numero:");
			m=sc.nextInt();
			if(m<=0)System.out.println("El numero introducido debe ser mayor que 0");
		}while(m<=0);
		do{
			System.out.println("Dime otro numero:");
			n=sc.nextInt();
			if(n<=0)System.out.println("El numero introducido debe ser mayor que 0");
		}while(n<=0);
		
		r=n%m;
		/*while(r!=0){
			n=m;
			m=r;
			r=n%m;
		}
		System.out.ptintln("El MCD es" +m);*/
		if(r==0){
			maxComDiv=m;
			
		}else if(r!=0){
			do{
				r=n%m;
				maxComDiv=m;
				n=m;
				m=r;
			}while(r!=0);
			
		}
		System.out.println("El maximo comun divisor es: "+maxComDiv);
		
		
			
			
	}
}