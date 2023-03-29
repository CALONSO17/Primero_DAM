import  java.util.Scanner;
public class P_3_3_3_FechaCorrecta{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, anno;
		dia=0;
		mes=0;
		anno=0;
		boolean correcto = false;
		System.out.println("Vamos a ver si la fecha es correcta");
		
		while(correcto==false){
			System.out.println("Dime el dia");
			dia = sc.nextInt();
			System.out.println("Dime el mes");
			mes = sc.nextInt();
			System.out.println("Dime el año");
			anno = sc.nextInt();
			if(mes>=1 && mes<=12)
				switch(mes){
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						if (dia<=31 && dia>=1)
							correcto=true;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if (dia<=30 && dia>=1)
							correcto=true;
						break;
					case 2:
						if ((anno%4)==0 & (anno%100)!= 0 | (anno%400)==0){
							if (dia<=29 && dia>=1)
								correcto=true;
						}
						else
							if (dia<=28 && dia>=1)
								correcto=true;
						break;
					default:
						correcto=false;
				}
			else
				System.out.println("¡Fecha incorrecta! Introduzca bien los datos");
		}
		System.out.println("La fecha "+dia+"/"+mes+"/"+anno+" es correcta");
		
	}		
}