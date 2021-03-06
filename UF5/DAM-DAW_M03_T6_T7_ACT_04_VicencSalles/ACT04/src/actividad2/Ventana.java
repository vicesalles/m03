package actividad2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {
	private JTextField txtNombre;
	private JTextField txtApellido;
	public Ventana() {
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(15, 58, 69, 20);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(186, 58, 69, 20);
		getContentPane().add(lblApellido);
		
		txtNombre = new JTextField();
		txtNombre.setToolTipText("Introduce tu nombre");
		txtNombre.setBounds(15, 80, 146, 26);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setToolTipText("Introduce tu apellido");
		txtApellido.setBounds(186, 82, 146, 26);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"10-15", "16-20", "21-25", "26-30", "31-35", "36-40", "41-45", "46-50", "51-55"}));
		comboBox.setBounds(364, 82, 78, 26);
		getContentPane().add(comboBox);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(364, 58, 69, 20);
		getContentPane().add(lblEdad);
		
		JLabel lblGnero = new JLabel("G\u00E9nero");
		lblGnero.setBounds(494, 58, 69, 20);
		getContentPane().add(lblGnero);
		
		JRadioButton rdFemenino = new JRadioButton("Femenino");
		rdFemenino.setActionCommand("Femenino");
		rdFemenino.setBounds(492, 81, 155, 29);
		getContentPane().add(rdFemenino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setActionCommand("Masculino");
		rdbtnMasculino.setBounds(492, 118, 155, 29);
		getContentPane().add(rdbtnMasculino);
		
	
		//Creo grupo de Radios
		ButtonGroup grupoB = new ButtonGroup();		
		grupoB.add(rdFemenino);
		grupoB.add(rdbtnMasculino);
		
		
		JLabel lblAficiones = new JLabel("Aficiones");
		lblAficiones.setBounds(15, 159, 69, 20);
		getContentPane().add(lblAficiones);
		
		JCheckBox chckbxDormir = new JCheckBox("Dormir");
		chckbxDormir.setBounds(15, 191, 139, 29);
		getContentPane().add(chckbxDormir);
		
		JCheckBox chckbxComer = new JCheckBox("Comer");
		chckbxComer.setBounds(156, 191, 139, 29);
		getContentPane().add(chckbxComer);
		
		JCheckBox chckbxFornicar = new JCheckBox("Fornicar");
		chckbxFornicar.setBounds(294, 191, 139, 29);
		getContentPane().add(chckbxFornicar);
		
		JButton btnAceptar = new JButton("Aceptar");
		//En hacer click al bot�n 'Aceptar'....
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				
				//Checkeo que todos los campos esten rellenos
				if(txtNombre.getText().length()==0){
					//ERROR
					JOptionPane.showMessageDialog(Ventana.this,"Debes introducir un nombre","Error!",JOptionPane.ERROR_MESSAGE);
				}else if(txtApellido.getText().length()==0){
					//ERROR
					JOptionPane.showMessageDialog(Ventana.this,"Debes introducir un apellido","Error!",JOptionPane.ERROR_MESSAGE);
				}else if(rdbtnMasculino.isSelected() == false && rdFemenino.isSelected() == false ){
					JOptionPane.showMessageDialog(Ventana.this,"Debes seleccionar tu g�nero","Error!",JOptionPane.ERROR_MESSAGE);
				}else if(chckbxDormir.isSelected()== false && chckbxComer.isSelected()== false && chckbxFornicar.isSelected()== false){
					JOptionPane.showMessageDialog(Ventana.this,"Debes seleccionar,al menos, una afici�n","Error!",JOptionPane.ERROR_MESSAGE);
				}else{
					MensajeOK mOk = new MensajeOK();
				}
				
			}
		});
		btnAceptar.setBounds(634, 191, 115, 29);
		getContentPane().add(btnAceptar);
		
		//Hago que la ventana sea visible
		setSize(800,300);
		setVisible(true);
		
	}
}
