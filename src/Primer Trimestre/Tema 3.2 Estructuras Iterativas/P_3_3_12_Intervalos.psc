Proceso P_3_3_12_Intervalos
	Definir numInf, numSup, num,cont, acc como Entero;
	Definir mismoLimite Como Logico;
	cont<-0;
	acc<-0;
	mismoLimite<-Falso;
	Repetir
		Escribir "Dime un n�mero";
		Leer numInf;
		Escribir "Dime un n�mero mayor que el anterior";
		Leer numSup;
		si numInf>numSup Entonces
			Escribir "El primer n�mero tiene que ser menor";
		FinSi
	Hasta Que numInf<numSup;
	
	Repetir
		Escribir "Vamos alla! Dime un n�mero";
		Leer num;
		Si num<numSup Y num>numInf Entonces
			acc<-acc+num;
		sino
			Si num<=numInf O num>=numSup Entonces
				cont<-cont+1;
			FinSi
		FinSi
		Si num=numSup o num=numInf Entonces
			MismoLimite<-Verdadero;
			
		FinSi
	Hasta Que num=0;
	
	Escribir"La suma de n�meros dentro del intervalo es de: ",acc;
	Escribir" Has escrito ",cont," numeros fuera del intervalo";
	Si mismoLimite=Verdadero Entonces
		Escribir "Alguno de los n�meros que has introducido es el mismo que los extremos del l�mite";
	FinSi
	
	
FinProceso
