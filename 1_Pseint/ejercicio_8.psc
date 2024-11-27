Algoritmo ejercicio_8 //Obj: analizar 10 números, sacer cantidad pares, suma de pares, promedio impares.
	
	Definir numero1, num_par, total_par Como Entero
	Definir media_impar, num_impar, total_impar como Real

	Para num<-1 Hasta 10 Con Paso 1 Hacer
		//Conseguir los números.
		Escribir "Introduzca su número:"
		Leer numero1
		Si numero1%2 == 0 Entonces //Par, la cantidad y suma.
			num_par = num_par + 1
			total_par = total_par + numero1
		SiNo //Impar, la cantidad y suma.
			num_impar = num_impar + 1
			total_impar = total_impar + numero1
		Fin Si
	Fin Para
	Escribir total_impar "   " num_impar
	
	//Cálculo promedio de los impares, activo cuando hay impares, de 1 uso.
	Mientras num_impar > 0 Hacer
		media_impar = total_impar/num_impar
		num_impar = 0
	Fin Mientras
	
	Escribir "Hay " num_par " números pares con una suma de " total_par " y el promedio de los números impares es " media_impar " ."
FinAlgoritmo