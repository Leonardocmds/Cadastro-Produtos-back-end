package didi.loja.api.Specification;

import org.springframework.data.jpa.domain.Specification;

import didi.loja.api.modelo.Produto;

public class ProdutoSpecification {
	
	public static Specification<Produto> nome (String nome){
		return(root, criteriaQuery, criteriaBuilder) -> 
			criteriaBuilder.like(root.get("nome"),"%" + nome + "%");
	}

}
