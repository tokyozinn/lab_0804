package lab_exercicio5;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
			
		Publicacao p1 = new Publicacao(inputTitulo(), inputCodigo(), inputNumeroPaginas());
		PublicacaoImportada p2 = new PublicacaoImportada(inputTitulo(), inputCodigo(), inputNumeroPaginas(), inputRegiao());
		
		JOptionPane.showMessageDialog(null, p1, null, 1);
		JOptionPane.showMessageDialog(null, p2, null, 1);
	}
	
	public static String inputTitulo() {
		String titulo = JOptionPane.showInputDialog("Digite o titulo");
		return titulo;
	}
	
	public static Integer inputCodigo() {
		Integer codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código"));
		return codigo;
	}
	
	public static Integer inputNumeroPaginas() {
		Integer pag = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de páginas"));
		return pag;
	}
	
	public static String inputRegiao() {
		String re = JOptionPane.showInputDialog("Digite a região");
		return re;
	}
	
}
