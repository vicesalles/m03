package Actividad1;

public class VehiculoCarga extends Vehiculo {

	int pma = this.pma;
	int precioBaseCarga = pma*20;
	
	public VehiculoCarga (String matricula, int pma, String modelo){
		
		this.matricula = matricula;
		this.pma = pma;
		this.modelo = modelo;
		
	}
	
	public double getTarifa (int dias){
		double presupuesto = 0.0;
		double base = getTarifaBase(dias);
		double baseCarga = (double)precioBaseCarga;
		presupuesto = base + baseCarga*dias;
		System.out.println("El precio total ser� de "+presupuesto+" euros");
		return presupuesto;
	}
	
	
	@Override
	void dummy() {
		// TODO Auto-generated method stub
		
	}

}