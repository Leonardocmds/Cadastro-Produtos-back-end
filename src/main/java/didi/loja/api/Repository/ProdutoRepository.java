package didi.loja.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import didi.loja.api.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>, 
	JpaSpecificationExecutor<Produto> {
	
	List<Produto> findByNome(String nome);

}
