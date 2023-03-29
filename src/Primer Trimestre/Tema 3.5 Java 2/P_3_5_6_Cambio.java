
import java.util.Scanner;
public class P_3_5_6_Cambio{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double coste,pago,cambio;
		double cincuentaCentimos,veinteCentimos,diezCentimos,cincoCentimos,dosCentimos,unCentimo;
		double cincuentaEuros,veinteEuros,diezEuros,cincoEuros,dosEuros,unEuro;
		cincuentaEuros=0;
		veinteEuros=0;
		diezEuros=0;
		cincoEuros=0;
		dosEuros=0;
		unEuro=0;
		cincuentaCentimos=0;
		veinteCentimos=0;
		diezCentimos=0;
		cincoCentimos=0;
		dosCentimos=0;
		unCentimo=0;
		
		System.out.println("¿Cual es el precio del articulo?");
		coste=sc.nextDouble();
		System.out.println("¿Cuanto vas a pagar?");
		pago=sc.nextDouble();
		
		if(coste<=50){
			do{
				cambio=pago-coste;
				if(cambio-50>0){
					cincuentaEuros=(int)(cambio/50);
					cambio= cambio-50*cincuentaEuros;
				}
				if(cambio-20>0){
					veinteEuros=(int)(cambio/20);
					cambio=cambio-20*veinteEuros;
				}
				if(cambio-10>0){
					diezEuros=(int)(cambio/10);
					cambio= cambio-10*diezEuros;
				}
				if(cambio-5>0){
					cincoEuros=(int)(cambio/5);
					cambio= cambio-5*cincoEuros;
				}
				if(cambio-2>0){
					dosEuros=(int)(cambio/2);
					cambio= cambio-2*dosEuros;
				}
				if(cambio-1>0){
					unEuro=(int)(cambio/1);
					cambio=cambio-1*unEuro;
				}
				if(cambio-0.50>0){
					cincuentaCentimos=(int)(cambio/0.50);
					cambio=cambio-0.50*cincuentaCentimos;
				}
				if(cambio-0.20>0){
					veinteCentimos=(int)(cambio/0.20);
					cambio= cambio-0.20*veinteCentimos;
				}
				if(cambio-0.10>0){
					diezCentimos=(int)(cambio/0.10);
					cambio=cambio-0.10*diezCentimos;
				}
				if(cambio-0.05>0){
					cincoCentimos=(int)(cambio/0.05);
					cambio=cambio-0.05*cincoCentimos;
				}
				if(cambio-0.02>0){
					dosCentimos=(int)(cambio/0.02);
					cambio=cambio-0-02*dosCentimos;
				}
				if(cambio-0.01>0){
					unCentimo=(int)(cambio/0.01);
					cambio=cambio-0.01*unCentimo;
				}
			}while(cambio==0);
			
		}else
			System.out.println("El articulo no puede costar mas de cincuenta euros");
		
		System.out.println("Su cambio son :");
		System.out.println("Billetes de 50 euros: "+(int)cincuentaEuros);
		System.out.println("Billetes de 20 euros: "+(int)veinteEuros);
		System.out.println("Billetes de 10 euros: "+(int)diezEuros);
		System.out.println("Billetes de 5 euros: "+(int)cincoEuros);
		System.out.println("Monedas de 2 euros: "+(int)dosEuros);
		System.out.println("Monedas de 1 euro: "+(int)unEuro);
		System.out.println("Monedas de 50 centimos: "+(int)cincuentaCentimos);
		System.out.println("Monedas de 20 centimos: "+(int)veinteCentimos);
		System.out.println("Monedas de 10 centimos: "+(int)diezCentimos);
		System.out.println("Monedas de 5 centimos: "+(int)cincoCentimos);
		System.out.println("Monedas de 2 centimos: "+(int)dosCentimos);
		System.out.println("Monedas de 1 centimo: "+(int)unCentimo);
		sc.close();

	}
}