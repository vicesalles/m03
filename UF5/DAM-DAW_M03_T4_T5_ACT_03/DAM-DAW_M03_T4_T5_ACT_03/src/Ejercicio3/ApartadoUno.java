package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApartadoUno {

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
			
			System.out.println("Aqu� no puedes introducir n�meros");
			return pideString(frase);			
		}
				
		return input;
	
	}
	//Funci�n que nos pide un int por medio de la frase que le pasemos.
	public static int pideInt(String frase){
		
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
			
			System.out.println("Debes introducir un intenger");
			return pideInt(frase);			
		}
		
		res = Integer.parseInt(input);
		return res;
	
	}
	
	//Pide un double
	public static double pideDouble(String frase){
		
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
			
			System.out.println("Debes introducir un double");
			return pideDouble(frase);			
		}
		
		res = Double.parseDouble(input);
		return res;
		
	}
	
	//Para detectar si un string contiene un intenger
	public static boolean esInteger(String txt) {
	    try { 
	        Integer.parseInt(txt); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
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

	
}

