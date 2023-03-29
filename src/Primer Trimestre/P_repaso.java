import java.util.Scanner;
import java.io.IOException;
public class P_repaso{
	public static void main (String[]args)throws IOException{
		Scanner sc = new Scanner(System.in);
		/*La forma de cobrar es la siguiente:
			• si son 100 alumnos o más, el costo del viaje por cada alumno es de 65 euros; 
			• de 50 a 99 alumnos, el costo es de 70 euros,
			• de 30 a 49, de 95 euros, 
			• y si son menos de 30.
			• Además, el costo de un autobús es de 4000 euros, sin importar el número de alumnos. 
			LA capacidad de un autobús es de 60 plazas.
			Realice un algoritmo que permita determinar el pago a la agencia de viajes y lo que debe 
			pagar cada alumno por el viaje.*/
		int alumno,numeroBuses;
		double precioBus, pagoAgencia,precioAlumno=0.00;
		
		System.out.println("Introduce el numero de alumnos");
		alumno=sc.nextInt();
		numeroBuses=alumno/60;
		if(alumno%60!=0){
			numeroBuses=numeroBuses+1;
		}
		precioBus=4000*numeroBuses;
		
		if(alumno>=100){
			precioAlumno=65+(precioBus/alumno);
		}else if(alumno>=50&&alumno<100){
			precioAlumno=70+(precioBus/alumno);
		}else if(alumno>=30&&alumno<50){
			precioAlumno=95+(precioBus/alumno);
		}else if(alumno<30){
			precioAlumno=100+(precioBus/alumno);
		}
		System.out.println("El precio por alumno es de "+precioAlumno+" euros");
		System.out.println("El precio total a la agencia es de "+precioAlumno*alumno);
		
		
	}
}