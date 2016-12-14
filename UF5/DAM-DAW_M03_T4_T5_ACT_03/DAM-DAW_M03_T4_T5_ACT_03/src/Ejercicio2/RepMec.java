package Ejercicio2;

public class RepMec extends Trabajo {

	public RepMec(int identificador, String descripcion) {
		super(identificador, descripcion);
		// TODO Auto-generated constructor stub
	}

	public double getPrecio(){
		double base = getPrecioBase();
		double material = this.costePiezas*1.1;
		double precio = base + material;
		//System.out.println("El precio de esta Reparaci�n mec�nica sube a "+precio+"�");
		this.precio = precio;
		return precio;
	}

	@Override
	public String toString() {
		return "RepMec [identificador=" + identificador + ", descripcion=" + descripcion + ", nHoras=" + nHoras
				+ ", costePiezas=" + costePiezas + ", finalizado=" + finalizado + "]";
	}
	
	
}