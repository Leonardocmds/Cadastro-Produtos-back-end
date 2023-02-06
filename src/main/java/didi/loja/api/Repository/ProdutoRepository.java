package didi.loja.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import didi.loja.api.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>, 
	JpaSpecificationExecutor<Produto> {
	
	List<Produto> findByNome(String nome);
	
	
	@Query(nativeQuery = true, value = "SELECT * FROM produto WHERE produto.quantidade <= 5")
	List<Produto> findByQnt();
	
	@Query(nativeQuery = true, value = "SELECT * FROM produto WHERE nome Like %:pnome% AND quantidade > 0 ")
	List<Produto> findByPesq(String pnome);

}
