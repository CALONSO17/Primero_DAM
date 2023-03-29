Proceso P_3_3_14_Menu
	Definir seleccion como Caracter;
	Repetir
		Escribir "El Corte Ingles";
		Escribir "----------------";
		Escribir"Elija entre una de estas opciones:";
		Escribir"[1] Hablar con Atencion al Cliente";
		Escribir"[2] Hablar con Seguros ECI";
		Escribir"[3] Hablar con Cambios y Devoluciones";
		Escribir"[4] Hablar con Reclamaciones";
		Escribir"[5] Salir";
		Leer seleccion;
		si seleccion<>ConvertirATexto(1) y seleccion <>ConvertirATexto(2) y seleccion<>ConvertirATexto(3) y seleccion<>ConvertirATexto(4) y seleccion<>ConvertirATexto(5) Entonces
			Escribir "Seleccione una opcion del menu";
		FinSi
	Hasta Que seleccion="5";
	
	
	
FinProceso
