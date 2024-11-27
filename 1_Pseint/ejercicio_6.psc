Algoritmo ejercicio_6 //Obj: Pasar de días a año, meses, semanas, días.
	
	Definir inicio_dias, año, mes, mes_resto, semana, año_resto, semana_resto, dias_resto Como Entero

	//Conseguir la cantidad de días.
	Escribir "Pasar de días a tiempo de calendario (resultados relativos)"
	Escribir "Introduzca la cantidad de días a cambiar:"
	Leer inicio_dias

	//Pasar de días a otros:
	
	//Cuando los inicio_días > un año.
	Si inicio_dias >= 365
		//Cálculo de años.
		año_resto = inicio_dias%365
		año = (inicio_dias - año_resto)/365
		Si año_resto >= 30 //Cuando inicio_dias - año = mes/es
			mes_resto = año_resto%30
			mes = (año_resto - mes_resto)/30
			Si mes_resto >= 7 //Cuando año/s - mes/ses = semanas.
				semana_resto = mes_resto%7
				semana = (mes_resto - semana_resto)/7
				dias_resto = semana_resto
			SiNo //Cuando año/s - mes/es = días.
				dias_resto = mes_resto
			FinSi
		SiNo 
			Si año_resto >= 7 //Cuando inicio_dias - año/s = semanas. 
				semana_resto = año_resto%7
				semana = (año_resto - semana_resto)/7
				dias_resto = semana_resto
			SiNo //Cuando inicio_dias - año/s = días.
				dias_resto = año_resto
			FinSi
		FinSi
	FinSi
	
	//Cuando inicio_dias < año pero inicio_dias >= un mes.
	Si 30 <= inicio_dias y inicio_dias < 365 
		//Cálculo de meses y resto.
		mes_resto = inicio_dias%30
		mes = (inicio_dias - mes_resto)/30
		Si mes_resto >= 7 //Cuando inicio_dias - mes/ses = semanas.
			semana_resto = mes_resto%7
			semana = (mes_resto - semana_resto)/7
			dias_resto = semana_resto
		SiNo //Cuando inicio_dias - mes/es = días.
			dias_resto = mes_resto
		FinSi
	FinSi
	
	//Cuando inicio_dias < un mes pero inicio_dias >= una semana.
	Si 7 <= inicio_dias y inicio_dias < 30
		semana_resto = inicio_dias%7
		semana = (inicio_dias - semana_resto)/7
		dias_resto = semana_resto
	FinSi
	
	//Cuando inicio_dias < una semana (7 días).
	Si inicio_dias < 7
		dias_resto = inicio_dias
	FinSi
	
	Escribir "Su cantidad de " inicio_dias " días son " año " año/s, " mes " mes/es, " semana " semana/s y " dias_resto " días."
	
FinAlgoritmo