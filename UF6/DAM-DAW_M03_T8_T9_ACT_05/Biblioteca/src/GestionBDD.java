import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GestionBDD {

	//Dirección de mi base de datos
	private static String datosConexion = "jdbc:mysql://127.0.0.1:3306/";
	
	//Mi Base de datos
	private static String baseDatos = "libros";
	
	//Usuario
	private static String usuario = "root";
	
	//Password
	private static String password = "";
	
	//Conexión
	private Connection con;
	
	public GestionBDD(){
		try {
			con = DriverManager.getConnection(datosConexion+baseDatos,usuario,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertarLibro(String isbn, String titulo, String autor, String nPaginas, String genero) throws SQLException{
		
		String query ="INSERT INTO Libro(isbn,titulo,autor,nPaginas,genero)values("+isbn+",'"+titulo+"','"+autor+"',"+nPaginas+",'"+genero+"')";
		
		Statement stm = null;
		
		try {
			stm = con.createStatement();
			stm.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stm.close();
		}
	}
	//Este método borra el libro que le pasemos
	public void borrarLibro(String isbn) throws SQLException{
        String query ="DELETE FROM Libro WHERE isbn="+isbn;
		
		Statement stm = null;
		
		try {
			stm = con.createStatement();
			stm.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			stm.close();
		}
	}
	
	//Este método nos permite modificar un libro
	public void modificarLibro(String isbn, String titulo, String autor, String nPaginas, String genero) throws SQLException{
		
			String query ="UPDATE libro SET titulo='"+titulo+"', autor='"+autor+"', nPaginas="+nPaginas+", genero='"+genero+"' WHERE isbn="+isbn;
			
			Statement stm = null;
			
			try {
				stm = con.createStatement();
				stm.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				stm.close();
			}
		
		
	}
	
	public ArrayList<Libro> cargarLibros () throws SQLException{
		String query = "select * from libro";
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Libro> libros = new ArrayList<Libro>();
		Libro l;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()){
				l = new Libro(rs.getInt("isbn"), rs.getString("titulo"), rs.getString("autor"), rs.getInt("nPaginas"), rs.getString("genero"));
				libros.add(l);
			}
			return libros;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			rs.close();
			stmt.close();
		}
		return null;
	}

}
