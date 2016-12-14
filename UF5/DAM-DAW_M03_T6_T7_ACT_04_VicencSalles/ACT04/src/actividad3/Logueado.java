package actividad3;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logueado extends JDialog {
	
	private String nombre;	

	public Logueado(String nombre) {
		
		this.nombre = nombre;
		
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblMensaje = new JLabel("Hola "+nombre+"!");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setBounds(53, 61, 279, 20);
		getContentPane().add(lblMensaje);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		btnCerrar.setBounds(138, 115, 115, 29);
		getContentPane().add(btnCerrar);
		
		setSize(400,200);
		setVisible(true);
		setModal(true);
	}
}
