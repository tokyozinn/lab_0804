package lab_exercicio5;

public class Publicacao implements Produto{
	
	private String titulo;
	private Integer codigo;
	private Integer numeroPaginas;
	private Float custo;
	private Float imposto;
	
	public Publicacao(String titulo, Integer codigo, Integer numeroPaginas) {
		
		this.titulo = titulo;
		this.codigo = codigo;
		this.numeroPaginas = numeroPaginas;
	
	}
	
	@Override
	public String toString() {
		return String.format("Título da publicação: %s | Código: %d | Número de páginas: %d | Custo: %f", 
				this.titulo, this.codigo, this.numeroPaginas, this.custo);	
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Float getCusto() {
		this.calcularCusto();
		return this.custo;
	}

	public void setCusto(Float custo) {
		this.custo = custo;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	@Override
	public void calcularCusto() {
		if(this.numeroPaginas <= 200) {
			this.custo = this.numeroPaginas * 0.2f;
		} else {
			this.custo = this.numeroPaginas * 0.085f;
		}
	}


	@Override
	public void calcularImposto() {
		this.custo *= 0.1f;
	}
		
	
	public Float getImposto() {
		this.calcularImposto();
		return this.imposto;
	}
	
	public void setImposto(Float i) {
		this.imposto = i;
	}

}
