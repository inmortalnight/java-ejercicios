Algoritmo ejercicio_3 //Obj: calcular la nota media de las asignaturas
	
	Definir nota, total, media Como Real
	Definir cantidad Como Entero
	
	//Conseguir cantidad de notas.
	Escribir "Escribe la cantidad de notas a calcular:"
	Leer cantidad
	
	//Calcular total de notas.
	Para num<-1 Hasta cantidad Con Paso 1 Hacer
		Escribir "Introduce su nota:"
		Leer nota
		
		total = total + nota
	Fin Para
	
	//Calcular media.
	media = total/cantidad
	Escribir "Su media es " media
FinAlgoritmo