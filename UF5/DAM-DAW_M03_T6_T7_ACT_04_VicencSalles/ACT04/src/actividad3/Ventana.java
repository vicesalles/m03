package actividad3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;
	public JLabel lbIncorrecto;
	
	public JTextField getTextField() {
		return textField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public Ventana() {
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(35, 35, 69, 20);
		getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(35, 57, 146, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(35, 97, 121, 20);
		getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(35, 120, 146, 20);
		getContentPane().add(passwordField);
		
		lbIncorrecto = new JLabel("CREDENCIALES INCORRECTAS");
		lbIncorrecto.setHorizontalAlignment(SwingConstants.CENTER);
		lbIncorrecto.setForeground(Color.RED);
		lbIncorrecto.setVisible(false);
		lbIncorrecto.setBounds(67, 166, 283, 20);
		getContentPane().add(lbIncorrecto);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField.getText().length()==0){
					//ERROR
					JOptionPane.showMessageDialog(Ventana.this,"Debes introducir tu nombre","Error!",JOptionPane.ERROR_MESSAGE);
				}else if(passwordField.getPassword().length==0){
					//ERROR
					JOptionPane.showMessageDialog(Ventana.this,"Debes introducir tu password","Error!",JOptionPane.ERROR_MESSAGE);
				}else{
					
					FileReader fr = null;
					//String basePath = new File("").getAbsolutePath();
					//String path = new File("src/actividad3/datos.txt");
					try {
						fr = new FileReader("src/actividad3/datos.txt");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					BufferedReader br = new BufferedReader(fr);

					String s;
					String nombre = textField.getText();
					String password = String.valueOf(passwordField.getPassword());

					try {
						while((s=br.readLine()) != null){
													

						if(s.equals(nombre + " " + password)){

						fr.close();

						Logueado L = new Logueado(nombre);

						}

						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					lbIncorrecto.setVisible(true);	
					
				}
				
				
				
			}
		});
		btnEnviar.setBounds(298, 199, 115, 29);
		getContentPane().add(btnEnviar);
		//Hago que la ventana sea visible
				setSize(800,300);
				setVisible(true);
				
				
		
	}
}
