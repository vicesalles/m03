package Ejercicio3;

import java.util.ArrayList;

public class Registro {

	static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Registro (){
		
	}
	
	public void addAlumno(Alumno al) throws DemasiadosObjetos{
		
		alumnos.add(al);
		
	}
	

}
