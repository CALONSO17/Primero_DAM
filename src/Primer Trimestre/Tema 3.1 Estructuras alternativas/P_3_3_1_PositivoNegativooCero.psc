Proceso P_3_3_1_PositivoNegativooCero
	//Entorno
	Definir num como Real;
	//Proceso 
	//Entrada de datos
	Escribir "Digame un n�mero:";
	Leer num;
	
	Si num=0 Entonces
		Escribir "El n�mero es 0.";
	SiNo
		Si num<0 Entonces
			Escribir "El n�mero es negativo.";
		SiNo
			Escribir "El n�mero es positivo.";
		FinSi
	FinSi

FinProceso
