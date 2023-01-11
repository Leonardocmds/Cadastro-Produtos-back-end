package didi.loja.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import didi.loja.api.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	List<Produto> findByNome(String nome);

}
