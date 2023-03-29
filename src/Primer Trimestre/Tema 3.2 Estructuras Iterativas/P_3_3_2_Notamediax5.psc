Proceso P_3_3_2_Notamediax5
	Definir nombre como Caracter;
	Definir intento como Entero;
	Definir notaMedia,nota1,nota2,nota3,acc como Real;
	
	acc<-0;
	
	Para intento<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "Introduzca nombre del alumno:";
		Leer nombre;
		Escribir "Introduzca la nota de la Primera Evaluación";
		Leer nota1;
		Escribir "Introduzca la nota de la Segunda Evaluación";
		Leer nota2;
		Escribir "Introduzca la nota de la Tercera Evaluación";
		Leer nota3;
		notaMedia <-(nota1+nota1+nota3)/3;
		Escribir "La nota media del alumno ",nombre," es ",notaMedia;
		acc<-acc+notaMedia;
		
	FinPara
	Escribir"La nota media del grupo completo es de: ",acc/5;
	
FinProceso
