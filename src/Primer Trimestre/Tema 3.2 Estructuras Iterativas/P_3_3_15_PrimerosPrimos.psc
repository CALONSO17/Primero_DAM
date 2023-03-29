Proceso P_3_3_15_PrimerosPrimos
	Definir numVeces, cont,contar, i como Entero;
	Escribir "¿Cuantos números primos quieres ver?";
	Leer numVeces;
	i<-0;
	cont<-0;
	contar<-num;
	Mientras cont<num Hacer
		Para contar<-num Hasta 1 Con Paso -1 Hacer
			si num mod contar=0 Entonces
				i<-i+1;
				
			FinSi
		FinPara
		si i>2 y i<>2 entonces
			Escribir i;
		FinSi
		cont<-cont+1;
		
	FinMientras
	
	
FinProceso
