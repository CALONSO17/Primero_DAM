Proceso P_2_2_15_TestRespuestasAcertadas
	//Entorno
	Definir totalPreguntas como Entero;
	Definir notasCorrectas Como Entero;
	Definir notasIncorrectas como Real;
	Definir notasblanco como Real;
	Definir notaFinal como Real;
	Definir notaSobreTotal como Real;
	
	//Proceso 
	//Entrada de datos
	Escribir "¿Cuantas has respondido correctamente?";
	Leer notasCorrectas;
	Escribir "¿Cuantas son incorrectas?";
	Leer notasIncorrectas;
	Escribir "¿Cuantas preguntas has dejado en blanco?";
	Leer notasblanco;
	
	totalPreguntas<-notasCorrectas+notasIncorrectas+notasblanco;
	notaSobreTotal<- notasCorrectas-0.25*notasIncorrectas;
	notaFinal<-(notasCorrectas-0.25*notasIncorrectas)*10/totalPreguntas;
	Escribir "Has sacado un ",notaSobreTotal," sobre ",totalPreguntas;
	Escribir "La nota sobre 10 seria: ",notaFinal;
	
	
FinProceso
