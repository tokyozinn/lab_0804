package lab_exercicio5;

public class Publicacao {
	
	private String titulo;
	private Integer codigo;
	private Integer numeroPaginas;
	private Float custo;
	
	public Publicacao(String titulo, Integer codigo, Integer numeroPaginas) {
		
		this.titulo = titulo;
		this.codigo = codigo;
		this.numeroPaginas = numeroPaginas;
		this.custo = this.calculaCusto();
		
	}
	
	public Float calculaCusto() {
		
		if(this.numeroPaginas <= 200) {
			this.custo = this.numeroPaginas * 0.2f;
			return this.custo;
		} else {
			this.custo = this.numeroPaginas * 0.085f;
			return this.custo;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Título da publicação: %s | Código: %d | Número de páginas: %d | Custo: %f", 
				this.titulo, this.codigo, this.numeroPaginas, this.custo);	
	}

	public Float getCusto() {
		return custo;
	}

	public void setCusto(Float custo) {
		this.custo = custo;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
		

}
