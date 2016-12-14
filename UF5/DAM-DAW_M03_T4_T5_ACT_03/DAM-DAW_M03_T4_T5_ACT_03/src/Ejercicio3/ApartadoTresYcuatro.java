//APARTADO 3 y 4 juntos.

package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApartadoTresYcuatro {

	public static int resultado = 0;
	public static int nNumeros = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("#### SUMOMETRO ###");

		while(!esFin()){
		
			
			try {
				resultado += pideInt("Introduce un n�mero");
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				
				System.out.println("Sumatorio: "+resultado);
				
			}
			
			nNumeros++;
		
		}
		
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
			
		if (!esInteger(input)){
		
			nNumeros = 5;
			System.out.println("Has introducido una letra.");
			esFin();
						
		}

		res = Integer.parseInt(input);
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
		

	//Check si se ha superado el n�mero permitido de intentos
	public static boolean esFin(){
				
		if(nNumeros>=5){
			
			System.out.println("*******************************************************");
			System.out.println("EL RESULTADO FINAL ES: "+ resultado);
			System.out.println("*******************************************************");
			System.exit(0);
			return true;
		}
		
		return false;
		
	}
	
}
