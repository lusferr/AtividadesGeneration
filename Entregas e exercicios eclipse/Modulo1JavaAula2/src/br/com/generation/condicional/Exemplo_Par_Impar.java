package br.com.generation.condicional;

import javax.swing.JOptionPane;

public class Exemplo_Par_Impar {

	public static void main(String[] args) {
		
		int numero = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um n�mero inteiro: "));
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero � par", "Error", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "O n�mero � impar", "Error", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

	}

}
