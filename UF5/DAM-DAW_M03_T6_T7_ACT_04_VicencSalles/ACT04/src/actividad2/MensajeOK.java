package actividad2;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class MensajeOK extends JDialog {
	public MensajeOK() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblMensaje = new JLabel("Gracias por usar la aplicaci�n");
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setBounds(53, 51, 279, 20);
		getContentPane().add(lblMensaje);
		
		setSize(400,200);
		setVisible(true);
		setModal(true);
	}

}