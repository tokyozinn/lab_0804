package lab_exercicio5;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class TesteAula2904 {

	public static void main(String[] args) {
		
//		Publicacao p01 = new PublicacaoImportada("Harry Potter", 001, 650, "Europa");
//		Publicacao p02 = new PublicacaoImportada("Percy Jackson", 002, 120, "EUA");
		
		int opt = Integer.parseInt(JOptionPane.showInputDialog("Quantos livros quer cadastrar?"));
		
		ArrayList<Publicacao> a = new ArrayList<>();
		
		for(int i = 0; i < opt; i++) {
			String titulo = JOptionPane.showInputDialog("Qual o titulo do livro?");
			int cod = i+1;
			int pag = Integer.parseInt(JOptionPane.showInputDialog("Quantas páginas no livro?"));
			String reg = JOptionPane.showInputDialog("Qual a região?");
			
			Publicacao p = new PublicacaoImportada(titulo, cod, pag, reg);
			a.add(p);
			
			JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");
			
		}
		
		Iterator<Publicacao> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
