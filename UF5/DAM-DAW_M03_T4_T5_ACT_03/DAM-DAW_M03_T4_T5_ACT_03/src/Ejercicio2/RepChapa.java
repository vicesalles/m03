package Ejercicio2;

public class RepChapa extends Trabajo {

	public RepChapa(int identificador, String descripcion) {
		super(identificador, descripcion);
		// TODO Auto-generated constructor stub
	}

	public double getPrecio(){
		double base = getPrecioBase();
		double material = this.costePiezas*1.3;
		double precio = base + material;
		//System.out.println("El precio de esta Reparación de Chapa y pintura sube a "+precio+"€");
		this.precio = precio;
		return precio;
	}

	@Override
	public String toString() {
		return "RepChapa [identificador=" + identificador + ", descripcion=" + descripcion + ", nHoras=" + nHoras
				+ ", costePiezas=" + costePiezas + ", finalizado=" + finalizado + "]";
	}
	
	
	
}
