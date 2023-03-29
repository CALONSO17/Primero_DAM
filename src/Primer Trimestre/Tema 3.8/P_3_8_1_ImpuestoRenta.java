import java.util.Scanner;
import java.io.IOException;
public class P_3_8_1_ImpuestoRenta{
	public static void main(String[]args)throws java.io.IOException{
		Scanner sc= new Scanner(System.in);
		int hijos;
		double salario,impuesto;
		char seguir='S';
		impuesto=0;
		
		while(seguir=='S'){
			do{
				System.out.println("Introduce el salario");
				salario=sc.nextDouble();
				if(salario<=0)
					System.out.println("El salario tiene que ser mayor que 0");
			}while(salario<=0);
			do{
				System.out.println("Introduce el numero de hijos");
				hijos = sc.nextInt();
				if(hijos<0)
					System.out.println("Los hijos no pueden ser negativos");
			}while(hijos<0);
			
			if(salario<20000){
				if(hijos==0){
					impuesto=salario*0.15;
				}
				if(hijos>0 && hijos<=2){
					impuesto=salario*0.10;
				}	
				if(hijos>2){
					impuesto=salario;
				}					
			}else if(salario>=20000 && salario<30000){
				if(hijos==0){
					impuesto=salario*0.18;
				}
				if(hijos>0 && hijos<=2){
					impuesto=salario*0.13;
				}	
				if(hijos>2){
					impuesto=salario*0.03;
				}
			}else if(salario>=30000){
				if(hijos==0){
					impuesto=salario*0.25;
				}
				if(hijos>0 && hijos<=2){
					impuesto=salario*0.20;
				}	
				if(hijos>2){
					impuesto=salario*0.10;
				}
			}
		System.out.println("El impuesto que se le aplica son: "+impuesto+" euros.");
		System.out.println("¿Desea continuar?(S/N)");
		seguir = (char)Character.toUpperCase(System.in.read());
		}
	}
}