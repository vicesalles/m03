package Ejercicio1;

public class Planeta {

	private String nombre; 
	private int id; 
	private double masa; 
	private double densidad; 
	private double diametro; 
	private double distancia;
	
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getDensidad() {
		return densidad;
	}

	public void setDensidad(double densidad) {
		this.densidad = densidad;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public int getId() {
		return id;
	}

	public Planeta(String nombre, int id) {
		
		System.out.println("Se ha creado el planeta "+ nombre +" correctamente.");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//EJEMPLO



