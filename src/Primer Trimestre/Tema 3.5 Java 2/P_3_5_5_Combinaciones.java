import java.util.Scanner;
public class P_3_5_5_Combinaciones{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		int m,n,i,resultado1,resultado2,resultado3,resultadoFinal;
		//resultado1=1;
		//resultado2=1;
		//resultado3=1;
		factM=factorial(m)
		factN=factorial(n);
		factMN= factorial(m-n);
		System.out.println("Calcular combinaciones de m elementos tomados de n en n");
		System.out.println("Dime m(cuantos elementos)");
		m= sc.nextInt();
		System.out.println("Dime de cuantos en cuantos numeros lo quieres(n)");
		n=sc.nextInt();
		
		if(m>n && n>=0){
			/*for(i=m;i>1;i--){
				resultado1=resultado1*i;
			}
			for(i=n;i>1;i--){
				resultado2=resultado2*i;
			}
			for(i=(m-n);i>1;i--){
				resultado3=resultado3*i;
			}
			resultadoFinal=resultado1/(resultado2*resultado3);
			System.out.println("El resultado es "+resultadoFinal);
			*/System.out.println("El resultado de la operacion combinatoria es: "+factM/(factN*factNM));
		}else
			System.out.println("No se puede hacer");
		
	}//Linea 33 Le llamamos factorial, siempre tiene q haber parentesis para pasar por ahi el parametro, en este caso el tipo de dato que va a recibir. Por delante decimos que tipo de dato devuelve.
	// como el main es static, la funcion tiene que ser estatica para que pueda usarlo.
	static int factorial(int n){
		int fac=1;
		for(int i=n;i>=1;i--){
			fac=fac*i;
		}
		return fac;
	}
}