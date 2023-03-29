Proceso P_3_3_9_TablaMultiplicarCompleta
	Definir num, cont, resp, fallo como entero;
	Definir seguir como Caracter;
	seguir<-"S";

	
	Mientras Mayusculas(seguir)="S" Hacer
		Escribir "Dime un número, que vamos a repasar las tablas de multiplicar";
		Leer num;
		fallo<-0;
		Para cont<-1 Hasta 10 Con Paso 1 Hacer
			Escribir num,"x",cont,"="; sin saltar;
			Leer resp;
			Si resp=num*cont Entonces
				Escribir "Es correcto";
			siNo 
				escribir "Es incorrecto, la respuesta correcta es: ",num*cont;
				fallo<-fallo+1;
			FinSi
			Si fallo>2 Entonces
				cont<-0;
				fallo<-0;
				Escribir "Has fallado mas de dos veces, pruebe otra vez";
			FinSi
		FinPara
		Escribir"Has tenido: ",fallo," fallos.";
		Escribir "¿Seguir respasando?(S/N)";
		Leer seguir;
		FinMientras

FinProceso
