import java.util.Scanner;
import java.io.IOException;
public class P_3_8_2_DecEnBin{
	public static void main(String[]args)throws java.io.IOException{
		Scanner sc =new Scanner(System.in);
		
		int num,opcion,cociente;
		cociente=0;
		char seguir='S';
		 System.out.println("Vamos a transformar un numero decimal en binario, octal o hexadecimal");
		 
		 while(seguir=='S'){
			 String resultado="";
			 System.out.println("Diga el numero decimal");
			 num = sc.nextInt();
			 do{
				 System.out.println("¿A que lo queremos transformar?(PULSE EL NUMERO CORRESPONDIENTE)");
				 System.out.println("1-BINARIO");
				 System.out.println("2-OCTAL");
				 System.out.println("3-QUINTAL");
				 opcion = sc.nextInt();
				 if(opcion<1 || opcion>3) System.out.println("Elija entre una de las tres opciones dadas");
			 }while(opcion<1 || opcion>3);
				 switch(opcion){
					 case 1:
						/*resultado=cambioBase(decimal,2) Todo el resto sobraria, solo se quedaria el break*/
						while(num>0){
							cociente = num%2;
							num= num/2;
							resultado= Integer.toString(cociente)+resultado;
						}
						System.out.println("El resultado es "+resultado);
						break;
					 case 2:
						while(num>0){
							cociente = num%8;
							num=num/8;
							resultado= Integer.toString(cociente)+resultado;
						}
						System.out.println("El resultado es "+resultado);
						break;
					 case 3:
						while(num>0){
							cociente = num%5;
							num=num/5;
							resultado= Integer.toString(cociente)+resultado;
						}
						System.out.println("El resultado es "+resultado);
						break;
				 }
		 
		 System.out.println("¿Desea continuar haciendo operaciones?(S/N)");
		 seguir = (char)Character.toUpperCase(System.in.read());
		 }
		 
		 
		 
	}/*esto lo hacemos para crear un metodo
	static String cambioBase(int num,int base){
		String resultado="";
		int cociente=0;
		while(decimal>0){
			cociente = num%base;
			num= num/base;
			resultado= Integer.toString(cociente)+resultado;*/
		}
	}
}