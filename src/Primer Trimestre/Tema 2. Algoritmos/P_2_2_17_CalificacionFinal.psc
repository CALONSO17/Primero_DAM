Proceso P_2_2_17_CalificacionFinal
	//Entorno
	Definir nota1,nota2,nota3,notaEvaluaciones,notaExamenFinal,notaTrabajo,notaFinal como Real;
	//Proceso 
	//Recogida de datos
	Escribir "Dígame la nota del primer trimestre:";
	Leer nota1;
	Escribir "Dígame la nota del segundo trimestre:";
	Leer nota2;
	Escribir "Dígame la nota del tercer trimestre:";
	Leer nota3;
	Escribir "Dígame la nota del trabajo final:";
	Leer notaTrabajo;
	Escribir "Dígame la nota del examen final:";
	Leer notaExamenFinal;
	
	//notaFinal<-(nota1+nota2+nota3)/3*0.55 + notaTrabajo*0.15+ notaExamenFinal*0.30//Aqui va mas resumido
	
	notaEvaluaciones<-(nota1+nota2+nota3)/3;
	notaEvaluaciones<- (notaEvaluaciones*55)/100;
	
	notaTrabajo<-(notaTrabajo*15)/100;
	
	notaExamenFinal<-(notaExamenFinal*30)/100;
	
	notaFinal<-notaEvaluaciones+notaTrabajo+notaExamenFinal;
	Escribir"La calificación final de la asignatura de Algoritmos es de ",notaFinal;
	
	
	
FinProceso
