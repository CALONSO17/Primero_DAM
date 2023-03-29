Proceso P_3_3_10_AdivinaElNumero
	Definir num, numAleatorio como entero;
	numAleatorio<-azar(100);
	num<-0;
	

	Mientras numAleatorio<>num Hacer
		Escribir "Dime un número del 1 al 100";
		Leer num;
		si num>=100 Entonces
			Escribir "Inserte un número del 1 al 100";
		SiNo
			Si numAleatorio<num Entonces
				Escribir "El número es menor, pruebe otra vez";
			Sino 
				Escribir "El número es mayor, pruebe otra vez";
			FinSi
			
		FinSi
		
	FinMientras
	Escribir "Enhorabuena, el número es correcto";
	
	

FinProceso
