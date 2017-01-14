package ejercicio2;

public class Autor {

	private int id_autor;
	private String nombre;
	private String apellidos;
	
	public Autor(int id_autor, String nombre, String apellidos) {
		super();
		this.id_autor = id_autor;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public int getIDautor() {
		return id_autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return id_autor+"-"+nombre+" "+ apellidos;
	}

	
	
	
	
	
}