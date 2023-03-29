Proceso P_3_3_11_Ordenar3Numeros
	
	Definir num1,num2,num3,mayor,menor,intermedio como Real;
	
	Escribir "Hola, dime un número:";
	Leer num1;
	Escribir "Dime otro número:";
	Leer num2;
	Escribir "Diga un último número:";
	Leer num3;
	
	Si num1>=num2 Y num1>=num3 Entonces
		mayor<-num1;
	SiNo 
		si num2>=num1 Y num2>=num3 Entonces
			mayor<-num2;
		SiNo
			si num3>=num1 Y num3>=num2 Entonces
				mayor<-num3;
			FinSi
		FinSi
	FinSi
	Si num1>=num2 Y num1<=num3 O num1<=num2 Y num1>=num3 Entonces
		intermedio<-num1;
	SiNo 
		si num2>=num1 Y num2<=num3 O num2<=num1 Y num2>=num3 Entonces
			intermedio<-num2;
		SiNo
			si num3<=num1 Y num3>=num2 O num3>=num1 y num3<=num2 Entonces
				intermedio<-num3;
			FinSi
		FinSi
	FinSi
	Si num1<=num2 Y num1<=num3 Entonces
		menor<-num1;
	SiNo
		si num2<=num1 Y num2<=num3 Entonces
			menor<-num2;
		SiNo
			Si num3<=num1 Y num3<=num2 Entonces
				menor<-num3;
			FinSi
			
		FinSi
	FinSi
	
	Escribir "De mayor a menor serian: ",mayor," / ",intermedio," / ",menor;

	

FinProceso
