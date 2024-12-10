import java.util.Scanner;

public class AppMainEV02 {  //CLASS ABRE

		public static void main(String[] args) {
			AppMainEV02 a = new AppMainEV02();
			a.run();
			
		}
		/**
		 * Método donde colocar todos los ejercicios
		 */
		Scanner sc = new Scanner (System.in); //Al final poniendolo aqui si funciona en todos los demas
		public void run() {  //AQUI SE SELECCIONA EL EJERCICIO
		
			System.out.println("Inicio de la aplicación");
			/*  Insertar aquí las llamadas a los ejercicios que se vayan implementando */
			//ej000(); // poner en comentarios los que se van haciendo y sin coments el ejercicio en curso
			//ej401();
			//ej402();
			//ej403();
			//ej404();
			ej405();	
			
			
			
			System.out.println("Fin de la aplicación");
			
		}
		
		//------------------- Lista de ejercicios resueltos
		
	public void ej000() { /*ESTE ES DE EJEMPLO*/
			
		System.out.println("  Ejercicio numero 000:");
		System.out.println("  Buena suerte con el resto!!");
	}	//CIERRA EJ000
		
	public void ej401() { /*Crea un programa que cree una matriz de tamaño 5x5 que almacene los numeros del 
							1 al 25 y luego muestre la matriz por pantalla*/
			
		System.out.println("  Ejercicio numero 401:");
		System.out.println("  Buena suerte con el resto!!");
		int[][] matriz = new int[5][5];
		int a = 1;
		for (int i=0;i<matriz.length;i++) {           //INTRODUCIMOS LOS DATOS
			for (int j=0;j<matriz[0].length;j++) {				
				matriz[i][j]=a;
				a++;
			}
		}
		
		System.out.println();           //PINTAMOS LA MATRIZ
		System.out.print("    ");
		for(int j=0; j<matriz[0].length; j++) {
			System.out.print("|0"+(j+1) + "|");
		} 
		System.out.println();
		for(int i=0; i<matriz.length; i++) {
			System.out.print("|"+ (i+1)+"| ");
			for(int j=0; j<matriz[0].length; j++) {	
					if (matriz[i][j]<=9) { System.out.print(" ");
					System.out.print("["+matriz[i][j] + "]");}
					else { System.out.print("["+matriz[i][j] + "]");}
			} 
			System.out.println();
		} 
		System.out.println();
		
		
	}	//CIERRA EJ401
		
	public void ej402() { /*Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
							de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
							pantalla.*/
		
		System.out.println("  Ejercicio numero 402:");
		System.out.println("  Buena suerte con el resto!!");
		int[][] matriz = new int[10][10];
		
		
		for (int i=0;i<matriz.length;i++) {			//INTRODUCIMOS LOS DATOS
			for (int j=0;j<matriz[0].length;j++) {				
				matriz[i][j]=(i+1)*(j+1);
				
			}
		}
		
			
		
		System.out.println();             //PINTAMOS LA MATRIZ
		System.out.print("      ");
		for(int j=0; j<matriz[0].length; j++) {
			System.out.print("|0"+(j+1) + "| ");
			
		} 
		System.out.println();
		for(int i=0; i<matriz.length; i++) {
			if((i+1)<=9) {System.out.print("|0"+ (i+1)+"| ");}
			else {System.out.print("|"+ (i+1)+"| ");}
			
			for(int j=0; j<matriz[0].length; j++) {	
					if (matriz[i][j]<=9) { System.out.print(" ");
					System.out.print(" ["+matriz[i][j] + "]");}
					else { System.out.print(" ["+matriz[i][j] + "]");}
			} 
			System.out.println();
		} 
		System.out.println();
		
	}	//CIERRA EJ402		
		
	public void ej403() { /*Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
							introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
							matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
							menores que cero y cuántos son igual a cero.*/
		
		System.out.println("  Ejercicio numero 403:");
		System.out.println("  Buena suerte con el resto!!");
		
		System.out.println("Dime cuantos valores N de la matriz: ");
		int N = sc.nextInt();
		System.out.println("Dime cuantos valores M de la matriz: ");
		int M = sc.nextInt();		
		int[][] matriz = new int[N][M];
		int casilla=0;
		int maycero = 0;
		int mencero = 0;
		int cero = 0;
		
		for (int i=0;i<matriz.length;i++) {			//INTRODUCIMOS LOS DATOS
			for (int j=0;j<matriz[0].length;j++) {				
				System.out.println("  Dime valor para casilla: ["+i+"]x["+j+"] : ");
				casilla = sc.nextInt();
				matriz[i][j]=casilla;				
			}
		}
		
		System.out.println();           //PINTAMOS LA MATRIZ		
		System.out.println("Esta es tu matriz: ");
		for(int i=0; i<matriz.length; i++) {			
			for(int j=0; j<matriz[0].length; j++) {						
					System.out.print("["+matriz[i][j] + "]");					
			} 
			System.out.println();
		} 
		System.out.println();
		
		for (int i=0;i<matriz.length;i++) {			//CONTAMOS
			for (int j=0;j<matriz[0].length;j++) {				
				if (matriz[i][j]<0) {mencero++;}
				if (matriz[i][j]>0) {maycero++;}
				if (matriz[i][j]==0) {cero++;}
			}
		}
		System.out.println();						// MOSTRAMOS RESULTADOS
		System.out.println("Tiene "+mencero+" valores menores que cero.");
		System.out.println("Tiene "+maycero+" valores mayores que cero.");
		System.out.println("Tiene "+cero+" valores iguales que cero.");
		
		
	}	//CIERRA EJ403	

	public void ej404() { /*Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”,
							“Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el programa
							mostrará la nota mínima, máxima y media de cada alumno.*/
		
		System.out.println("  Ejercicio numero 404:");
		System.out.println("  Buena suerte con el resto!!");
		
		int[][] matriz = new int[4][5];
		int nota = 0;
		int minima = 0;
		int maxima = 0;
		int media = 0;		
		
		for (int i=0;i<matriz.length;i++) {			//INTRODUCIMOS LOS DATOS
			for (int j=0;j<matriz[0].length;j++) {				
				System.out.print("  Dime la Nota " +(j+1)+ " del Alumno "+(i+1)+" : ");
				nota = sc.nextInt();
				matriz[i][j]=nota;				
			}
		}
		
		for (int i=0;i<matriz.length;i++) {
			minima = matriz[i][0];  
		    for (int j=0; j<matriz[i].length;j++) {
		    	if (minima > (matriz[i][j])) {  
			        minima = (matriz[i][j]);		  
			    }  
		    }
		    System.out.println("La nota minima del alumno "+(i+1)+" es: "+minima);	
		}
		for (int i=0;i<matriz.length;i++) {
			maxima = matriz[i][0];  
		    for (int j=0; j<matriz[i].length;j++) {
		    	if (maxima < (matriz[i][j])) {  
			        maxima = (matriz[i][j]);		  
			    }  
		    }
		    System.out.println("La nota maxima del alumno "+(i+1)+" es: "+maxima);	
		}
		for (int i=0;i<matriz.length;i++) {
			media = matriz[i][0];  
		    for (int j=0; j<matriz[i].length;j++) {		    	  
			        media = media+(matriz[i][j]);			      
		    }
		    System.out.println("La nota media del alumno "+(i+1)+" es: "+(media/matriz[0].length));	
		}
	}	//CIERRA EJ404

	public void ej405() { /*Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
							empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por
							teclado la información de N personas distintas (valor también introducido por teclado).
							Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
							La información debe guardarse en una única matriz. Luego se mostrará por pantalla el
							sueldo medio de cada género.*/
		
		System.out.println("  Ejercicio numero 405:");
		System.out.println("  Buena suerte con el resto!!");
		
		System.out.println("Dime cuantas personas (N) hay en la empresa: ");
		int N = sc.nextInt();
		int[][] matriz = new int[N][3];
		int mediahombre = 0;
		int mediamujer = 0;
		int totalhombres = 0;
		int totalmujeres = 0;
		
		
		for (int i=0;i<matriz.length;i++) {			//INTRODUCIMOS LOS DATOS						
				System.out.print("  Dime el sueldo del empleado "+(i+1)+" : ");
				matriz[i][1] = sc.nextInt();
				System.out.print("  Dime si es mujer (0) u hombre (1) : ");
				matriz[i][2] = sc.nextInt();
				if (matriz[i][2]==1) {totalhombres++;}
				if (matriz[i][2]==0) {totalmujeres++;}
		}
		
		for (int i=0;i<matriz.length;i++) {
			if (matriz[i][2]==0)
			mediamujer = mediamujer+(matriz[i][1]);		    	
		}
		System.out.println("El sueldo medio de las mujeres es: "+(mediamujer/totalmujeres));
		
		for (int i=0;i<matriz.length;i++) {
			if (matriz[i][2]==1)
			mediahombre = mediahombre+(matriz[i][1]); 		    
		}
		System.out.println("El sueldo medio de los hombres es: "+(mediahombre/totalhombres));	
		
	}	//CIERRA EJ405
		
}  //CLASS CIERRA