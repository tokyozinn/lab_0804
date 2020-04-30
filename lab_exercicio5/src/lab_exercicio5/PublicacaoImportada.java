package lab_exercicio5;

public class PublicacaoImportada extends Publicacao {

	private String regiao;
	
	public PublicacaoImportada(String titulo, Integer codigo, Integer numeroPaginas, String regiao) {
		super(titulo, codigo, numeroPaginas);
		this.regiao = regiao;
	}
	
	@Override
	public void calcularCusto() {
		if (this.getNumeroPaginas() <= 50) {
			Float custo = this.getNumeroPaginas() * 0.3f;
			if (this.getRegiao().equals("Europa")) {
				custo += 100;
			}
			this.setCusto(custo);
		} else {
			Float custo = this.getNumeroPaginas() * 0.4f;
			if (this.getRegiao().equals("Europa")) {
				custo += 100;
			}
			this.setCusto(custo);
		}		
	}
	
	@Override
	public void calcularImposto() {
		Float i = this.getCusto() * 0.2f;
		this.setImposto(i);
	}
	
	public String getRegiao() {
		return this.regiao;
	}

	@Override
	public String toString() {
		return String.format("Título da publicação: %s | Código: %d | Número de páginas: %d | Custo: R$%.2f | Região: %s | Imposto a ser pago: R$%.2f" , 
				this.getTitulo(), this.getCodigo(), this.getNumeroPaginas(), this.getCusto(), this.regiao, this.getImposto());
	}
	
}
