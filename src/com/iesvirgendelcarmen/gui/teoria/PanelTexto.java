package com.iesvirgendelcarmen.gui.teoria;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PanelTexto {
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new InterfazCalculadora();
				frame.setVisible(true);

			}
		});


	}
}

class InterfazPanelTexto extends JFrame {
	
	
	public InterfazPanelTexto() {
		crearVentana();
		
	}

	private void crearVentana() {

		
	}
}