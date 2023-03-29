Proceso P_2_2_16_EurosYCentimos
	//Entorno
	Definir dosEuros,unEuro,totalEuros,aux como Entero;
	Definir cincuentaCentimos,veinteCentimos, diezCentimos,totalCentimos, aux2 como Entero;
	
	//Proceso
	//Entrada de datos
	Escribir "Monedas de 2 euros:";
	Leer dosEuros;
	Escribir "Monedas de 1 euro:";
	Leer unEuro;
	Escribir "Monedas de 50 céntimos:";
	Leer cincuentaCentimos;
	Escribir "Monedas de 20 céntimos:";
	Leer veinteCentimos;
	Escribir "Monedas de 10 centimos:";
	Leer diezCentimos;
	
	totalEuros<- dosEuros*2 + unEuro;
	totalCentimos<- (cincuentaCentimos*50)+(veinteCentimos*20)+(diezCentimos*10);
	aux<- trunc(totalCentimos/100);
	aux2<- totalCentimos mod 100;
	totalEuros<-totalEuros + aux;
	totalCentimos<-aux2;
	
	Escribir "Tienes un total de ",totalEuros,",",totalCentimos," euros.";

	
FinProceso
