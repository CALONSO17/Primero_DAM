Proceso P_3_3_10_AdivinaElNumero
	Definir num, numAleatorio como entero;
	numAleatorio<-azar(100);
	num<-0;
	

	Mientras numAleatorio<>num Hacer
		Escribir "Dime un n�mero del 1 al 100";
		Leer num;
		si num>=100 Entonces
			Escribir "Inserte un n�mero del 1 al 100";
		SiNo
			Si numAleatorio<num Entonces
				Escribir "El n�mero es menor, pruebe otra vez";
			Sino 
				Escribir "El n�mero es mayor, pruebe otra vez";
			FinSi
			
		FinSi
		
	FinMientras
	Escribir "Enhorabuena, el n�mero es correcto";
	
	

FinProceso
