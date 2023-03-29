Proceso P_3_3_14_DiaDeLaSemana
	Definir numSemana como Entero;
	
	Escribir "Dime el número del dia de la semana que es:";
	Leer numSemana;
	
	Si numSemana=1 Entonces
		Escribir "¡Es Lunes!";
		sino
			si numSemana=2 Entonces
				Escribir "¡Es Martes!";
			sino 
				si numSemana=3 Entonces
					Escribir "!Es miércoles!";
				SiNo
					si numSemana=4 Entonces
						Escribir "!Es Jueves!";
					SiNo
						si numSemana=5 Entonces
							Escribir "¡¡Es Viernes!!";
						SiNo
							si numSemana=6 Entonces
								escribir "!Es Sabado!";
							SiNo
								si numSemana=7 Entonces
									escribir "!Es Domingo!";
								SiNo
									Escribir "ERROR";
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	
	
FinProceso
