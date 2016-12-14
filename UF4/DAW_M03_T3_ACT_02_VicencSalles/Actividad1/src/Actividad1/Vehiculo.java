package Actividad1;

//Encima de esta clase abstracta voy a construir el resto de vehiculos

public abstract class Vehiculo {

	String matricula = this.matricula;
	static double precioBase = 50;
	String modelo = this.modelo;
	
	abstract void dummy();
	
	static double getTarifaBase(int nDias){
		
		double precio = nDias*precioBase;
		
		return precio;	
		
		
	}
	
	public double getTarifa(int dias){
		double tarifa = 0.0;
		return tarifa;
	}

	public String getMatricula() {
		System.out.println("La matricula de este vehiculo es "+ matricula);
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
