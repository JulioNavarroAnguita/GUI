package com.iesvirgendelcarmen.gui.teoria;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GUI2 {

	
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new Interfaz();
				frame.setVisible(true);
				
			}
		});
		
		
	}

}

class Interfaz extends JFrame {
	private JLabel etiqueta;
	
	public Interfaz() {
		iniciarVentana();
		colocarComponentes();
	}
		private void colocarComponentes() {
			etiqueta = new JLabel("Texto de la etiqueta");
			this.add(etiqueta);
			
			
	}
		private void iniciarVentana() {
			this.setTitle("Titulo de la interfaz");//titulo //También se puede utilizar con this y sin el
			//setSize(300, 200);//tamaño
			setBounds(10, 10, 100, 100);
			setLocationRelativeTo(null);//centrado
			setResizable(false);//no se puede redimensionar
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar al acabar

		}
		
		
		
	
}
