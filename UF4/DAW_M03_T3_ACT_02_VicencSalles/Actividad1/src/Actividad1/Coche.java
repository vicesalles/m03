package Actividad1;

public class Coche extends Vehiculo {

	int plazas = this.plazas;
	double plazaDia = 1.5;
	
	public Coche (String matricula, int plazas, String modelo){
		
		this.matricula = matricula;
		this.plazas = plazas;		
		this.modelo = modelo;
		
	}	
	
	public double getTarifa (int dias){
		
		double presupuesto = 0;
		double base = getTarifaBase(dias);
		double plazasD = (double)this.plazas;
		double diasD = (double)dias;
		double plusPlazas =  (plazasD * plazaDia)* diasD;
		presupuesto = base + plusPlazas;
		System.out.println("El precio total ser� de "+presupuesto+" euros");		
		return presupuesto;
	}
	
	

	//Getters y Setters 
	public int getPlazas() {
		System.out.println("Este coche tiene: "+plazas+" plazas");
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	
	
	
	@Override
	void dummy() {
		// TODO Auto-generated method stub
		
	}



}