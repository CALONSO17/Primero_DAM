import java.util.Scanner;
public class P_3_3_4_ViajeEstudios{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int alumno,autobus;
		String nombre;
		autobus=0;
		alumno=0;
		double precioAlumno,pagoTotal,costeAutobus;
		precioAlumno=0.0;
		pagoTotal=0.0;
		costeAutobus=0.0;
		
		System.out.println("¿Cuantos alumnos acuden al viaje?");
		alumno = sc.nextInt();
		sc.nextLine();
		System.out.println("Como se llama el colegio?");
		nombre = sc.nextLine();
		
		if(alumno>=100){
			precioAlumno=65.5;
		}else if(alumno<=99 && alumno>=50){
				precioAlumno=70.5;
		}else if(alumno<50 && alumno>=30){
				precioAlumno=95.0;
		}else{
			precioAlumno=105.0;
		}
		
		if (alumno%60!=0){
			autobus=alumno/60;
			autobus++;
		}
		else
			autobus=alumno/60;
		
		costeAutobus=autobus*1000;
		pagoTotal=alumno*precioAlumno+costeAutobus;
		
		System.out.println("El viaje cuesta "+(alumno*precioAlumno)+" euros, mas el coste de autobus que son "+costeAutobus+" euros");
		System.out.println("En total serian "+pagoTotal);
		System.out.println("Cada alumno del colegio "+nombre+" tiene que pagar "+(precioAlumno+(costeAutobus/alumno))+" euros");
			
		
		
	}
}