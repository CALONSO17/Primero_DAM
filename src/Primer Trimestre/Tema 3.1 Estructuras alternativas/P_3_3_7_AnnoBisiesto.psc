Proceso P_3_3_7_AnnoBisiesto
	
	Definir anno como Entero;
	
	Escribir "Hola, dime un año";
	Leer anno;
	
	Si (anno mod 4 )=0 Y (anno mod 100)<>0 O (anno mod 400)=0  Entonces
		Escribir "El año es bisiesto";
	SiNo
		Escribir "El año no es bisiesto";
	FinSi
	
FinProceso
