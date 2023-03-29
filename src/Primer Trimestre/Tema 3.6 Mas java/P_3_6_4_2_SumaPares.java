import java.util.Scanner;
public class P_3_6_4_2_SumaPares{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int num,suma;
		suma=0;
		System.out.println("Vamos a calcular la suma de los numeros pares anteriores a un numero");
		System.out.println("Dime un numero");
		num = sc.nextInt();
		
		for(int i=2;i<=num;i++){
			if(i%2==0){
				suma=i+suma;
			}
		}
		System.out.println("La suma de los numeros pares es: "+suma);
	}
}