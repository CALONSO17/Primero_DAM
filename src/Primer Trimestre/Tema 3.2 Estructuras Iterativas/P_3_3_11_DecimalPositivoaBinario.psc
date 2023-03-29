Proceso P_3_3_11_DecimalPositivoaBinario
	Definir num como Real;
	Definir binario como cadena;
	Escribir "Dime un número";
	Leer num;
    num<-trunc(num);
	escribir num;
	binario<-"";
	
	Si num=0 Entonces
		binario<-"0";
	sino
		si num<0 entonces
			Escribir "El numero decimal introducido es negativo";
		finsi
	FinSi
	Mientras num>0 Hacer
		si (num mod 2) = 0 entonces
			binario<-Concatenar("0",binario);
		SiNo
			binario<-Concatenar("1",binario);
			
		FinSi
		num<-trunc(num/2);
	FinMientras
	Escribir "El número en binario es: ",binario;
FinProceso
