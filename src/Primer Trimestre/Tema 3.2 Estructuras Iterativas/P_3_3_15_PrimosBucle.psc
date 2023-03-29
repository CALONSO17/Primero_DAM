Proceso P_3_3_15_PrimosBucle
	Definir num, cont , contar como Entero;
	cont<-0;
	
	Escribir "Dime un número: ";
	Leer num;
	num<-abs(num);
	contar<-num;
	Para contar<-num Hasta 1 Con Paso -1 Hacer
		si num mod contar=0 Entonces
			cont<-cont+1;
		FinSi
	FinPara
	si cont=2 entonces
		Escribir "El numero es primo";
	SiNo
		Escribir "No es primo";
	FinSi
FinProceso