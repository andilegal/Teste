package controller;

import javax.swing.JOptionPane;

public class Metodos {
	
	public int msgInt(String texto) {
		return Integer.parseInt(JOptionPane.showInputDialog(texto));
	}
	
	

}
