package didi.loja.api.modelo;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public record AtualizaProduto(
		 
		String nome, 
		int quantidade) {}
