import java.util.Scanner;

public class P_4_2_7_Palindromo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String frase="";
		String frase2="";
		char caracter;
		int longitud;
		
		System.out.println("Dime una frase");
		frase= sc.nextLine();
		frase2="";
		longitud=frase.length();
		
		frase=frase.toUpperCase();
		frase=frase.replace('Á','A').replace('É','E').replace('Í','I').replace('Ó','O').replace('Ú','U');
		frase=frase.replace(" " ,"");
		
		for(int i=0;i<longitud;i++) {
			caracter=frase.charAt(i);
			frase2=caracter+frase2;
		}
		if(frase2.equals(frase)){
			System.out.println("Es palindromo");
		}else
			System.out.println("No es palindromo");
		
	}
}