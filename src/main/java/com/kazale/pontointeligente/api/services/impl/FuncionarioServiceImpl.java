package com.kazale.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.kazale.pontointeligente.api.entities.Funcionario;
import com.kazale.pontointeligente.api.repositories.FuncionarioRepository;
import com.kazale.pontointeligente.api.services.FuncinarioService;

public class FuncionarioServiceImpl implements FuncinarioService {

	@Autowired
	FuncionarioRepository  funcionarioRepository;
	
	Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Override
	public Funcionario persistir(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
		
	}

	@Override
	public Optional<Funcionario> buscaPorCPF(String cpf) {
	return	Optional.ofNullable(funcionarioRepository.findByCpf(cpf));
		
	}

	@Override
	public Optional<Funcionario> buscaPorEmail(String email) {
		return	Optional.ofNullable(funcionarioRepository.findByEmail(email));
	}

	@Override
	public Optional<Funcionario> buscaPorID(Long id) {
		return	funcionarioRepository.findById(id);
	}

}
