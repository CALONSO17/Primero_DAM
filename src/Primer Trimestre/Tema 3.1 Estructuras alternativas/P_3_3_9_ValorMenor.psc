Proceso P_3_3_9_ValorMenor
	
	Definir num1,num2,num3,num4,num5, menor como Real;
	
	Escribir "Hola, dime un número:";
	Leer num1;
	Escribir "Dime otro número:";
	Leer num2;
	Escribir "Dime otro número:";
	Leer num3;
	Escribir "Dime otro número:";
	Leer num4;
	Escribir "Dime el último número:";
	Leer num5;
	si num1<num2 Y num1<num3 Y num1<num4 Y num1<num5 Entonces
		menor<-num1;
	Sino 
		si num2<num1 Y num2<num3 Y num2<num4 Y num2<num5 Entonces
			menor<-num2;
		SiNo
			si num3<num1 Y num3<num2 Y num3<num4 Y num4<num5 Entonces
				menor<-num3;
			SiNo
				si num4<num1 Y num4<num2 Y num4<num3 Y num4<num5 Entonces
					menor<-num4;
				SiNo
					si num5<num1 Y num5<num2 Y num5<num3 Y num5<num4 Entonces
					menor<-num5;
				FinSi
			FinSi
		FinSi
	FinSi
	Finsi
	Escribir "El numero menor es ",menor;
	
	
	
FinProceso
