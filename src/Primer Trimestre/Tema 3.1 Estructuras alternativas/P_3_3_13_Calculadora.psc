Proceso P_3_3_13_Calculadora
	Definir num1,num2, resultado como Entero;
	Definir operacion como Cadena;
	
	Escribir "Hola, dime un número";
	Leer num1;
	Escribir "Dime otro número";
	Leer num2;
	Escribir "¿Que operación desea hacer?¿Desea suma, resta, multiplicacion o division?";
	Leer operacion;
	
	Si minusculas(operacion)="suma" Entonces
		resultado<-num1+num2;
		Escribir "El resultado de la ",operacion," es: ",resultado;
	SiNo
		Si minusculas(operacion)="resta" Entonces
			resultado<-num1-num2;
			Escribir "El resultado de la ",operacion," es: ",resultado;
		SiNo
			si minusculas(operacion)="multiplicacion" Entonces
				resultado<-num1*num2;
				Escribir "El resultado de la ",operacion," es: ",resultado;
			SiNo
				si minusculas(operacion)="division" Entonces
					resultado<-num1/num2;
					Escribir "El resultado de la ",operacion," es: ",resultado;
				SiNo
					Escribir "Escriba la operacion correctamente";
				
				FinSi
			FinSi
		FinSi
	FinSi
	

FinProceso
