Proceso P_2_2_5_RaizCuadrada
	//Entorno
	Definir dato como Real;
	//Proceso
	Escribir "Diga un número";
	Leer dato;
	//Esto en caso de que quisieramos controlar si nos pusieran un numero negativo.
	//Si dato>=0 Entonces
	   //	Escribir"La raiz cuadrada de ",dato," es ",raiz(dato);
	//SiNo
	   //	Escribir"No puedo hacer la raiz cuadrada de un número negativo";
	//FinSi
	Escribir "La raiz cuadrada de ",dato," es ",raiz(dato);
FinProceso
