package ejercicio2;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VistaAutores extends JFrame{
	
	private ArrayList<Autor> autores;
	private int i = 0;
	private JTextField nombreBox;
	private JTextField apellidosBox;	
	private JButton btnAnterior;
	private JButton btnSiguiente;

	public VistaAutores() throws SQLException{		
	
		
		autores = Principal.baseDatos.cargarAutores();
		
		getContentPane().setLayout(null);
		
		//Botones 
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i--;
				try {
					actualizar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAnterior.setBounds(0, 215, 213, 29);
		getContentPane().add(btnAnterior);
		btnAnterior.setEnabled(false); //Al principio, el boton 'Anterior' siempre está deshabilitado
					
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				try {
					actualizar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSiguiente.setBounds(210, 215, 218, 29);
		getContentPane().add(btnSiguiente);
				
		
		//Cajas de Texto
		
		nombreBox = new JTextField();
		nombreBox.setBounds(207, 59, 146, 26);
		getContentPane().add(nombreBox);
		nombreBox.setColumns(10);
		nombreBox.setText(autores.get(i).getNombre());
		
		apellidosBox = new JTextField();
		apellidosBox.setBounds(205, 95, 146, 26);
		getContentPane().add(apellidosBox);
		apellidosBox.setColumns(10);
		apellidosBox.setText(autores.get(i).getApellidos());					
		
		
	//Labels
		
		JLabel tituloLab = new JLabel("Apellidos");
		tituloLab.setBounds(121, 98, 69, 20);
		getContentPane().add(tituloLab);
			
		JLabel lblIsbn = new JLabel("Nombre");
		lblIsbn.setBounds(123, 62, 69, 20);
		getContentPane().add(lblIsbn);
		
		setSize(450, 300);
		setVisible(true);
		
	}
	
	public void actualizar() throws SQLException{
		
		nombreBox.setText(autores.get(i).getNombre());
		apellidosBox.setText(autores.get(i).getApellidos());	
		
		if(i==0){
			
			btnAnterior.setEnabled(false);
			
		}else{			
			btnAnterior.setEnabled(true);
		}
		if(i<autores.size()-1){
			
			btnSiguiente.setEnabled(true);
			
		}else{
			
			btnSiguiente.setEnabled(false);
		}
		
	}
	
}
