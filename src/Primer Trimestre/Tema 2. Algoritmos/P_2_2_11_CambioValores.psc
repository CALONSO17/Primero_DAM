Proceso P_2_2_11_CambioValores
	//Entorno

	Definir num1 como Real;
	Definir num2 como Real;
	Definir num1A como Real;
	//Proceso 
	//Entrada
	Escribir "Digame un número A";
	Leer num1;
	Escribir "Digame otro número B";
	Leer num2;
	
	num1A<-num1;
	num1<-num2;
	num2<-num1A;
	
	Escribir "Los valores invertidos son para A: ",num1," y para B ",num2;
	
	
	
FinProceso
