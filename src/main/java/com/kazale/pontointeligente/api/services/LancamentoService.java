package com.kazale.pontointeligente.api.services;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.kazale.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {

	Page<Lancamento> buscarPorFuncionarioID(Long funcionarioid, PageRequest pageRequest);
	
	Optional<Lancamento> buscarPorid(Long id);
	
	Lancamento persistir(Lancamento lancamento);
	
	void remover(Long id);
	
}
