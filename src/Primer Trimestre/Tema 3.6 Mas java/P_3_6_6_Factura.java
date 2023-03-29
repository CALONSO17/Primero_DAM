import java.util.Scanner;
public class P_3_6_6_Factura{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double importe,totalImporte,ivaDelImporte,totalIvaDelImporte;
		totalImporte=0.0;
		int iva;
		ivaDelImporte=0.0;
		totalIvaDelImporte=0.0;
		do{
			System.out.println("Dime un importe");
			System.out.println("Pulse 0 cuando decidas terminar");
			importe = sc.nextDouble();
			totalImporte=totalImporte+importe;
			do{
			System.out.println("Dime su IVA(4,7 o 16)");
			iva=sc.nextInt();
			}while(iva!=4 && iva!=7 && iva!=16);
			ivaDelImporte=(importe*iva)/100;
			totalIvaDelImporte=totalIvaDelImporte+ivaDelImporte;
			
			
		}while(importe!=0);
		
		if(totalImporte>=1000 && totalImporte<10000){
			totalImporte=totalImporte*0.95;
			totalIvaDelImporte=totalIvaDelImporte*0.95;
		}else if(totalImporte>=10000){
			totalImporte=totalImporte*0.9;
			totalIvaDelImporte=totalIvaDelImporte*0.9;	
		}
		System.out.println("El importe total es: "+totalImporte);
		System.out.println("El iva correspondiente es de: "+totalIvaDelImporte);
		System.out.println("En total es: "+(totalImporte+totalIvaDelImporte));
		
	}
	
}