package practica1;

import java.util.Scanner;

/**
 * Clase notas de la aplicación.
 * Calcula el resultado de las notas
 * @author Juan Francisco Pérez García IFP
 * @version 28.03.2023
 */

public class notas {
	 //declaramos la variables que nos hacen falta
    /**
     * Unidad formativa 1, 2 y 3
     */
double nota1, nota2, uf3;
    /**
     * Acumulado 1, 2 y 3
     */
double acu1, acu2, acu3, def;
    
    
//utilizaremos scaner para poder introducir datos

/**
 * Clase scaner
 * 
 * Es una clase que nos permite obtener la entrada de datos primitivos
 */
Scanner entrada = new Scanner(System.in);

///vamos a crear un metodo para ingresar 

/**
 * Método para ingresar las 3 notas del estudiante mediante scaner
 * Empieza con un println de ingresar las notas del estudiante y despues otro println pide la primera nota
 * Se introduce la primera nota
 * Se imprime otro println pidiendo la segunda nota
 * Se introduce la segunda nota
 * Se imprime el ultimo println pidiendo la tercera nota
 * Se introduce la tercera nota
 */

public void IngresaNotas() {
	//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
	System.out.println("ingrese las notas del estudiante");
	
	System.out.print("ingrese nota 1: ");
	
	nota1= entrada.nextDouble();
	
	System.out.print("ingrese nota 2: ");
	
	nota2= entrada.nextDouble();
	System.out.print("ingrese nota 3: ");
	
	uf3= entrada.nextDouble();
	

}

// metodo para comprobar bien la introduccion de notas
    /**
     * Comprueba que las notas introducidas no sean mayores de 10
     * 
     * Imprime si las notas estan mal introducidas o si son correctas
     */

public void comprobarcion(){
	
	if (nota1>10) {
		System.out.println(" nota1 mal introducida");
		
	}else {
		System.out.println(" nota1 correcta");
	}
	
	if (nota2>10) {
		System.out.println(" nota2 mal introducida");
		
	}else {
		System.out.println(" nota2 correcta");
	}
	if (uf3>10) {
		System.out.println(" nota3 mal introducida");
		
	}else {
		System.out.println(" nota3 correcta");
	}
	
		
	
	
}

/**
 * Calculo de las tres notas recibidas anteriormente
 */


public void Calculonotas() {
	acu1= nota1*0.35;
	acu2 = nota2 * 0.35;
	acu3 = uf3 * 0.30;
	
	def = acu1 + acu2+ acu3;
	
	//hasta aqui la tenemos calculada pero no la mostramos
}

/**
 * Método para mostrar por pantalla las 3 notas, los 3 acumulados y la nota dinitiva del estudiante
 */

public void Mostrar() {
	//print ln lo que hace es que al terminar el print baja la linea
	System.out.println(" notas introducidas son:");
	System.out.println(" nota1 = " + nota1);
	System.out.println(" nota2 = " + nota2);
	System.out.println(" nota3 = " + uf3);
	
	System.out.println(" acumuado 1 = "+ acu1);
	System.out.println(" acumuado 2 = "+ acu2);
	System.out.println(" acumuado 3 = "+ acu3);
	
	System.out.println(" nota definitiva es = "+ def);
	
}

/**
 * Método para saber si el estudiante está aprobado o suspendido
 */

public void aprobado() {
		
		if(def<5 && def>=0) {
			System.out.println("suspendio");
		}else {
			if (def>=5 && def<=10 ) {
			System.out.println("aprobado");
			}else {
				System.out.println(" error en la notas");
			}
		}
	}
/**
     * 
     * Éste es el método principal de la aplicación
     * @param args[] es un arreglo con los parámetros que el reciba por consola
     */	
	
public static void main(String[] args) {
	// creamos mecanimos para llamar a cualquier metodo fuera de la clase
	notas fc= new notas();
	
	fc.IngresaNotas();
	
	fc.comprobarcion();
	

	fc.Calculonotas();
	
	fc.Mostrar();
	
	fc.aprobado();
	
}

}
