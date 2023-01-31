package didi.loja.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import didi.loja.api.Repository.ProdutoRepository;
import didi.loja.api.Specification.ProdutoSpecification;
import didi.loja.api.modelo.AtualizaProduto;
import didi.loja.api.modelo.Produto;
import didi.loja.api.modelo.ProdutoDto;
import didi.loja.api.modelo.ProdutoForm;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public void cadastrar(@RequestBody Produto produto) {
		produtoRepository.save(produto);
		
	}
	
	
	@GetMapping()
	public List<Produto> listar(String nome){
		return produtoRepository.findAll(Specification.where(ProdutoSpecification.nome(nome)));
	}
	
	
//	@Transactional
//	@PutMapping("{id}")
//	public void atualizar(@PathVariable Long id,@Valid AtualizaProduto produtos) {
//		var produto = produtoRepository.getReferenceById(produtos.id());
//		produto.atualizarInformacoes(produtos);
//	}

	
	@Transactional
	@PutMapping("/{id}")
	public ResponseEntity<ProdutoDto> alterar(@PathVariable Long id,
			@RequestBody @Valid ProdutoForm form) {
		Produto produto = form.atualizar(id,produtoRepository);
		return ResponseEntity.ok(new ProdutoDto(produto));
	}

	
	@GetMapping("/xd")
	public List<Produto> listar(){
		return produtoRepository.findByQnt();
	
		
	}
	
	
}
