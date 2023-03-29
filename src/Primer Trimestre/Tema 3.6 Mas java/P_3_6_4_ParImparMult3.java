import java.util.Scanner;
public class P_3_6_4_ParImparMult3{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		//Acumuladores
		int resultadoPar=0;int resultadoImpar=0; int resultadoMTres=0;
		// numeros pares, impares y mult de 3
		int pares=2;int impares=1; int mult3=3;
		
		System.out.println("Vamos a calcular la suma de los numeros impares anteriores a un numero");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++){
			resultadoPar=resultadoPar+pares;
			pares=pares+2;

			resultadoImpar=resultadoImpar+impares;
			impares=impares+2;
			
			resultadoMTres=resultadoMTres+mult3;
			mult3=mult3+3;
		}
		System.out.println("La suma de los numeros impares es: "+suma);
	}
}