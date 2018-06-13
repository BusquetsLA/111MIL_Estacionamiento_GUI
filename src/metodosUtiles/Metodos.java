/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosUtiles;

import java.util.Scanner;

/**
 *
 * @author utku33
 */
public class Metodos {
    
    /**
	 * ESTA FUNCION SE ENCARGA DE VALIDAR NUMEROS.
	 * VERIFICA QUE EL NUMERO SE ENCUENTRE DENTRO DE CIERTO RANGO AL LLAMAR LA FUNCION
	 * @param minimo: Es especificado al llamar a la función como primer parametro.
	 * @param maximo: Es especificado al llamar a la función como segundo parametro.
	 * @param peticion: Es la informacion del rango de validacion del numero.
	 * @author Agustin, Jose Luis.
	 * @return
	 */
	public static int validarNumero(int minimo, int maximo, String peticion) {
		/*
		 * INFO ADICIONAL:
		 * El contador i itera para analizar cada elemento de la cadena.
		 * El contador j almacena el numero de caracters validos, es decir que son numeros segun codigo ascii
		 * El contador h valida un signo negativo, valida las condiciones que debe poseer. 
		 */
		// VARIABLES
		Scanner scan = new Scanner(System.in);
		String cadena = "";
		int i = 0;
		int j = 0;
		int h = 0;
		int numero = 0;
		int valorAscii = 0;
			        
		// CICLO: EVALUA QUE EL NUMERO ESTE DENTRO DE UN RANGO PERMITIDO
		do {
			    	
			// CICLO: VERIFICA QUE CADA CARACTER DEL VALOR INGRESADO SEA UN NUMERO 
			do {	
                            System.out.println(peticion);
			    cadena = scan.next();
			        
			    // CICLO: EVALUA CADA CODIGO ASCII DE CADA CARACTER DE LA CADENA INGRESADA
			    for (i = 0 ; i < cadena.length() ; i++) {
			    	valorAscii = (int) cadena.charAt(i);

			        if (valorAscii > 47 && valorAscii < 58) {
			        	j++;
			        }

			        else if (i == 0 && h == 0 && valorAscii == 45) {
			        	j++;
			        	h++;
			        }
			        
			        else {
			        	System.out.println("Lo que ingreso no es correcto, ingrese un numero");
			            cadena = scan.next();
			            i = -1;
			            j = 0;
			            h = 0;
			        }
			    }
			} while (j != cadena.length());
			numero = Integer.parseInt(cadena);
			j = 0;
			h = 0;
		} while (numero < minimo || numero > maximo);
		
		return numero;
		
	}

    
}
