package Ejercicio2;

public class Revision extends Trabajo {

	public Revision(int identificador, String descripcion) {
		super(identificador, descripcion);
		// TODO Auto-generated constructor stub
	}
	
	public double getPrecio(){
		double base = getPrecioBase();
		double precio = base + 20;
		//System.out.println("El precio de esta revisi�n sube a "+precio+" �");
		return precio;
	}

	@Override
	public String toString() {
		return "Revision [identificador=" + identificador + ", descripcion=" + descripcion + ", nHoras=" + nHoras
				+ ", costePiezas=" + costePiezas + ", finalizado=" + finalizado + "]";
	}
	
	

}
