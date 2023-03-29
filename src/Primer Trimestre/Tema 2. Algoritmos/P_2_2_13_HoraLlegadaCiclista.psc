Proceso P_2_2_13_HoraLlegadaCiclista
	//Entorno
	Definir horaSalida,minutoSalida, aux, aux1,segundoSalida,segundoDistancia,horaLlegada,minutoLLegada,segundoLlegada como Entero;
	//Proceso
	//Entrada
	Escribir "Dígame la hora a la que sale";
	Leer horaSalida;
	Escribir "Dígame los minutos a los que sale";
	Leer minutoSalida;
	Escribir "Dígame los segundos a los que sale";
	Leer segundoSalida;
	Escribir "¿Cuántos segundos tarda en llegar a su destino?";
	Leer segundoDistancia;
	//segtotales<-hsalida*3600+minsalida*60+segSalida+segduracion;
	
	//minllegada<-trunc(segtotales/60);
	//segllegada<-segtotales mod 60;
	
	//hllegada<-trunc(minllegada/60);
	//minllegada<-minllegada mod 60;
	
	//Si hllegada >= 24 Entonces
		//hllegada<-hllegada-24;

	//FinSi
	
	horaLlegada<- (horaSalida*3600)+(minutoSalida*60)+segundoSalida+segundoDistancia;
	aux<-horaLlegada;
	horaLlegada<-trunc(horaLlegada/3600);
	aux<-horaLlegada mod 3600;
	
	minutoLlegada<- (minutoSalida*60) + segundoSalida + segundoDistancia;
	aux1<-minutoLlegada;
	minutoLlegada<-trunc (minutoLlegada/60);
	
	segundoLlegada<-segundoSalida + aux + aux1;
	
	Escribir horaLlegada," ",minutoLLegada," ", segundoLlegada;
	
FinProceso
