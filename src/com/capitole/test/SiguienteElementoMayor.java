package com.capitole.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author jllort
 *
 */
public class SiguienteElementoMayor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> example1 = new ArrayList<>();
		example1 = Arrays.asList(4, 5, 2, 25);

		System.out.println("EJEMPLO1-METODO1--------------\nElemento  SEM");
		getSEM(example1);
		
		System.out.println("EJEMPLO1-METODO2--------------\nElemento  SEM");
		getSEM2(example1);
		
		
		List<Integer> example2 = new ArrayList<>();
		example2 = Arrays.asList(13, 7, 6, 12);

		System.out.println("EJEMPLO2-METODO1--------------\nElemento  SEM");
		getSEM(example2);
		
		System.out.println("EJEMPLO2-METODO2--------------\nElemento  SEM");
		getSEM2(example2);
        
        
        //EJEMPLO PARA COMPROBAR CUAL DE LOS DOS METODOS ES MAS RAPIDO
		//SE SUBE COMENTADO POR LA CANTIDA DE LOGS QUE ESCRIBE
		/*
        Date dateStart;
		Date dateEnd;
		
        List<Integer> example3 = new ArrayList<>();
        
        Random random = new Random();
        int[] array = random.ints(1000, 10,100000).toArray();
        
        example3 = Arrays.stream(array).boxed().collect(Collectors.toList());
        
		System.out.println("EJEMPLO3-METODO1--------------\nElemento  SEM");

		dateStart= new Date();
		getSEM(example3);
		dateEnd= new Date();
		
		System.out.println("Tiempo ejecucion:" + (dateEnd.getTime() - dateStart.getTime()));
		
		System.out.println("EJEMPLO3-METODO2--------------\nElemento  SEM");
		dateStart= new Date();
		getSEM2(example3);
        dateEnd= new Date();
        System.out.println("Tiempo ejecucion:" + (dateEnd.getTime() - dateStart.getTime()));
*/
	}

	static void getSEM(List<Integer> listaElementos) {

		for (int i = 0; i < listaElementos.size(); i++) {

			int siguienteElementoMayor = -1;

			for (Integer numCandidato : listaElementos.subList(i, listaElementos.size())) {
				if (numCandidato.intValue() > listaElementos.get(i).intValue()) {
					siguienteElementoMayor = numCandidato;
					break;
				}
			}
			System.out.println(listaElementos.get(i) + " --> " + siguienteElementoMayor);
		}

	}

	static void getSEM2(List<Integer> listaElementos) {

		List<Integer> listaElementosAux = new ArrayList<>();

		for (int i = 0; i < listaElementos.size(); i++) {

			int siguienteElementoMayor = -1;

			if (listaElementosAux.isEmpty()) {
				listaElementosAux.add(listaElementos.get(i));
			} else {
				if (listaElementos.get(i).intValue() < listaElementosAux.get(listaElementosAux.size() - 1)) {
					listaElementosAux.add(listaElementos.get(i));
				} else {
					while (!listaElementosAux.isEmpty() && 
							listaElementos.get(i).intValue() > listaElementosAux.get(listaElementosAux.size() - 1).intValue()) {
						System.out.println(
								listaElementosAux.get(listaElementosAux.size() - 1) + " --> " + listaElementos.get(i));
						listaElementosAux.remove(listaElementosAux.size() - 1);
					}
					listaElementosAux.add(listaElementos.get(i));
				}

			}
			
		}
		
		while (!listaElementosAux.isEmpty()) {
			System.out.println(
					listaElementosAux.get(listaElementosAux.size() - 1) + " --> " + -1);
			listaElementosAux.remove(listaElementosAux.size() - 1);
		}

	}

}
