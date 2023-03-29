Proceso P_3_3_10VariableMayorMenor
	
	Definir num1,num2 como Real;
	Definir mayor, menor como Real;
	
	Escribir "Hola, dime un número:";
	Leer num1;
	Escribir "Dime ahora otro número:";
	Leer num2;
	
	Si num1<num2 Entonces
		mayor<-num2;
		menor<-num1;
		Escribir "El valor mayor es ",mayor," y el menor es ",menor;
	SiNo
		mayor<-num1;
		menor<-num2;
		Escribir "El valor mayor es ",mayor," y el menor es ",menor;
	FinSi
	si num1=num2 Entonces
		Escribir "Los dos números son iguales.";
	FinSi

	
FinProceso
