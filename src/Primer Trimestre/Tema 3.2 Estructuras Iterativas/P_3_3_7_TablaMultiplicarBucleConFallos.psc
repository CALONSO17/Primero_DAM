Proceso P_3_3_8_TablaMultiplicarBucleConFallos
	Definir num, cont, resp, fallo como entero;
	Definir seguir como Caracter;
	seguir<-"S";
	fallo<-0;
	
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
				fallo<-fallo+1;
			FinSi
		FinPara
		Escribir"Has tenido: ",fallo," fallos.";
		Escribir "¿Seguir respasando?(S/N)";
		Leer seguir;
	FinMientras
	
FinProceso
