package Ejercicio1;
import Ejercicio1.Planeta;

public class Sistema {

	private int nPlanetas;
	private Planeta[] planetas = new Planeta[nPlanetas];
			
	public int getnPlanetas() {
		
		return nPlanetas;
	}

	public void setnPlanetas(int nPlanetas) {
		this.nPlanetas = nPlanetas;
	}

	public Planeta[] getPlanetas() {
		
		return planetas;
	}


	public void setPlanetas(Planeta[] planetas) {
		this.planetas = planetas;
	}

	public Sistema (int nPlanetas, Ejercicio1.Planeta[] planetas){
		
		System.out.println("Sistema Solar creado con �xito");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
