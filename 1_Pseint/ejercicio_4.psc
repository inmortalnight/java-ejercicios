Algoritmo ejercicio_4 //Obj: Saludar seg�n el g�nero.
	
	Definir nombre Como Caracter
	Definir genero Como Real
	
	//Conseguir nombre y g�nero.
	Escribir "Introduzca su nombre:"
	Leer nombre
	Escribir "Seleccione su g�nero: mujer(1), hombre(2), otro(3)"
	Leer genero
	
	//Saludos seg�n el g�nero.
	Segun genero Hacer
		1:
			Escribir "Bienvenida " nombre
		2:
			Escribir "Bienvenido " nombre
		3:
			Escribir "Hola " nombre
		De Otro Modo:
			Escribir "Por favor, introduzca una selecci�n v�lida."
	Fin Segun
	
FinAlgoritmo