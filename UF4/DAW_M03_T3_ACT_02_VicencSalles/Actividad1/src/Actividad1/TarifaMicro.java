package Actividad1;


//Lo hago con una interface para provar algo distinto, generalmente, pero, preferiria 'overwritear' el mètodo.
public interface TarifaMicro {
	
	static double getBaseBus (int plazas){
		int precio = plazas *2;
		double respuesta = (double) precio;		
		return respuesta;
	}
	
}
