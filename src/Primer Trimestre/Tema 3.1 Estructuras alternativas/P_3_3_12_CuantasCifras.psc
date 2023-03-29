Proceso P_3_3_12_CuantasCifras
	Definir numPositivo,numPositivo como Real;
	
	Escribir "Hola, dime un número:";
	Leer numPositivo;
	numPositivo<-abs(numPositivo);
	
	Si numPositivo>=0 Y numPositivo<10 Entonces
		Escribir "El número tiene 1 cifra.";
	SiNo
		Si numPositivo>9 Y numPositivo<100 Entonces
			Escribir "El número tiene 2 cifras.";
		SiNo
			Si numPositivo>99 Y numPositivo<1000 Entonces
				Escribir "El número tiene 3 cifras.";
			SiNo
				Si numPositivo>999 Y numPositivo<10000 Entonces
					Escribir "El número tiene 4 cifras.";
				SiNo
					Escribir "No te pases, el programa no da para tanto.";
				FinSi
			FinSi
		FinSi
	FinSi
	
FinProceso
