Proceso P_2_2_12_Minutos
	//Entorno
	Definir minuto como Entero;
	Definir minRestante como Entero;
	Definir hora como Entero;
	//Proceso 
	//Entrada de datos
	Escribir "Digame el numero de minutos que desea convertir a Horas y Minutos";
	Leer minuto;
	
	hora<-trunc(minuto/60);
	minRestante<-minuto mod 60;
	Escribir "El resultado son ",hora," horas y ",minRestante, " minutos";
	
	
FinProceso
