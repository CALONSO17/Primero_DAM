Proceso P_2_2_14_InicialesDeNombres
	//Entorno
	Definir nombre,apellido1,apellido2 Como Caracter;
	Definir inicialNombre,inicialApellido1,inicialApellido2 Como Caracter;
	//Proceso 
	//Entrada de datos
	Escribir"Buenos dias, dígame su Nombre:";
	Leer nombre;
	Escribir"Buenos dias, dígame su primer Apellido:";
	Leer apellido1;
	Escribir"Buenos dias, dígame su segundo Apellido:";
	Leer apellido2;
	
	inicialNombre<-Mayusculas(SubCadena(nombre,0,0));//Si fuera 0,1 seria Ca, si fuera 0,2 pondria Car, si fuera 1,1 seria A
	inicialApellido1<-Mayusculas(SubCadena(apellido1,0,0));
	inicialApellido2<-Mayusculas(SubCadena(apellido2,0,0));
	
	Escribir "Las iniciales del nombre son ",inicialNombre,".",inicialApellido1,".",inicialApellido2;
	
FinProceso
