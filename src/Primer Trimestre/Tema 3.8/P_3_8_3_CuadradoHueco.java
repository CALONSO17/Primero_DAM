import java.util.Scanner;

public class P_3_8_3_CuadradoHueco{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int lado;
		char elemento='o';
		System.out.println("Vamos a dibujar un cuadrado");
		System.out.println("Dime la longitud de un lado");
		lado= sc.nextInt();
		
		for(int i=1;i<=lado;i++){
			for(int x=1;x<=lado;x++){
				if(i==1 || i==lado){
					System.out.print(elemento);
				}else{
					if(x==1 || x==lado){
						System.out.print(elemento+" ");
					}else
						System.out.print(" ");
				}
			}
			System.out.println();

		}
		
	}
}