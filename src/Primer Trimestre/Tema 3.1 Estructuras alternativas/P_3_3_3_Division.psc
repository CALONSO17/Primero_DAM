Proceso P_3_3_3_Division
	Definir num1,num2,resultado como Real;
	
	Escribir "Por favor, inserte un número.";
	Leer num1;
	Escribir "Ahora insterte otro número.";
	Leer num2;
	Si num2=0 Entonces
		Repetir
			Escribir "El segundo numero no puede ser 0";
			Escribir "Por favor, inserte un número.";
			Leer num1;
			Escribir "Ahora insterte otro número.";
			Leer num2;
		Hasta Que num2<>0;
	resultado<-num1/num2;
	Escribir "El resultado de la división de ambos números es:",resultado;
	FinSi
	
	
FinProceso
