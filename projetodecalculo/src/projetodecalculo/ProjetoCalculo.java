package projetodecalculo;

import javax.swing.JOptionPane;


public class ProjetoCalculo {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("informe nota1");
		String nota2 = JOptionPane.showInputDialog("informe nota2");
		String nota3 = JOptionPane.showInputDialog("informe nota3");
		String nota4 = JOptionPane.showInputDialog("informe nota4");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		/*Media para aprovação*/
	if(media>=50) {
		if (media >= 70) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado " + media);
		} else {
			JOptionPane.showMessageDialog(null, "Aluno em Recuperação " + media);
			}
	}else {
		JOptionPane.showMessageDialog(null, "Aluno reprovado " + media);
	}
	}
}
