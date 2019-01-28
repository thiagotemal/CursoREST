package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.kazale.pontointeligente.api.entities.Lancamento;
import com.kazale.pontointeligente.api.repositories.LancamentoRepository;

public class LancementoSericeImpl implements LancamentoService {
	
	LancamentoRepository  lancamentoRepository;

	@Override
	public Page<Lancamento> buscarPorFuncionarioID(Long funcionarioid, PageRequest pageRequest) {
	return lancamentoRepository.findByFuncionarioId(funcionarioid, pageRequest);
	}

	@Override
	public Optional<Lancamento> buscarPorid(Long id) {
		// TODO Auto-generated method stub
		return lancamentoRepository.findById(id);
	}

	@Override
	public Lancamento persistir(Lancamento lancamento) {
		return lancamentoRepository.save(lancamento);
		
	}

	@Override
	public void remover(Long id) {
		lancamentoRepository.deleteById(id);

	}

}
