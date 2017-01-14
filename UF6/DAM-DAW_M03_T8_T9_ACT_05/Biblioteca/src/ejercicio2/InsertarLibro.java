package ejercicio2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InsertarLibro extends JFrame {
	private JTextField isbnBox;
	private JTextField tituloBox;
	private JTextField nPaginasBox;
	private JTextField generoBox;
	private JComboBox comboBox;

	public InsertarLibro() throws SQLException {
		getContentPane().setLayout(null);

		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(15, 16, 69, 20);
		getContentPane().add(lblIsbn);

		isbnBox = new JTextField();
		isbnBox.setBounds(64, 13, 146, 26);
		getContentPane().add(isbnBox);
		isbnBox.setColumns(10);

		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(15, 57, 69, 20);
		getContentPane().add(lblTitulo);

		tituloBox = new JTextField();
		tituloBox.setBounds(64, 54, 146, 26);
		getContentPane().add(tituloBox);
		tituloBox.setColumns(10);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(15, 96, 69, 20);
		getContentPane().add(lblAutor);

		// Importo los autores
		ArrayList<Autor> misAutores = Principal.baseDatos.cargarAutores();
		String[] autores = new String[misAutores.size()];
		
		// Paso los autores al Array que utilitzar� para la combo box
		for (int i = 0; i < autores.length; i++) {
			autores[i] = "" + misAutores.get(i).toString();
		}

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(autores));
		comboBox.setBounds(64, 93, 146, 26);
		getContentPane().add(comboBox);

		JLabel lblPginas = new JLabel("P\u00E1ginas");
		lblPginas.setBounds(15, 132, 69, 20);
		getContentPane().add(lblPginas);

		nPaginasBox = new JTextField();
		nPaginasBox.setBounds(85, 132, 125, 26);
		getContentPane().add(nPaginasBox);
		nPaginasBox.setColumns(10);

		JLabel lblGnero = new JLabel("G\u00E9nero");
		lblGnero.setBounds(15, 174, 69, 20);
		getContentPane().add(lblGnero);

		generoBox = new JTextField();
		generoBox.setBounds(85, 168, 125, 26);
		getContentPane().add(generoBox);
		generoBox.setColumns(10);

		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Principal.baseDatos.insertarLibro(isbnBox.getText(), tituloBox.getText(),
							comboBox.getSelectedItem().toString(), nPaginasBox.getText(), generoBox.getText());
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

		setSize(450, 300);
		setVisible(true);
	}
}