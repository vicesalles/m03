package Ejercicio3;

public class Alumno {

	private String nombre;
	private String apellido;
	private int edad;
	private int[] notas;

	public static void main(String[] args) {
		
	}
	
	//Constructor
	public Alumno (String nombre, String apellido, int edad, int[]notas){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.notas = notas;
	}

	public String getNombre() {
		System.out.println("El nombre de este alumno es: "+this.nombre);
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("Se ha cambiado el nombre correctamente");
	}

	public String getApellido() {
		System.out.println("El apellido de este alumno es: "+this.apellido);
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
		System.out.println("Se ha cambiado el apellido correctamente");
	}

	public int getEdad() {

		System.out.println(this.nombre+" tiene "+ this.edad+" a�os.");
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
		System.out.println("Se ha cambiado la edad correctamente");
	}

	public int[] getNotas() {
		
		System.out.println("Estas son las notas de "+this.nombre+":");
		
		for(int i = 0; i<this.notas.length;i++){
			System.out.println(this.notas[i]);
		}
		System.out.println("_________________________________");
		return notas;
	}
	
	public int getNotaMedia(){
		
		int respuesta;
		int total = 0;
		
		for(int i=0; i<this.notas.length;i++){
			
			total += this.notas[i];
			
		}
		
		respuesta = total/4;
		
		System.out.println("La nota media de "+this.nombre+" es "+ respuesta);
		
		return respuesta;
		
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
		System.out.println("se han introducido correctamente las notas");
	}
	
	
	
}
