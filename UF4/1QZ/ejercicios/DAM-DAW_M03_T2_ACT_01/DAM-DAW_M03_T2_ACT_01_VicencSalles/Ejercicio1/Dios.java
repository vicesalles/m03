package Ejercicio1;
import Ejercicio1.Planeta;
import Ejercicio1.Sistema;

public class Dios {
	
	//Aqu� es donde se crean las cosas en bastante menos que 7 d�as.

	public static void main(String[] args) {
				
		Planeta Mercurio = new Planeta("Mercurio",1);
		Planeta Venus = new Planeta("Venus",2);
		Planeta Tierra = new Planeta("Tierra",3);
		Planeta Marte = new Planeta("Marte",4);
		Planeta Jupiter = new Planeta("Jupiter",5);
		Planeta Saturno = new Planeta("Saturno",6);
		Planeta Urano = new Planeta("Urano",7);
		Planeta Neptuno = new Planeta("Neptuno",8);
		Planeta[] planetas = {Mercurio,Venus,Tierra,Marte,Jupiter,Saturno,Urano,Neptuno};
		
		Sistema Solar = new Sistema(8,planetas);
	
		//Ejemplos
		System.out.println("N�mero de planetas en el sistema solar: "+Solar.getnPlanetas());
		Tierra.setMasa(5.97);
		System.out.println("Masa de la tierra: "+Tierra.getMasa());
		
	}

}
