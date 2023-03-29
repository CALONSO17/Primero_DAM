import java.util.Scanner;

public class P_4_2_2_VocalesEnMayuscula{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String frase="";
		
		System.out.println("Dime una frase");
		frase=sc.nextLine();
		
		frase = frase.replace('a','A').replace('e','E').replace('i','I').replace('o','O').replace('u','U');
		System.out.println(frase);
		
	}
}