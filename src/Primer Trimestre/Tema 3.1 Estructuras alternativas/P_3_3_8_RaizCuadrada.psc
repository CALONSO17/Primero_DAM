Proceso P_3_3_8_RaizCuadrada
	
	Definir num como Real;
	Definir resultado como Real;
	
	Escribir "Hola, digame un n�mero";
	Leer num;
	
	
	Si num<0 Entonces
		Repetir
			Escribir "No se puede hacer la raiz cuadrada de un n�mero negativo";
			Escribir "Hola, digame un n�mero";
			Leer num;
			resultado<-raiz(num);
			Escribir "La raiz cuadrada de ",num," es ",resultado;
		Hasta Que num>=0;
		
	SiNo 
		resultado<-raiz(num);
		Escribir "La raiz cuadrada de ",num," es ",resultado;
	FinSi
	
FinProceso
