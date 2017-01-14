package ejercicio2;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InsertarAutor extends JFrame {
	private JTextField nombreBox;
	private JTextField apellidosBox;
	public InsertarAutor() {
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(105, 68, 69, 20);
		getContentPane().add(lblNombre);
		
		nombreBox = new JTextField();
		nombreBox.setBounds(175, 65, 146, 26);
		getContentPane().add(nombreBox);
		nombreBox.setColumns(10);
		
		JLabel lblPginas = new JLabel("Apellidos");
		lblPginas.setBounds(105, 110, 69, 20);
		getContentPane().add(lblPginas);
		
		apellidosBox = new JTextField();
		apellidosBox.setBounds(175, 107, 146, 26);
		getContentPane().add(apellidosBox);
		apellidosBox.setColumns(10);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Principal.baseDatos.insertarAutor(nombreBox.getText(), apellidosBox.getText());
					new MenuInicial();					
					dispose();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnInsertar.setBounds(279, 187, 115, 29);
		getContentPane().add(btnInsertar);
		
		setSize(450,300);
		setVisible(true);
	}
}
