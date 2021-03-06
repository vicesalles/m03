package Ejercicio2;

public abstract class Trabajo {

	int identificador;
	String descripcion;
	int nHoras = 0;
	double costePiezas = 0;
	boolean finalizado = false;
	double precio = 0;
			
	public Trabajo (int identificador, String descripcion){
		
		this.identificador = identificador;
		this.descripcion = descripcion;
		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getnHoras() {
		System.out.println("El numero de horas destinadas a este proyecto es de "+nHoras+" horas");
		return nHoras;
	}

	//Esta funci�n nos permite a�adir horas a un trabajo.
	public void addHoras(int nHoras) {

		boolean fi = this.getEstado();
		
		if(fi==false){
		
		this.nHoras += nHoras;
		getnHoras();
		
		}else{
			System.out.println("Este proyecto est� finalizado y no se puede modificar");
		}
	}
	
	//Esta funci�n nos indica si un Trabajo est� acabado o no.
	public boolean getEstado(){		
			
		return this.finalizado;
	}
	
	//Finaliza un trabajo
	public void finalizar(){		
		System.out.println("Se ha finalizado el proyecto;");		
		this.finalizado = true;
	}
	
	//Este m�todo nos devuelve el precio base de todo trabajo
	public double getPrecioBase(){
		int pb = this.nHoras*30;
		double db = (double) pb;
		return db;
	}
	
	//Este m�todo nos permite a�adir costes de piezas a qualquier trabajo
	public void addCostePiezas(int nuevoCoste){
		boolean fi = this.getEstado();
	if (fi ==false){
		this.costePiezas += nuevoCoste;		
		System.out.println("El coste actual en piezas es de: "+nuevoCoste+"�");
	}else{
		System.out.println("Este proyecto est� finalizado y no se puede modificar");
	}
		
	}
	
	public double getPrecio(){
		return this.precio;
	}
	
	public int getId(){
		
		return this.identificador;
		
	}

}
