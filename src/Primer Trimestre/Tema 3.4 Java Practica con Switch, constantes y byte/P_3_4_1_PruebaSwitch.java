import java.util.Scanner;
public class P_3_4_1_PruebaSwitch{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int operador;
		double num1,num2;
		double resultado;
		resultado=0;
		String op="";
		
		System.out.println("Pulse el numero corresponiente a la operacion que desea realizar");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("5. MOD(Resto division entera");
		System.out.println("6. Division entera");
		operador=sc.nextInt();
		System.out.print("Diga el primer numero");
		num1=sc.nextDouble();
		System.out.print("Diga el segundo numero");
		num2=sc.nextDouble();
		
		switch(operador){
			case 1:
				resultado=num1+num2;
				op="Sumar";
				break;
			case 2:
				resultado=num1-num2;
				op="Restar";
				break;
			case 3:
				resultado=num1*num2;
				op="Multiplicar";
				break;
			case 4:
				resultado=num1/num2;
				op="Dividir";
				break;
			case 5:
				resultado=num1%num2;
				op="Hacer el resto";
				break;
			case 6:
				resultado=num1/num2;
				resultado=(int)resultado;
				op="Hacer la division entera";
				break;
			default:
				System.out.println("Numero incorrecto");
		}
		System.out.println("El resultado de "+op+" "+num1+" y "+num2+" es "+resultado);
	}
}