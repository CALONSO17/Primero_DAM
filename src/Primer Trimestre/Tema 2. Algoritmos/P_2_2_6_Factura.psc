Proceso P_2_2_6_Factura
	//Entorno
	Definir nombreArticulo como Caracter;
	Definir precioBruto como Real;
	Definir numeroUnidades como Entero;
	//Proceso 
	Definir iva como Real;
	Definir ivaTotal como Real;
	Definir precioTotal como Real;
	Definir totalFactura como Real;
	
	Escribir "Buenos dias, digame el nombre del art�culo que desea";
	Leer nombreArticulo;
	Escribir"Perfecto, �cuantas unidades necesita?";
	Leer numeroUnidades;
	Escribir "�Cual es el precio del art�culo seleccionado?";
	Leer precioBruto;
	
	iva<-precioBruto*19/100;
	ivaTotal<-iva*numeroUnidades;
	precioTotal<-numeroUnidades*precioBruto;
	totalFactura<-precioTotal+ivaTotal;
	
	Escribir"                                  SU FACTURA                             ";
	Escribir"ART�CULO       Precio Unidad       Cantidad        Total Art�culo";
	Escribir nombreArticulo,"            ",precioBruto,"               ",numeroUnidades,"                ",precioTotal;
	Escribir "El IVA(19%) es de ", ivaTotal;
	Escribir "TOTAL FACTURA   ",totalFactura;
	
	
	
	//Entrada de datos
FinProceso
