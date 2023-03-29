Proceso P_3_3_2_ParoImpar
	//Entorno
	Definir num como Real;
	
	//Proceso 
	//Recogida de datos
	Escribir "Dígame un numero:";
	Leer num;
	
	num<- num mod 2;
	Si num=0 Entonces
		Escribir "El numero seleccionado es par";
	SiNo
		Escribir "El numero seleccionado es impar";
	FinSi
	
	
	
FinProceso
