package com.iesvirgendelcarmen.gui.teoria;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PanelesIntermedios {
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new Ventana();
				frame.setVisible(true);

			}
		});
	}
}

class Ventana extends JFrame {
	
	private JTextArea jTextArea;
	private String texto;
	private JTextField jTextFieldLogin;
	private JPasswordField jPasswordField;
	private JButton jButtonAceptar;
	
	public Ventana() {
		texto = "askjdbasdaskdbasdkjasbdkjasbdjksadbjadjkasd\n"
				+ "askdasjdaksdkalsjdklsjdksjdkljsdkljskajdk\n"
				+ "askldjalskdasñdañsldksldklsdlsdk\n";
				
		crearVentana();
		crearPanelPestannas();
		
	}

	private void crearPanelPestannas() {

		JTabbedPane jTabbedPane = new JTabbedPane();
		JPanel jPanel1 = new JPanel();
		JSplitPane jLabel1 = crearJSplitPane();
		JTextField jTextField = new JTextField(10);
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField);
		jTabbedPane.addTab("Pestaña 1", jPanel1);
		jTabbedPane.setToolTipTextAt(0, "Panel con label e inputText");
		
		JScrollPane jPanel2 = crearJScrollPane();
		
		jTabbedPane.addTab("Pestaña 2", jPanel2);
		jTabbedPane.setToolTipTextAt(1, "Panel con label");
		this.add(jTabbedPane);
	}

	private JSplitPane crearJSplitPane() {
		JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, crearJScrollPane(), 
				crearPanelDerecho());
		return jSplitPane;
	}
	
	private JPanel crearPanelDerecho() {

		JPanel jPanel = new JPanel(new GridLayout(0, 2, 30, 30));
		JLabel jLabelLogin = new JLabel("Usuario:");
		jPanel.add(jLabelLogin);
		jTextFieldLogin = new JTextField();
		jPanel.add(jTextFieldLogin);
		JLabel jLabelPassword = new JLabel("Contraseña");
		jPanel.add(jLabelPassword);
		jPasswordField = new JPasswordField();
		jPasswordField.add(jPasswordField);
		jButtonAceptar = new JButton("Aceptar");
		jButtonAceptar.add(jButtonAceptar);
		
		return jPanel;
	}
	
	private JScrollPane crearJScrollPane() {

		jTextArea = new JTextArea(100, 20);
		jTextArea.setText(texto);
		jTextArea.setEditable(false);
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTextArea);
		return jScrollPane;
	}

	private void crearVentana() {

		this.setTitle("Contenedores intermedios");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
