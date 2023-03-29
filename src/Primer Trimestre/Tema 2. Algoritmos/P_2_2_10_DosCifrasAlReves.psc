Proceso P_2_2_10_DosCifrasAlReves
	//entorno
	//Definir n como Entero;
	//Definir decenas, unidades como Caracter;
	//Escribir "Introduzca un numero de dos cifras";
	//leer n;
	//decenas<- Subcadena((ConvertirATexto(n)),0,0); para obtener el primer caracter de la cadena
	//unidades <-Subcadema((ConvertirATexto(n)),1,1); para obtener el segundo carácter de la cadena
	//Escribir "El numero inverso es ", Concatenar(unidades,decenas);
	//FinProceso
		
	definir num como Entero;
	Definir unidades como Entero;
	Definir decenas como Entero;
	//proceso
	Escribir "Introduca un numero de dos cifras";
	Leer num;
	Si num<100 Y num>0 Entonces
		unidades<-trunc(num/10);
		decenas<- num Mod 10;
		Escribir, decenas,unidades;
	SiNo
		Escribir "Por favor, solo dos cifras, cíñase al ejercicio";
	FinSi
	

FinProceso
