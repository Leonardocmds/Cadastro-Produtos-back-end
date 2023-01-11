package didi.loja.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import didi.loja.api.Repository.ProdutoRepository;
import didi.loja.api.modelo.Produto;
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
		return produtoRepository.findByNome(nome);
	}
	

	
	
}
