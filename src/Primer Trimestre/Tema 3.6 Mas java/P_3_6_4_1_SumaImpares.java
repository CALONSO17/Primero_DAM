import java.util.Scanner;
public class P_3_6_4_1_SumaImpares{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int num,suma;
		suma=0;
		System.out.println("Vamos a calcular la suma de los numeros impares anteriores a un numero");
		System.out.println("Dime un numero");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++){
			if(i%2!=0){
				suma=i+suma;
			}
		}
		System.out.println("La suma de los numeros impares es: "+suma);
	}
}