import java.util.Scanner;	

public class P_PreparacionExamen{
	public static void main (String[]args){
		Scanner sc= new Scanner(System.in);
		String nombreTempMinima="";
		int tMinimaNocturna=0,tMediaDiurnaMes,tMediaDiurna,tMediaNocturna,registroDiurno=0,registroNocturno=0,registroDiurnoDia=0,registroNocturnoDia=0;
		int dia=1;
		tMediaDiurnaMes=0;
		String nombre="";
		for(int x=0;x<30;x++){
			registroDiurnoDia=0;
			registroNocturnoDia=0;
			for(int i=0;i<4;i++){
				do{
					System.out.print("Introduca el registro diurno:");
					registroDiurno=sc.nextInt();
					if(registroDiurno>0||registroDiurno<-20){
						System.out.println("No es posible relizar la medicion con esos parametros. Insertelos otra vez");
					}
				}while(registroDiurno>0||registroNocturno<-20);
				do{
					System.out.print("Introduzca el registro nocturno:");
					registroNocturno=sc.nextInt();
					if(registroNocturno>0||registroNocturno<-20){
						System.out.println("No es posible relizar la medicion con esos parametros. Insertelos otra vez");
					}
				}while(registroNocturno>0||registroNocturno<-20);
					sc.nextLine();
					System.out.print("Introduzca el nombre de la persona que realizo la medicion:");
					nombre=sc.nextLine();
					registroDiurnoDia=registroDiurnoDia+registroDiurno;
					registroNocturnoDia=registroNocturnoDia+registroNocturno;
					if(registroNocturno<tMinimaNocturna){
						tMinimaNocturna=registroNocturno;
						nombreTempMinima=nombre;
					}

			}
			tMediaDiurna=registroDiurnoDia/4;
			tMediaNocturna=registroNocturnoDia/4;
			System.out.println("La temperatura media diurna del dia:"+dia+" es de "+tMediaDiurna+" grados");
			System.out.println("La temperatura media nocturna del dia:"+dia+" es de "+tMediaNocturna+" grados");
			dia++;
			tMediaDiurnaMes=tMediaDiurnaMes+tMediaDiurna;
		}
		System.out.println("La temperatura minima nocturna del mes eha sido de:"+tMinimaNocturna+" y ha sido realizada por "+nombreTempMinima);
		System.out.println("La temperatura media diurna de todo el mes ha sido de:"+tMediaDiurnaMes/30.0);
}}
