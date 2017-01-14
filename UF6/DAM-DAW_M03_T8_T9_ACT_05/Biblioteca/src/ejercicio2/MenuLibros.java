package ejercicio2;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MenuLibros extends JFrame {
	public MenuLibros() {
		getContentPane().setLayout(null);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new InsertarLibro();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dispose();
			}
		});		
		
		btnInsertar.setBounds(161, 39, 115, 29);
		getContentPane().add(btnInsertar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new ModificarLibros();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		
		btnModificar.setBounds(161, 84, 115, 29);
		getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						new EliminarLibro();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				dispose();
			}
		});
		
		btnEliminar.setBounds(161, 130, 115, 29);
		getContentPane().add(btnEliminar);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new VistaLibros();					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dispose();
			}
		});
		
		btnMostrar.setBounds(161, 175, 115, 29);
		getContentPane().add(btnMostrar);
		
		setSize(450,300);
		setVisible(true);
	}
}
