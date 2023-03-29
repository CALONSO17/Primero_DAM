import java.util.Scanner;
public class P_3_7_3_DiaSiguiente{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int dia, mes, anno;
		
		System.out.println("Dime un dia: ");
		dia=sc.nextInt();
		System.out.println("Dime un mes: ");
		mes=sc.nextInt();
		System.out.println("Dime un anio: ");
		anno=sc.nextInt();
	
		if(fechaValida(dia,mes,anno)){
			
		}else
			
		
		
		
	}
	
	public static boolean bisiesto(int anno){
		if((anno%4==0 && anno%100!= 0) || anno%400==0)
			return true;
		
		else
			return false;
	}
	
	public static boolean fechaValida(int dia, int mes, int anno){
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
							return true;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if (dia<=30 && dia>=1)
							return true;
						break;
					case 2:
						if ((anno%4)==0 & (anno%100)!= 0 | (anno%400)==0){
							if (dia<=29 && dia>=1)
								return true;
						}
						else
							if (dia<=28 && dia>=1)
								return true;
						break;
					default:
						return false;
				}
			else
				return false;
		
	}
}