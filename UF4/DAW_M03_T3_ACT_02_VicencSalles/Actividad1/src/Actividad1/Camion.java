package Actividad1;

//Baso el cami�n en mi Clase 'VehiculoCarga' porqu� el c�lculo de la tarifa se le asemeja

public class Camion extends VehiculoCarga {
	//De hecho, esta es la �nica diferencia entre Camion y VehiculoCarga:
	double extraBase = 40;
	
	public Camion(String matricula, int pma, String modelo) {
		super(matricula, pma, modelo);
		// Constructor heredado de VehiculoCarga
	}

	@Override
	public double getTarifa(int dias) {
		// A�ado los 40 euros extra que valen los camiones al m�todo heredado
		double presupuesto = super.getTarifa(dias)+extraBase;
		System.out.println("El precio total ser� de "+presupuesto+" euros");
		return presupuesto;
	}
	
	

}
