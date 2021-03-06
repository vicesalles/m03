package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApartadoDos {

	public static int fallos = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("#### ALTA DE ALUMNOS ###");
		System.out.println("ALUMNO 1:");
		pideString("Introduce el nombre del alumno");
		pideInt("Introduce la edad del alumno");
		pideDouble("Introduce la altura del alumno");
		System.out.println("ALUMNO 2:");
		pideString("Introduce el nombre del alumno");
		pideInt("Introduce la edad del alumno");
		pideDouble("Introduce la altura del alumno");
		System.out.println("Gracias por utilitzar nuestro software.");
		
		
	}

	//Funci�n que nos pide un String por medio de la frase que les pasemos.
	public static String pideString(String frase){
		//Checkeo que no hemos superado el n�mero de fallos permitido
		checkFallos();
		String input="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(frase);
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
			
		while (esInteger(input)){
			//le sumo un fallo por cada iteraci�n
			fallos++;
			System.out.println("Aqu� no puedes introducir n�meros");
			return pideString(frase);			
		}
		//Le quito el fallo que 'injustamente' le he asignado en la iteraci�n correcta.
		fallos--;		
		return input;
	
	}
	//Funci�n que nos pide un int por medio de la frase que le pasemos.
	public static int pideInt(String frase){
		checkFallos();
		String input="";
		int res=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(frase);
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		while (!esInteger(input)){
			fallos++;
			System.out.println("Debes introducir un intenger");
			return pideInt(frase);			
		}
		fallos--;
		res = Integer.parseInt(input);
		return res;
	
	}
	
	//Pide un double
	public static double pideDouble(String frase){
		checkFallos();
		String input="";
		double res=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(frase);
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		while (!esDouble(input)){
			fallos++;
			System.out.println("Debes introducir un double");
			return pideDouble(frase);			
		}
		fallos--;
		res = Double.parseDouble(input);
		return res;
		
	}
	
	//Para detectar si un string contiene un intenger
	public static boolean esInteger(String txt) {
	    try { 
	        Integer.parseInt(txt); 
	    } catch(NumberFormatException e) { 
	    	fallos +=1;
	        return false; 
	    } catch(NullPointerException e) {
	    	fallos +=1;
	    	return false;
	        
	    }
	    return true;
	}
	
	//Para detectar si un string contiene un double
	public static boolean esDouble (String txt){
		
		try { 
			Double.parseDouble(txt);
		} catch(NumberFormatException e) { 
			
			return false; 
		} catch(NullPointerException e) {
			
			return false;
		}		
		return true;
	}

	//Check si se ha superado el n�mero permitido de fallos
	public static void checkFallos(){
		
		
		System.out.println("fallos: "+fallos);
		
		if(fallos>=5){
			
			System.out.println("*******************************************************");
			System.out.println("ERROR N�MERO DE FALLOS PERMITIDOS SUPERADO");
			System.out.println("*******************************************************");
			System.exit(0);
		}
		
	}
	
}

