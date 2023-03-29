Algoritmo P_2_1_1_1_notaMedia
	//Entorno
	Definir nombre como Caracter;
	Definir nota1,nota2,nota3 como Entero;
	Definir notaMedia como Real;
	//Proceso
	//Entrada de datos
	Escribir "Introduzca nombre del alumno:";
	Leer nombre;
	Escribir "Introduzca la nota de la Primera Evaluación";
	Leer nota1;
	Escribir "Introduzca la nota de la Segunda Evaluación";
	Leer nota2;
	Escribir "Introduzca la nota de la Tercera Evaluación";
	Leer nota3;
	//Hacer el cálculo de la nota media y asignarlo a media
	notaMedia<-(nota1+nota2+nota3)/3;
	//Salida de programa
	Escribir "La nota media del alumno ",nombre," es ",notaMedia;
FinAlgoritmo
