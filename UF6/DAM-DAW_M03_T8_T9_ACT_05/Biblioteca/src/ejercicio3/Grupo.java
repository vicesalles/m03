package ejercicio3;

public class Grupo {

	private String nombre;
	private String estilo;
	private int nIntegrantes;
	public Grupo(String nombre, String estilo, int nIntegrantes) {
		super();
		this.nombre = nombre;
		this.estilo = estilo;
		this.nIntegrantes = nIntegrantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getnIntegrantes() {
		return nIntegrantes;
	}
	public void setnIntegrantes(int nIntegrantes) {
		this.nIntegrantes = nIntegrantes;
	}
	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", estilo=" + estilo + ", nIntegrantes=" + nIntegrantes + "]";
	}
	
	
	
	
	
	
}
