Proceso P_3_3_5_Aceptado
	
	Definir nota como Real;
	Definir edad como Entero;
	Definir genero como Caracter;
	
	Escribir "Hola, dime la nota que has sacado:";
	Leer nota;
	Escribir "Ahora dime tu edad.";
	Leer edad;
	Escribir "Eres hombre (M) o mujer (F)";
	Leer genero;
	
	
	Si (nota>=5) Y (edad>=18) Entonces
		Si Mayusculas(genero)="M" Entonces //Entrecomillar el contenido que queremos que reconozca, si no se piensa que es otra variable
			Escribir "ACEPTADO";
		sino 
			Escribir "ACEPTADA";
		FinSi
	SiNo
		Escribir "NO ACEPTADO/A";
	FinSi
	
	
	
FinProceso
