Algoritmo ejercicio_4 //Obj: Saludar según el género.
	
	Definir nombre Como Caracter
	Definir genero Como Real
	
	//Conseguir nombre y género.
	Escribir "Introduzca su nombre:"
	Leer nombre
	Escribir "Seleccione su género: mujer(1), hombre(2), otro(3)"
	Leer genero
	
	//Saludos según el género.
	Segun genero Hacer
		1:
			Escribir "Bienvenida " nombre
		2:
			Escribir "Bienvenido " nombre
		3:
			Escribir "Hola " nombre
		De Otro Modo:
			Escribir "Por favor, introduzca una selección válida."
	Fin Segun
	
FinAlgoritmo