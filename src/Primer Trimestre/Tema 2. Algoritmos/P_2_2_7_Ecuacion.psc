Proceso P_2_2_7_Ecuacion
	//Entrada
	Definir a como Real;
	Definir b como Real;
	Definir c como Real;
	Definir x1 como Real;
	Definir x2 como Real;
	//Proceso
	Escribir "Por favor, d�game el valor de a";
	Leer a;
	Escribir "Por favor, d�game el valor de b";
	Leer b;
	Escribir "Por favor, d�game el valor de c";
	Leer c;
	//Operaci�n
	Si a<>0 Entonces
		Si (b^2-4*a*c)>=0 Entonces
			x1<-(-b+(raiz(b^2-4*a*c)))/2;
			x2<-(-b-(raiz(b^2-4*a*c)))/2;
			Escribir "La soluci�n a su ecuaci�n es ",x1," y ",x2;
		SiNo
			Escribir "Lo siento, no se puede realizar la operaci�n";
		FinSi

		
	SiNo
		Escribir "El valor de a no puede ser 0";
	FinSi
	
	
FinProceso
