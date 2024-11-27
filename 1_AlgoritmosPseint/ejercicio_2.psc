Algoritmo ejercicio_2 //Obj: Pasar velocidad en km/h a m/s.
	
	Definir velocidad Como Real
	
	//Conseguir la velocidad.
	Escribir "Introduce la velocidad de su automóvil (km/h):"
	Leer velocidad
	
	//Cáculo de km/h a m/s, 1000m=1km 1h=3600s.
	velocidad = (velocidad/1000)*3600
	
	Escribir "Su velocidad es " velocidad "m/s."
	
FinAlgoritmo