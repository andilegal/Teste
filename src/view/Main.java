package view;

import controller.Metodos;

public class Main {

	public static void main(String[] args) {
		
		Metodos m = new Metodos();
		String s = "Insira sua idade";
		System.out.println(m.msgInt(s));

	}

}
