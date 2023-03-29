import java.util.Scanner;

public class P_4_1_4_OrdenarPalabras{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		String palabra1="";
		String palabra2="";
		String palabra3="";
		String ultima="";
		String primera="";
		String intermedia="";

		System.out.println("Dime una palabra");
		palabra1= sc.nextLine();
		System.out.println("Dime otra palabra");
		palabra2= sc.nextLine();
		System.out.println("Dime otra palabra");
		palabra3= sc.nextLine();
		
		if(palabra1.compareTo(palabra2)<0 && palabra1.compareTo(palabra3)<0){
			primera=palabra1;		
		}else if(palabra2.compareTo(palabra1)<0&& palabra2.compareTo(palabra3)<0){
			primera=palabra2;
		}else if(palabra3.compareTo(palabra1)<0&&palabra3.compareTo(palabra2)<0){
			primera=palabra3;
		}
		
		if((palabra1.compareTo(palabra2)<0&&palabra1.compareTo(palabra3)>0)||(palabra1.compareTo(palabra2)>0&&palabra1.compareTo(palabra3)<0)){
			intermedia=palabra1;
		}else if((palabra2.compareTo(palabra1)>0&&palabra2.compareTo(palabra3)<0)||(palabra2.compareTo(palabra1)<0&&palabra2.compareTo(palabra3)>0)){
			intermedia=palabra2;
		}else if((palabra3.compareTo(palabra1)>0&&palabra3.compareTo(palabra2)<0)||(palabra3.compareTo(palabra1)<0&&palabra3.compareTo(palabra2)>0)){
			intermedia=palabra3;
		}
		
		if(palabra1.compareTo(palabra2)>0&&palabra1.compareTo(palabra3)>0){
			ultima=palabra1;
		}else if(palabra2.compareTo(palabra1)>0&&palabra2.compareTo(palabra3)>0){
			ultima=palabra2;
		}else if(palabra3.compareTo(palabra2)>0&&palabra3.compareTo(palabra1)>0){
			ultima=palabra3;
		}
		
		System.out.println("Las palabras ordenadas por orden alfabetico son "+primera+" "+intermedia+" "+ultima);
		
	}
}