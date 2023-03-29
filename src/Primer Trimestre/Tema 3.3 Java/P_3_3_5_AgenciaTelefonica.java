import java.util.Scanner;
public class P_3_3_5_AgenciaTelefonica{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int minuto=0;
		double precioMinuto=0.0;
		int horaLlamada=0;
		String dia="";
		
		System.out.println("¿Cuantos minutos has hablado por teléfono?");
		minuto=sc.nextInt();
		System.out.println("¿A que hora llamaste?(Formato 24h)");
		horaLlamada= sc.nextInt();
		sc.nextLine();//esto se pone para que borre el buffer y pueda coger la cadena siguiente. Se puede hacer o esto, o poner primero los strings.
		System.out.println("¿Que dia llamaste?");
		dia=sc.nextLine();//y ahora si coge el string
		
		
		if (minuto<5){
			precioMinuto=minuto*1.0;
		}
		else if(minuto>=5 & minuto<8){
			precioMinuto=5.0+((minuto-5)*0.8);
		}
		else if(minuto>=8 & minuto<10){
			precioMinuto=5.0+(0.8*3)+((minuto-8)*0.7);
		}
		else if(minuto>=10){
			precioMinuto=5.0+(0.8*3)+(0.7*2)+((minuto-10)*0.50);
		}
		
		if (dia.toUpperCase().equals("DOMINGO"))
			precioMinuto=(precioMinuto*0.03)+precioMinuto;//precioMinuto+=precioMinuto*0.03;  = precioMinuto=precioMinuto*1.03;
		
		else{
			if(horaLlamada<14)
				precioMinuto= (precioMinuto*0.15)+precioMinuto;
			else
				precioMinuto= (precioMinuto*0.1)+precioMinuto;
		}
		
		System.out.println("La llamada cuesta "+precioMinuto+" euros");

	}
}