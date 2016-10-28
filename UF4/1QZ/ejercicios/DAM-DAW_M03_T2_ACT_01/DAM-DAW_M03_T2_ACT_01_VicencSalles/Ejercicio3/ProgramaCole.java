package Ejercicio3;
import Ejercicio3.Alumno;

public class ProgramaCole {

	public static void main(String[] args) {

		
		int[] notasUno = {6,7,8,4};
		Alumno uno = new Alumno("Pedro","Perez",19,notasUno);
		int[] notasDos = {7,6,5,5};
		Alumno dos = new Alumno("Mariano","Márquez",21,notasDos);

		//Parece que hay una falta de ortografia en el nombre de un alumno
		
		uno.setApellido("Pérez");
		//A ver...
		uno.getApellido();
		
		//Los padres nos piden las notas de Mariano
		
		dos.getNotas();
		//Ya de paso les mandamos la media
		dos.getNotaMedia();
		
		//Durante el segundo trimestre Mariano se ha aplicado un cambio de sexo
		dos.setNombre("Maria");
		//A ver..
		dos.getNombre();
		//Ya tiene edad para hacer esto??
		dos.getEdad();
		//Parece que sí...
		
		
	}

}
