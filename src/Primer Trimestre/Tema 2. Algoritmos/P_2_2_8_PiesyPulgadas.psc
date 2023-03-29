Proceso P_2_2_8_PiesyPulgadas
	//Entorno
	Definir pies como Real;
	Definir pulgadas como Real;
	Definir yardas como Real;
	Definir metros como Real;
	Definir millas como real;
	
	//Proceso
	//obtener datos
	Escribir "Dígame el numero de pies";
	Leer pies; 
	//calculos
	yardas<-pies/3;
	pulgadas<-pies*12;
	metros<-pulgadas*0.0254;
	millas<-metros/1609;
	//Salida
	Escribir pies," pies corresponden a ",pulgadas," pulgadas, ",yardas," yardas, ",metros," metros y ",millas," millas.";
	
FinProceso
