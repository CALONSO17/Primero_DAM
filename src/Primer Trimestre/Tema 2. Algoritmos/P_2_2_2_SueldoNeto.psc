Proceso P_2_2_2_SueldoNeto
	//Entorno
	Definir nombre como Caracter;
	Definir sueldoBruto como Real;
	Definir sueldoNeto como Real;
	Definir irpf como Real;
	Definir seguridadSocial como Real;
	//Proceso
	//Entrada de datos
	Escribir "Introducir nombre de empleado";
	Leer nombre;
	Escribir "Introducir sueldo bruto";
	Leer sueldoBruto;
	irpf<-(sueldoBruto*21)/100;
	seguridadSocial<-(sueldoBruto*5.2)/100;
	sueldoNeto<-sueldoBruto-irpf-seguridadSocial;
	Escribir "Tu salario neto será ",sueldoNeto," euros.";
	
FinProceso
