Proceso P_3_3_3_Division
	Definir num1,num2,resultado como Real;
	
	Escribir "Por favor, inserte un n�mero.";
	Leer num1;
	Escribir "Ahora insterte otro n�mero.";
	Leer num2;
	Si num2=0 Entonces
		Repetir
			Escribir "El segundo numero no puede ser 0";
			Escribir "Por favor, inserte un n�mero.";
			Leer num1;
			Escribir "Ahora insterte otro n�mero.";
			Leer num2;
		Hasta Que num2<>0;
	resultado<-num1/num2;
	Escribir "El resultado de la divisi�n de ambos n�meros es:",resultado;
	FinSi
	
	
FinProceso
