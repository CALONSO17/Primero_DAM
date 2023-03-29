import java.util.Scanner;

public class P_4_3_8_NumeroAleatorio{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int nAleatorio;
		
		for(int i=0;i<10;i++){
			nAleatorio=(int)(Math.random()*999);
			System.out.println(nAleatorio);
			
		}
		
	}
}