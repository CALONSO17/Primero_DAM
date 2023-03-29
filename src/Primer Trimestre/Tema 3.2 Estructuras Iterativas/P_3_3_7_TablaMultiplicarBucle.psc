Proceso P_3_3_7_TablaMultiplicarBucle	
	Definir num, cont, resp como entero;
	Definir seguir como Caracter;
	seguir<-"S";
	Mientras Mayusculas(seguir)="S" Hacer
		Escribir "Dime un número, que vamos a repasar las tablas de multiplicar";
		Leer num;
		Para cont<-1 Hasta 10 Con Paso 1 Hacer
			Escribir num,"x",cont,"="; sin saltar;
			Leer resp;
			Si resp=num*cont Entonces
				Escribir "Es correcto";
			siNo 
				escribir "Es incorrecto, la respuesta correcta es: ",num*cont;
			FinSi
		FinPara
		Escribir "¿Seguir respasando?(S/N)";
		Leer seguir;
	FinMientras
	

FinProceso
