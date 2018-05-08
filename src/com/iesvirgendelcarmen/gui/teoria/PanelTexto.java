package com.iesvirgendelcarmen.gui.teoria;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class PanelTexto {
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new InterfazPanelTexto();
				frame.setVisible(true);

			}
		});


	}
}

class InterfazPanelTexto extends JFrame {
	
	JLabel labelTitulo;
	private JPanel miPanel;
	JTextArea areaTexto;
	String texto;
	
	JScrollPane scrollPane;

	public InterfazPanelTexto() {
		crearVentana();
		iniciarComponentes();

	}

	private void iniciarComponentes() {

		scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 10, 380, 150);
		
		miPanel = new JPanel();
		miPanel.setLayout(null);

		labelTitulo = new JLabel();
		labelTitulo.setText("CONTENEDOR JSCROLLPANE");
		labelTitulo.setBounds(20, 20, 180, 23);
		

		texto = "El programa proporciona el area de texto como argumento al \nconstructor "
				+ "del JScrollPane. Esto establece el area de texto \ncomo el cliente del panel "
				+ "desplazable. El panel desplazable  \nmaneja todo esto: crear las barras de "
				+ "desplazamiento cuando son necesarias, redibujar el cliente cuando  \nel usuario "
				+ "se mueve sobre el, etc. Observa que el codigo de \nejemplo selecciona el tamaño "
				+ "preferido del contenedor del \npanel desplazable. Una alternativa seria seleccionar "
				+ "el \ntamaño preferido del propio panel desplazable. De cualquier \nmodo, se esta "
				+ "limitando el tamaño del panel desplazable. \nEsto es necesario porque el tamaño "
				+ "preferido de un panel \ndesplazable es ser tan grande como pueda. Por defecto, "
				+ "un \npanel desplazable intenta redimensionarse para que su...";

		areaTexto = new JTextArea();
		areaTexto.setText(texto);
		areaTexto.setBounds(35, 60, 340, 1000);
			
		miPanel.setPreferredSize(new Dimension(350, 250));
		scrollPane.setViewportView(miPanel);
		
		miPanel.add(labelTitulo);
		miPanel.add(areaTexto);
		add(scrollPane);
	}

	private void crearVentana() {
		setTitle("Panel con JScrollPane");
		setSize(420, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


	}
}