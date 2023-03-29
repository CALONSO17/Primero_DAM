Proceso P_2_2_9_ValorAbsoluto
	//Entorno
	Definir num1 como Real;
	Definir num2 como Real;
	Definir valorAbsoluto como Real;
	//Proceso
	//obtener datos
	Escribir "Por favor, inserte un número";
	Leer num1;
	Escribir "Por favor, inserte otro número";
	Leer num2;
	
	
	//operacion
	valorAbsoluto<-num1-num2;
	//valorAbsoluto<-abs(num1-num2);
	Si valorAbsoluto<0 Entonces
		valorAbsoluto<--valorAbsoluto;
		Escribir "El valor Absoluto de la direfencia de ",num1," y ", num2," es ",valorAbsoluto;
		
	SiNo
		Escribir "El valor Absoluto de la direfencia de ",num1," y ", num2," es ",valorAbsoluto;
	FinSi
	
	
FinProceso
