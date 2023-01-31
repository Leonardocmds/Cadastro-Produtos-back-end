package didi.loja.api.modelo;

import java.math.BigDecimal;

public class ProdutoDto {
	
	private String nome;
	private int quantidade;
	private BigDecimal preco;
	
	public ProdutoDto(Produto produto) {
		this.nome = produto.getNome();
		this.quantidade = produto.getQuantidade();
		this.preco = produto.getPreco();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	
}
