import java.util.Scanner;
public class P_3_3_6_Dado{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int num=1;

		while (num!=0){
			System.out.print("Introduca numero de dado(PULSE 0 CUANDO QUIERA PARAR):");
			num= sc.nextInt();
			
			if(num>=1 && num<=6){
				switch(num){
					case 1:
						System.out.println("La cara opuesta es un \"Seis\"");
						break;
					case 2:
						System.out.println("La cara opuesta es un \"Cinco\"");
						break;
					case 3:
						System.out.println("La cara opuesta es un \"Cuatro\"");
						break;
					case 4:
						System.out.println("La cara opuesta es un \"Tres\"");
						break;
					case 5:
						System.out.println("La cara opuesta es un \"Dos\"");
						break;
					case 6:
						System.out.println("La cara opuesta es un \"Uno\"");
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