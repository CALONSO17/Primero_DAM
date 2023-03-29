Proceso P_3_3_4_Potencia
	
	Definir exponente como Entero;
	Definir base como Real;
	Definir potencia como Real;
	
	Escribir "Dime la base de la potencia:";
	Leer base;
	Escribir "Dime el exponente de la potencia:";
	Leer exponente;
	potencia<-base ^ exponente;
	
	Si exponente=0 entonces
		Escribir "El resultado es 1";
	SiNo
		Si exponente>0 Entonces
			Escribir "El resultado es :",potencia;
		sino 
			potencia<-1/(base ^ exponente);
			Escribir "El resulatdo es: ",potencia;
		FinSi
	FinSi
	
	
FinProceso
