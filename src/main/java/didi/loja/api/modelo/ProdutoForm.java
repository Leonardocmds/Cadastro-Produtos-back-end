package didi.loja.api.modelo;

import didi.loja.api.Repository.ProdutoRepository;

public class ProdutoForm {
	
	private int quantidade;

	public ProdutoForm(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public ProdutoForm() {
	
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Produto atualizar(Long id, ProdutoRepository produtoRepository) {
		Produto produto = produtoRepository.getById(id);
		produto.setQuantidade(this.quantidade);
		return produto;
	}
	

}
