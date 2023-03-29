import java.util.Scanner;
public class P_3_3_3_AnnoBisiesto {
	public static void main( String [] args){
		Scanner sc = new Scanner(System.in);
		int anno;
		
		System.out.println("Hola, dime un año:");
		anno = sc.nextInt();
		
		if(anno%4==0 & anno%100!= 0 | anno%400==0)
			System.out.println("El año es bisiesto");
		
		else
			System.out.println("El año no es bisiesto");
	}
}
		