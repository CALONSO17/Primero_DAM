import java.util.Scanner;
public class P_3_6_2_ProgresionGeometrica{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,a,a1,r,suma;
		
		//N=5
		//A=2
		//R=3
		//2(x3)=6(x3)=18(x3)=54(x3)=162 La suma de ellos
		System.out.println("Vamos a calcular de los terminos de una progresion geometrica");
		System.out.println("Dime el valor de N");
		n=sc.nextInt();
		System.out.println("Dime el valor de A");
		a=sc.nextInt();
		System.out.println("Dime el valor de R");
		r=sc.nextInt();
		suma=a;
		for(int i=1;i<n;i++){
			a=a*r;
			suma=suma+a;
			
		}
		System.out.println("La suma de la progresion geometrica es: "+suma);
	}
}