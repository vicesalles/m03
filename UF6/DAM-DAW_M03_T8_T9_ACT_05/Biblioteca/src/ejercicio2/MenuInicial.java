package ejercicio2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MenuInicial extends JFrame {
	public MenuInicial() {
		getContentPane().setLayout(null);
		
		JLabel lblBienvenidoALa = new JLabel("Bienvenido a la Biblioteca");
		lblBienvenidoALa.setBounds(131, 42, 179, 20);
		getContentPane().add(lblBienvenidoALa);
		
		JButton btnMenuAutores = new JButton("Menu Autores");
		btnMenuAutores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuAutores();
				dispose();
			}
		});
		btnMenuAutores.setBounds(62, 175, 131, 29);
		getContentPane().add(btnMenuAutores);
		
		JButton btnMenuLibros = new JButton("Menu Libros");
		btnMenuLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuLibros();
				dispose();
			}
		});
		btnMenuLibros.setBounds(219, 175, 131, 29);
		getContentPane().add(btnMenuLibros);
		
		JButton btnNewButton = new JButton("Consultar cat\u00E1logo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(50, 96, 323, 52);
		getContentPane().add(btnNewButton);
		
		
		setSize(450,300);
		setVisible(true);
	}
}
