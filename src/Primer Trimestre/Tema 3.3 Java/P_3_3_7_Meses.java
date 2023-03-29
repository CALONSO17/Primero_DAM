import java.util.Scanner;
public class P_3_3_7_Meses{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int num=1;

		while (num!=0){
			System.out.print("Introduca numero de mes(PULSE 0 CUANDO QUIERA PARAR):");
			num= sc.nextInt();
			
			if(num>=1 && num<=12){
				switch(num){
					case 1:
						System.out.println("Enero");
						break;
					case 2:
						System.out.println("Febrero");
						break;
					case 3:
						System.out.println("Marzo");
						break;
					case 4:
						System.out.println("Abril");
						break;
					case 5:
						System.out.println("Mayo");
						break;
					case 6:
						System.out.println("Junio");
						break;
					case 7:
						System.out.println("Julio");
						break;
					case 8:
						System.out.println("Agosto");
						break;
					case 9:
						System.out.println("Septiembre");
						break;
					case 10:
						System.out.println("Octubre");
						break;
					case 11:
						System.out.println("Noviembre");
						break;
					case 12:
						System.out.println("Diciembre");
						break;
					default:
						System.out.println("Error: Numero incorrecto");
					
				}
			}
			else
				System.out.println("ERROR: numero incorrecto");
		}	
	}
}