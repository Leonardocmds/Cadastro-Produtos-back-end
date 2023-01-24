package didi.loja.api.modelo;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public record AtualizaProduto(
		@NotNull
		Long id, 
		String nome, 
		BigDecimal preco, 
		BigDecimal quantidade) {}
