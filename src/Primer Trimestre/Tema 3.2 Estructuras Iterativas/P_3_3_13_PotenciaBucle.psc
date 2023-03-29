Proceso P_3_3_13_PotenciaBucle
	Definir base, exponente, potencia, acc , contar como Entero;
	acc<-1;
	Escribir "Vamos a hacer una potencia, dime la base";
	Leer base;
	Escribir "Dime el exponente";
	Leer exponente;
	Mientras exponente<=0 Hacer
		Escribir "El número tiene que ser positivo, prueba otra vez";
		Escribir "Vamos a hacer una potencia, dime la base";
		Leer base;
		Escribir "Dime el exponente";
		Leer exponente;
	FinMientras
	Para contar<- 1 Hasta exponente Con Paso 1 Hacer
	acc<-base*acc;
	FinPara
	Escribir acc;
FinProceso
