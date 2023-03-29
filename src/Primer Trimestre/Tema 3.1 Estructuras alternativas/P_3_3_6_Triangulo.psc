Proceso P_3_3_6_Triangulo
	
	Definir a,b,c como Real;
	
	Escribir "Hola, vamos a adivinar el tipo de triágulo que es";
	Escribir "Dime un lado:";
	Leer a;
	Escribir "Dime otro lado:";
	Leer b;
	Escribir "Dime el último lado:";
	Leer c;
	
	Si (a^2=b^2+c^2)O(b^2=c^2+a^2)O(c^2=a^2+b^2) Entonces
		Escribir "Es un triángulo rectángulo.";
		
	FinSi
	Si (a=b) Y (a=c) Entonces
		Escribir "Es un triángulo equilátero";
	SiNo
		Si (a=b) Y (a<>c) O (a<>b) Y (a=c) O (b=c) Entonces
			Escribir "El triángulo es isósceles";
		SiNo
			Escribir "El triangulo es escaleno";
		FinSi
		
	FinSi
	
	
FinProceso
