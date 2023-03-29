Proceso P_3_3_2_FechaCorrecta
	Definir dia, mes, anno como Entero;
	Definir correcto Como Logico;
	correcto<-falso;
	Mientras correcto=falso Hacer
		Escribir "Dime el dia";
		Leer dia;
		Escribir "Dime el mes";
		Leer mes;
		Escribir "Dime el año";
		Leer anno;
		si (mes>=1 y mes<=12) Entonces
			Segun mes Hacer
				1,3,5,7,8,10,12:
					si dia<=31 y dia>=1 Entonces
						correcto<-verdadero;
					FinSi
				4,6,9,11:
					Si dia<=30 y dia>=1 Entonces
						correcto<-verdadero;
					FinSi
				2: si (anno mod 4 )=0 Y (anno mod 100)<>0 O (anno mod 400)=0  Entonces
						Si dia<=29 y dia>=1 Entonces
							correcto<-verdadero;
						SiNo
							si dia<=28 y dia>=1 Entonces
								correcto<-verdadero;
							FinSi
						FinSi
					FinSi
				
				De Otro Modo:
					correcto<-falso;
			FinSegun
		SiNo
			Escribir "¡Fecha incorrecta! Introduzca bien los datos";
		FinSi
	FinMientras
	Escribir "La fecha ",dia,"/",mes,"/",anno," es correcta";
FinProceso
