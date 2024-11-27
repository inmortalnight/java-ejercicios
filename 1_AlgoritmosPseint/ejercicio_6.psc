Algoritmo ejercicio_6 //Obj: Pasar de d�as a a�o, meses, semanas, d�as.
	
	Definir inicio_dias, a�o, mes, mes_resto, semana, a�o_resto, semana_resto, dias_resto Como Entero

	//Conseguir la cantidad de d�as.
	Escribir "Pasar de d�as a tiempo de calendario (resultados relativos)"
	Escribir "Introduzca la cantidad de d�as a cambiar:"
	Leer inicio_dias

	//Pasar de d�as a otros:
	
	//Cuando los inicio_d�as > un a�o.
	Si inicio_dias >= 365
		//C�lculo de a�os.
		a�o_resto = inicio_dias%365
		a�o = (inicio_dias - a�o_resto)/365
		Si a�o_resto >= 30 //Cuando inicio_dias - a�o = mes/es
			mes_resto = a�o_resto%30
			mes = (a�o_resto - mes_resto)/30
			Si mes_resto >= 7 //Cuando a�o/s - mes/ses = semanas.
				semana_resto = mes_resto%7
				semana = (mes_resto - semana_resto)/7
				dias_resto = semana_resto
			SiNo //Cuando a�o/s - mes/es = d�as.
				dias_resto = mes_resto
			FinSi
		SiNo 
			Si a�o_resto >= 7 //Cuando inicio_dias - a�o/s = semanas. 
				semana_resto = a�o_resto%7
				semana = (a�o_resto - semana_resto)/7
				dias_resto = semana_resto
			SiNo //Cuando inicio_dias - a�o/s = d�as.
				dias_resto = a�o_resto
			FinSi
		FinSi
	FinSi
	
	//Cuando inicio_dias < a�o pero inicio_dias >= un mes.
	Si 30 <= inicio_dias y inicio_dias < 365 
		//C�lculo de meses y resto.
		mes_resto = inicio_dias%30
		mes = (inicio_dias - mes_resto)/30
		Si mes_resto >= 7 //Cuando inicio_dias - mes/ses = semanas.
			semana_resto = mes_resto%7
			semana = (mes_resto - semana_resto)/7
			dias_resto = semana_resto
		SiNo //Cuando inicio_dias - mes/es = d�as.
			dias_resto = mes_resto
		FinSi
	FinSi
	
	//Cuando inicio_dias < un mes pero inicio_dias >= una semana.
	Si 7 <= inicio_dias y inicio_dias < 30
		semana_resto = inicio_dias%7
		semana = (inicio_dias - semana_resto)/7
		dias_resto = semana_resto
	FinSi
	
	//Cuando inicio_dias < una semana (7 d�as).
	Si inicio_dias < 7
		dias_resto = inicio_dias
	FinSi
	
	Escribir "Su cantidad de " inicio_dias " d�as son " a�o " a�o/s, " mes " mes/es, " semana " semana/s y " dias_resto " d�as."
	
FinAlgoritmo