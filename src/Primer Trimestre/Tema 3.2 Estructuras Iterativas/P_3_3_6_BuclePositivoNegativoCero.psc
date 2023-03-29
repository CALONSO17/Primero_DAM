Proceso P_3_3_6_BuclePositivoNegativoCero
	
	Definir positivo, negativo, cero, num Como Entero;
	Definir respuesta como Caracter;
	
	positivo<-0;
	negativo<-0;
	cero<-0;
	
	Repetir
		Escribir "Escribe un numero entero.";
		Leer num;
		si num>0 Entonces
			Escribir "El número es positivo";
			positivo<-positivo+1;
		sino 
			si num<0 Entonces
				Escribir "El numero es negativo";
				negativo<-negativo+1;
			SiNo
				Escribir "El número es 0";
				cero<-cero+1;
			FinSi
			
		FinSi
		Escribir"¿Quieres terminar?(S/N)";
		Leer respuesta;
	Hasta Que Mayusculas(respuesta) = "S";
Escribir "Has puesto ", positivo," positivos ",negativo," negativos y ",cero," ceros";
	
FinProceso
