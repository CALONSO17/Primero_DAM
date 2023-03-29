Proceso P_3_3_1_PositivoNegativooCero
	//Entorno
	Definir num como Real;
	//Proceso 
	//Entrada de datos
	Escribir "Digame un número:";
	Leer num;
	
	Si num=0 Entonces
		Escribir "El número es 0.";
	SiNo
		Si num<0 Entonces
			Escribir "El número es negativo.";
		SiNo
			Escribir "El número es positivo.";
		FinSi
	FinSi

FinProceso
