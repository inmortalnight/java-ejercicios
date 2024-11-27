Algoritmo ejercicio_1 //Obj: Introducir números enteros positivos y ver si son primos o no.
	
	Definir numero1 Como Entero
	
	//Conseguir número bajo restricciones.
	Escribir "Vea si su número es primo o no (restringido a números positivos hasta 100)."
	Escribir "Introduzca su número:"
	Leer numero1
	
	//Asegurar que sea entero positivo
	Si numero1>0 Entonces
		//Ver si es primo o no
		Si numero1==2 o numero1==3 o numero1==5 o numero1==7 o numero1==11 o numero1==13 o numero1==19 o numero1==23 o numero1==29  o numero1==31 o numero1==37 o numero1==41 o numero1==43 o numero1==47 o numero1==53 o numero1==59 o numero1==61 o numero1==67 o numero1==71 o numero1==73 o numero1==79 o numero1==83 o numero1==89 o numero1==97 Entonces
			Escribir "Su número es primo."
		SiNo
			Escribir "Su número no es primo."
		FinSi
	SiNo
		Escribir "Número no válido."
	Fin Si
	
FinAlgoritmo