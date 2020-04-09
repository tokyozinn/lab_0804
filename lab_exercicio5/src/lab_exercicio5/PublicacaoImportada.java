package lab_exercicio5;

public class PublicacaoImportada extends Publicacao {

	private String regiao;
	
	public PublicacaoImportada(String titulo, Integer codigo, Integer numeroPaginas, String regiao) {
		super(titulo, codigo, numeroPaginas);
		this.regiao = regiao;
	}
	
	@Override
	public Float calculaCusto() {
		if (this.getNumeroPaginas() <= 50) {
			Float custo = this.getNumeroPaginas() * 0.3f;
			if (this.regiao.equals("Europa")) {
				custo += 100;
			}
			this.setCusto(custo);
		} else {
			Float custo = this.getNumeroPaginas() * 0.4f;
			if (this.regiao.equals("Europa")) {
				custo += 100;
			}
			this.setCusto(custo);
		}
		return this.getCusto();		
	}

	
}
